package br.com.danilovolles.events.api.service.implementation;

import br.com.danilovolles.events.api.model.Session;
import br.com.danilovolles.events.api.model.Subscription;
import br.com.danilovolles.events.api.model.User;
import br.com.danilovolles.events.api.repository.SubscriptionRepository;
import br.com.danilovolles.events.api.service.SubscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class SubscriptionServiceImpl implements SubscriptionService {

    private final SubscriptionRepository subscriptionRepository;

    @Override
    public Subscription addSubscription(Subscription subscription) {
        subscription.setCreatedAt(LocalDateTime.now());
        subscription.setUniqueId(UUID.randomUUID().toString());
        return subscriptionRepository.save(subscription);
    }

    @Override
    public List<Subscription> getAllByUser(User user) {
        return subscriptionRepository.findAllBySubscriptionId_User(user);
    }

    @Override
    public List<Subscription> getAllBySession(Session session) {
        return subscriptionRepository.findAllBySubscriptionId_Session(session);
    }
}
