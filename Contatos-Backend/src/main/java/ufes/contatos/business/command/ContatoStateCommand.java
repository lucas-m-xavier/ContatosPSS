package ufes.contatos.business.command;

import ufes.contatos.model.Contato;

public interface ContatoStateCommand {

    public boolean execute(Contato contato);

}
