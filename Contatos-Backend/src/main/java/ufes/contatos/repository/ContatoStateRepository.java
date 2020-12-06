package ufes.contatos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ufes.contatos.business.state.ContatoState;

@Repository
public interface ContatoStateRepository extends CrudRepository<ContatoState, Long> {
}
