package ufes.contatos.business.state;

import ufes.contatos.model.Contato;

import javax.persistence.Entity;

@Entity
public class EstadoNovo extends ContatoState{

    public EstadoNovo(Contato contato) {
        super(contato);
    }

    public EstadoNovo() {
    }


}
