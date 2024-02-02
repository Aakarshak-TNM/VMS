package com.technman.vms.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "consultant")
@Data
public class Consultant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String contact;
}
