package com.example.demo.service;
import jakarta.persistence.service;
import com.example.demo.entity.Ingrediententity;
@Service
public interface Ingredientservice{
    public Ingredient createIngredient(Ingredient ingredient);
    public Ingredient updateIngredient(Long id,Ingredient ingredient);
    public Ingredient getIngredientById(Long id);
    public Ingredient getAllIngredient();
    public Ingredient deactivateInggredient();
    

}

