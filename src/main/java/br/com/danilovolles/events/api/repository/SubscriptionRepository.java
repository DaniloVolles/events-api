package br.com.danilovolles.events.api.repository;

import br.com.danilovolles.events.api.model.Session;
import br.com.danilovolles.events.api.model.Subscription;
import br.com.danilovolles.events.api.model.SubscriptionId;
import br.com.danilovolles.events.api.model.User;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface SubscriptionRepository extends ListCrudRepository<Subscription, SubscriptionId> {
    List<Subscription> findAllBySubscriptionId_User(User user);
    List<Subscription> findAllBySubscriptionId_Session(Session session);
}
