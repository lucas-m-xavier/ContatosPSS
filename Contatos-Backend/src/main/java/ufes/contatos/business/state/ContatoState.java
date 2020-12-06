package ufes.contatos.business.state;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ufes.contatos.business.command.ContatoStateCommand;
import ufes.contatos.model.Contato;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public abstract class ContatoState {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "estado")
    private Contato contato;

    @Transient
    private ContatoStateCommand contatoStateCommand;

    public ContatoState(Contato contato) {
        this.contato = contato;

        //if (contatoStateCommand.execute(contato))
            //contato.setEstado(new EstadoExistente(contato));
    }
}
