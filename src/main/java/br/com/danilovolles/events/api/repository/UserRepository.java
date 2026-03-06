package br.com.danilovolles.events.api.repository;

import br.com.danilovolles.events.api.model.User;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ListCrudRepository<User, Integer> {
}
