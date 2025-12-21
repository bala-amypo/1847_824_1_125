
package com.example.demo.service;

import com.example.demo.entity.Ingredientenity;

import java.util.List;

public interface Ingredientservice {

    Ingredientenity createIngredient(Ingrediententity ingredient);

    Ingredientenity updateIngredient(Long id, Ingredientenity ingredient);

    Ingredientenity getIngredientById(Long id);

    List<Ingrediententity> getAllIngredients();

    void deleteIngredient(Long id);
}
