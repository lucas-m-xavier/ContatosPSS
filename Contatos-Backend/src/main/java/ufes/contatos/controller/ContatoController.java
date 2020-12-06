package ufes.contatos.controller;

import org.springframework.web.bind.annotation.*;
import ufes.contatos.model.Contato;
import ufes.contatos.repository.ContatoRepository;
import ufes.contatos.repository.ContatoStateRepository;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ContatoController {

    private final ContatoRepository contatoRepository;
    private final ContatoStateRepository contatoStateRepository;

    public ContatoController(ContatoRepository contatoRepository, ContatoStateRepository contatoStateRepository) {
        this.contatoRepository = contatoRepository;
        this.contatoStateRepository = contatoStateRepository;
    }

    @GetMapping("/contatos")
    public List<Contato> getContatos() {
        return (List<Contato>) contatoRepository.findAll();
    }

    @PostMapping("/contatos")
    void addContato(@RequestBody Contato contato) {
        contatoRepository.save(contato);
    }
}
