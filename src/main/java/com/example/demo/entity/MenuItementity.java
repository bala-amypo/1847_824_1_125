package com.example.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
public class MenuItementity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    private String description;
    private BigDecimal sellingPrice;
    private Boolean active;

    @CreationTimestamp
    private Timestamp createAt;

    @UpdateTimestamp
    private Timestamp updatedAt;

  
   

    public MenuItementity(Boolean active, Timestamp createAt, String description,
                          Long id, String name, BigDecimal sellingPrice,
                          Timestamp updatedAt) {
        this.active = active;
        this.createAt = createAt;
        this.description = description;
        this.id = id;
        this.name = name;
        this.sellingPrice = sellingPrice;
        this.updatedAt = updatedAt;
    }
     public MenuItementity() {
    }

    }
