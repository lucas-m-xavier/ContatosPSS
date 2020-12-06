package ufes.contatos.business.command;

import ufes.contatos.model.Contato;

public class VerificaEstadoContato implements ContatoStateCommand{

    private Receptor receptor;

    public VerificaEstadoContato(Receptor receptor) {
        this.receptor = receptor;
    }

    @Override
    public boolean execute(Contato contato) {
        return receptor.action(contato);
    }
}
