package br.com.danilovolles.events.api.controller;

import br.com.danilovolles.events.api.model.Session;
import br.com.danilovolles.events.api.model.Subscription;
import br.com.danilovolles.events.api.model.User;
import br.com.danilovolles.events.api.service.SubscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("subscriptions")
@RequiredArgsConstructor
public class SubscriptionController {

    private final SubscriptionService subscriptionService;

    @PostMapping
    public ResponseEntity<Subscription> createSubscription(@RequestBody Subscription subscription) {
        var addedSubscription = subscriptionService.addSubscription(subscription);
        return ResponseEntity.ok().body(addedSubscription);
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Subscription>> getByUser(@PathVariable(name = "userId") Integer id) {
        var user = new User();
        user.setUserId(id);
        var subscriptions = subscriptionService.getAllByUser(user);
        return ResponseEntity.ok().body(subscriptions);
    }

    @GetMapping("/sessions/{sessionId}")
    public ResponseEntity<List<Subscription>> getBySession (@PathVariable(name = "sessionId") Integer id) {
        var session = new Session();
        session.setSessionId(id);
        var subscriptions = subscriptionService.getAllBySession(session);
        return ResponseEntity.ok().body(subscriptions);
    }
}
