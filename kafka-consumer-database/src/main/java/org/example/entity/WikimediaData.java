package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "${spring.kafka.topic.name}")
@Getter
@Setter
public class WikimediaData {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "LONGTEXT")
    @Lob
    private String wikiEventData;
}
