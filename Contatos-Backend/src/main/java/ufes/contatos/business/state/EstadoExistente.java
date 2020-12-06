package ufes.contatos.business.state;

import lombok.NoArgsConstructor;
import ufes.contatos.model.Contato;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
public class EstadoExistente extends ContatoState{

    public EstadoExistente(Contato contato) {
        super(contato);
    }
}
