package ufes.contatos.business.state;

import lombok.NoArgsConstructor;
import ufes.contatos.model.Contato;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
public class EstadoNovo extends ContatoState{

    public EstadoNovo(Contato contato) {
        super(contato);
    }
}
