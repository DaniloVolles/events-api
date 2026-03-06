package br.com.danilovolles.events.api.repository;

import br.com.danilovolles.events.api.model.Conference;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConferenceRepository extends ListCrudRepository<Conference, Integer> {
}
