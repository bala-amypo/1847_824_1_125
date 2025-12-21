

package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity

public class ProfitCalculationRecordentity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "menu_item_id")
    private MenuItementity menuItem;

    private BigDecimal totalCost;
    private BigDecimal profitMargin;

    private LocalDateTime calculatedAt = LocalDateTime.now();

   
    public ProfitCalculationRecordentity() {}

    public ProfitCalculationRecordentity(Long id, MenuItementity menuItem,
                                         BigDecimal totalCost,
                                         BigDecimal profitMargin) {
        this.id = id;
        this.menuItem = menuItem;
        this.totalCost = totalCost;
        this.profitMargin = profitMargin;
    }

   
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public MenuItementity getMenuItem(){
        return menuItem;
    }
    public void setMenuItem(MenuItementity menuItem){
        this.menuItem = menuItem; 
    }

    public BigDecimal getTotalCost(){
        return totalCost; 
    }
    public void setTotalCost(BigDecimal totalCost){
        this.totalCost = totalCost; 
    }

    public BigDecimal getProfitMargin(){
        return profitMargin; 
    }
    public void setProfitMargin(BigDecimal profitMargin){
        this.profitMargin = profitMargin; 
    }

    public LocalDateTime getCalculatedAt(){
        return calculatedAt; 
    }
}
