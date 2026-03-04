package br.com.danilovolles.events.api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "tbl_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_name", length = 250, nullable = false)
    private String name;

    @Column(name = "user_email", length = 250, nullable = false, unique = true)
    private String email;

    @ManyToMany(mappedBy = "users")
    private List<Session> sessions;
}
