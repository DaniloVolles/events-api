package br.com.danilovolles.events.api.service;

import br.com.danilovolles.events.api.model.Session;
import br.com.danilovolles.events.api.model.Subscription;
import br.com.danilovolles.events.api.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SubscriptionService {
    Subscription addSubscription(Subscription subscription);
    List<Subscription> getAllByUser(User user);
    List<Subscription> getAllBySession(Session session);

}
