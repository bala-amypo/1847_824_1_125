package com.example.demo.controller;

import com.example.demo.entity.RecipeIngredient;
import com.example.demo.service.RecipeIngredientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recipe-ingredients")
public class RecipeIngredientController {

    private final RecipeIngredientService recipeIngredientService;

    public RecipeIngredientController(RecipeIngredientService recipeIngredientService) {
        this.recipeIngredientService = recipeIngredientService;
    }

    @PostMapping("/add")
    public RecipeIngredient addIngredientToRecipe(
            @RequestParam Long menuItemId,
            @RequestParam Long ingredientId,
            @RequestParam Double quantity) {

        return recipeIngredientService
                .addIngredientToRecipe(menuItemId, ingredientId, quantity);
    }

    @GetMapping("/menu/{menuItemId}")
    public List<RecipeIngredient> getIngredientsByMenuItem(
            @PathVariable Long menuItemId) {

        return recipeIngredientService.getIngredientsByMenuItem(menuItemId);
    }

    @DeleteMapping("/{id}")
    public void removeRecipeIngredient(@PathVariable Long id) {
        recipeIngredientService.removeRecipeIngredient(id);
    }
}
