package br.com.danilovolles.events.api.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class SubscriptionId {

    // é necessário criar um objeto com duas chaves estrangeiras para servir de id para aquela classe

    @ManyToOne
    @JoinColumn(name = "subscribed_user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "session_id")
    private Session session;

}
