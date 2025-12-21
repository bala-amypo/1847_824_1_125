package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "recipe_ingredients")
public class RecipeIngredientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long menuItemId;
    private String ingredientName;
    private Double quantity;

    public RecipeIngredientEntity() {
    }

    public RecipeIngredientEntity(Long id, Long menuItemId, String ingredientName, Double quantity) {
        this.id = id;
        this.menuItemId = menuItemId;
        this.ingredientName = ingredientName;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public Long getMenuItemId() {
        return menuItemId;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMenuItemId(Long menuItemId) {
        this.menuItemId = menuItemId;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }
}
