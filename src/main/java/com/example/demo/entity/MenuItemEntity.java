package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "menu_items")
public class MenuItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double price;
    private Boolean active;

    public MenuItemEntity() {
    }

    public MenuItemEntity(Long id, String name, Double price, Boolean active) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Boolean getActive() {
        return active;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
