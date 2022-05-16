package com.pro2umanizales.registersms.infrastructure.repositories.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Register {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Basic
    @Column(name = "name", nullable = false, length = 50)
    private String name;
    @Basic
    @Column(name = "last_name", nullable = false, length = 70)
    private String lastName;
    @Basic
    @Column(name = "date_read", nullable = false)
    private LocalDateTime dateRead;
}
