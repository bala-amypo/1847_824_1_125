package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "profit_records")
public class ProfitCalculationRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long menuItemId;
    private Double costPrice;
    private Double sellingPrice;
    private Double profit;

    public ProfitCalculationRecord() {
    }

    public ProfitCalculationRecord(Long id, Long menuItemId, Double costPrice,
                                         Double sellingPrice, Double profit) {
        this.id = id;
        this.menuItemId = menuItemId;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
        this.profit = profit;
    }

    public Long getId() {
        return id;
    }

    public Long getMenuItemId() {
        return menuItemId;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public Double getProfit() {
        return profit;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMenuItemId(Long menuItemId) {
        this.menuItemId = menuItemId;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }
}
