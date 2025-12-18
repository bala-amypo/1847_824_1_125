package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.lang.Boolean;
import jakarta.persistence.Column;
@Entity
public class Categoryentity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    private String description;
    private Boolean active;

    






   
    }
