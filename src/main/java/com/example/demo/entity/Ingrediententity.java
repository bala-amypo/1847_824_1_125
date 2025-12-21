
package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;


import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity

public class Ingredientenity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    private String unit;

    @Column(nullable = false)
    private BigDecimal costPerUnit;

    private Boolean active = true;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

   
    public Ingredientenity() {}

    
    public Ingredientenity(Long id, String name, String unit,
                           BigDecimal costPerUnit, Boolean active) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.costPerUnit = costPerUnit;
        this.active = active;
    }

    @PrePersist
    public void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    @PreUpdate
    public void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }

    
    public Long getId(){
         return id;
    }
    public void setId(Long id){
     this.id = id;
    }

    public String getName(){
    return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getUnit(){
        return unit;
    }
    public void setUnit(String unit){
        this.unit = unit;
    }

    public BigDecimal getCostPerUnit(){
        return costPerUnit;
    }
    public void setCostPerUnit(BigDecimal costPerUnit){
        this.costPerUnit = costPerUnit;
    }

    public Boolean getActive(){
        return active; 
    }
    public void setActive(Boolean active){
        this.active = active;
    }

    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
    public LocalDateTime getUpdatedAt(){
        return updatedAt;
    }
}

