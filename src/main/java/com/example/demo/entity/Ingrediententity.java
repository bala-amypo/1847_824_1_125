package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;


import java.sql.Timestamp;

@Entity

public class IngredientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    @Column(nullable = false)
    private Double pricePerUnit;

    @Column(nullable = false)
    private Boolean active = true;

    private Timestamp createdAt;

    @PrePersist
    public void onCreate() {
        this.createdAt = new Timestamp(System.currentTimeMillis());
    }

    public IngredientEntity() {
    }

    public IngredientEntity(String name, Double pricePerUnit) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPricePerUnit() {
        return pricePerUnit;
    }

    public Boolean getActive() {
        return active;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPricePerUnit(Double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
