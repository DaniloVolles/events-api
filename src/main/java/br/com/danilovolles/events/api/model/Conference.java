package br.com.danilovolles.events.api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tbl_conference")
public class Conference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "conference_id")
    private Integer id;

    @Column(name = "conference_name", length = 100, nullable = false)
    private String name;

    @Column(name = "conference_address", length = 255, nullable = false)
    private String address;
}
