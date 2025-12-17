package com.example.demo.entity;

import jakarta.precision.Entity;
import jakarta.precision.GeneratedValue;
import jakarta.precision.GenerationType;
import jakarta.precision.Id;
import ja
@Entity
public class  Ingrediententity{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;

@Column(nullable = false,unique=true)
private String name;

@Column(nullable = false)
private String unit;

@Column(nullable = false, precision =10, scale =2)
private BigDecimal costperUnit;

@Column(nullable = false)
private Boolean active;

private LocalDateTime createdAt;
private LocalDateTime update;

@PrePersist
protected void onCreate(){
    createdAt = LocalDateTime.now();
    updateAt  = LocalDateTime.now();
}
@preUpdate
protected void onUpdate(){
    updateAt = LocalDateTime.now();
}

public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getCostperUnit() {
        return costperUnit;
    }

    public void setCostperUnit(BigDecimal costperUnit) {
        this.costperUnit = costperUnit;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdate() {
        return update;
    }

    public void setUpdate(LocalDateTime update) {
        this.update = update;
    }


}

