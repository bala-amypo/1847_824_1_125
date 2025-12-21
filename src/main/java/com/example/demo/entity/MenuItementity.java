
package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


import java.math.BigDecimal;

@Entity

public class MenuItementity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    private BigDecimal sellingPrice;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Categoryentity category;

    private Boolean active = true;

    public MenuItementity() {}

  
    public MenuItementity(Long id, String name, BigDecimal sellingPrice,
                          Categoryentity category, Boolean active) {
        this.id = id;
        this.name = name;
        this.sellingPrice = sellingPrice;
        this.category = category;
        this.active = active;
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

    public BigDecimal getSellingPrice(){
        return sellingPrice;
    }
    public void setSellingPrice(BigDecimal sellingPrice){
        this.sellingPrice = sellingPrice;
    }

    public Categoryentity getCategory(){
        return category;
    }
    public void setCategory(Categoryentity category){
        this.category = category;
    }

    public Boolean getActive(){
        return active;
    }
    public void setActive(Boolean active){
        this.active = active; 
    }
}
