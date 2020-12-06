package ufes.contatos.business.state;

import ufes.contatos.model.Contato;

import javax.persistence.Entity;

@Entity
public class EstadoExistente extends ContatoState{

    public EstadoExistente(Contato contato) {
        super(contato);
    }

    public EstadoExistente() {
    }
}
