package br.com.danilovolles.events.api.repository;

import br.com.danilovolles.events.api.model.Session;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends ListCrudRepository<Session, Integer> {
}
