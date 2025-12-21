

package com.example.demo.service;

import com.example.demo.entity.RecipeIngrediententity;

import java.util.List;

public interface RecipeIngredientservice {

    RecipeIngrediententity addIngredientToRecipe(RecipeIngrediententity recipeIngredient);

    List<RecipeIngrediententity> getIngredientsByMenuItem(Long menuItemId);

    void removeIngredient(Long id);
}
