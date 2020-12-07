package ufes.contatos.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import ufes.contatos.business.command.VerificaEstadoContato;
import ufes.contatos.business.state.ContatoState;
import ufes.contatos.business.state.EstadoExistente;
import ufes.contatos.business.state.EstadoNovo;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String telefone;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private ContatoState estado;

    public Contato(String nome, String telefone, VerificaEstadoContato verificaEstadoContato) {
        this.nome = nome;
        this.telefone = telefone;

        this.estado = new EstadoNovo(this);

        if (!verificaEstadoContato.execute(this))
            this.estado = new EstadoExistente(this);
    }
    
    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
}
