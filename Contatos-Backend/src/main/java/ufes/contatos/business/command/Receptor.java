package ufes.contatos.business.command;

import ufes.contatos.model.Contato;
import ufes.contatos.repository.ContatoRepository;

public class Receptor {

    private ContatoRepository contatoRepository;

    public Receptor(ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;
    }

    public boolean action(Contato contato) {
        for (Contato c : contatoRepository.findAll()) {
            if(contato.getTelefone() == c.getTelefone())
                return false;
        }

        return true;
    }
}
