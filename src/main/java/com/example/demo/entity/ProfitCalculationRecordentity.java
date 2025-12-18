
package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.PrePersist;

import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
public class ProfitCalculationRecordentity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String menuItem;
    private BigDecimal totalCost;

    @CreationTimestamp
    private Timestamp calculatedAt;

    @PrePersist
    public void onCreate() {
        this.calculatedAt = new Timestamp(System.currentTimeMillis());
    }

    
    public ProfitCalculationRecordentity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(String menuItem) {
        this.menuItem = menuItem;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    public Timestamp getCalculatedAt() {
        return calculatedAt;
    }

    public void setCalculatedAt(Timestamp calculatedAt) {
        this.calculatedAt = calculatedAt;
    }
}
