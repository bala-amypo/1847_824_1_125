
package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity

public class RecipeIngrediententity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "menu_item_id")
    private MenuItementity menuItem;

    @ManyToOne
    @JoinColumn(name = "ingredient_id")
    private Ingredientenity ingredient;

    private Double quantityRequired;

   
    public RecipeIngrediententity() {}

    
    public RecipeIngrediententity(Long id, MenuItementity menuItem,
                                  Ingredientenity ingredient,
                                  Double quantityRequired) {
        this.id = id;
        this.menuItem = menuItem;
        this.ingredient = ingredient;
        this.quantityRequired = quantityRequired;
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

    public Ingredientenity getIngredient(){
        return ingredient;
    }
    public void setIngredient(Ingrediententity ingredient){
        this.ingredient = ingredient;
    }

    public Double getQuantityRequired(){
        return quantityRequired;
    }
    public void setQuantityRequired(Double quantityRequired){
        this.quantityRequired = quantityRequired; 
    }
}