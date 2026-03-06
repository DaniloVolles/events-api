package br.com.danilovolles.events.api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "tbl_session")
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "session_id", nullable = false)
    private Integer idSession;

    @Column(name = "session_title", nullable = false)
    private String title;

    @Column(name = "session_start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "session_start_time", nullable = false)
    private LocalTime startTime;

    @ManyToOne
    @JoinColumn(name = "tbl_conference_id_conference")
    private Conference conference;

}
