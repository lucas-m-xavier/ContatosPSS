package ufes.contatos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ufes.contatos.model.Contato;

@Repository
public interface ContatoRepository extends CrudRepository<Contato, Long> {
}
