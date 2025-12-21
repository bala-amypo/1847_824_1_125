
package com.example.demo.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "profit_records")
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

    // No-Args Constructor
    public ProfitCalculationRecordentity() {}

    // All-Args Constructor
    public ProfitCalculationRecordentity(Long id, MenuItementity menuItem,
                                         BigDecimal totalCost,
                                         BigDecimal profitMargin) {
        this.id = id;
        this.menuItem = menuItem;
        this.totalCost = totalCost;
        this.profitMargin = profitMargin;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public MenuItementity getMenuItem() { return menuItem; }
    public void setMenuItem(MenuItementity menuItem) { this.menuItem = menuItem; }

    public BigDecimal getTotalCost() { return totalCost; }
    public void setTotalCost(BigDecimal totalCost) { this.totalCost = totalCost; }

    public BigDecimal getProfitMargin() { return profitMargin; }
    public void setProfitMargin(BigDecimal profitMargin) { this.profitMargin = profitMargin; }

    public LocalDateTime getCalculatedAt() { return calculatedAt; }
}
