package com.goit.java_dev_module14_springData.feature.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "note")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    private String content;
}
