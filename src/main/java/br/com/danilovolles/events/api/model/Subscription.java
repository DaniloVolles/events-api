package br.com.danilovolles.events.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tbl_subscription")
public class Subscription {

    //Chave composta, são duas chaves estrangeiras
    //Foi transformado um relacionamento muitos para muitos em dois relacionamentos um para muitos

    @Id
    private SubscriptionId subscriptionId;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "level")
    private Integer level;

    @Column(name = "unique_id", length = 45, nullable = false, unique = true)
    private String uniqueId;
}
