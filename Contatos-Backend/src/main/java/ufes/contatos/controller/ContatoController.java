package ufes.contatos.controller;

import org.springframework.web.bind.annotation.*;
import ufes.contatos.business.command.Receptor;
import ufes.contatos.business.command.VerificaEstadoContato;
import ufes.contatos.business.state.EstadoExistente;
import ufes.contatos.business.state.EstadoNovo;
import ufes.contatos.model.Contato;
import ufes.contatos.repository.ContatoRepository;

import java.util.List;

@RestController
@RequestMapping("/")
public class ContatoController {

    private ContatoRepository contatoRepository;
    private Receptor receptor;
    VerificaEstadoContato verificaEstadoContato;

    public ContatoController(ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;
        receptor = new Receptor(contatoRepository);
        verificaEstadoContato = new VerificaEstadoContato(receptor);
    }

    @GetMapping
    public List<Contato> getContatos() {
        return (List<Contato>) contatoRepository.findAll();
    }

    @PostMapping
    public void addContato(@RequestBody Contato contato) {
        if(verificaEstadoContato.execute(contato)) {
            contato.setEstado(new EstadoNovo(contato));
        }   else {
            contato.setEstado(new EstadoExistente(contato));
        }

        contatoRepository.save(contato);
    }
}
