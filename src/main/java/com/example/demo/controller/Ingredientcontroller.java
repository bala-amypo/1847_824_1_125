package com.example.demo.controller;

import com.example.demo.entity.Ingredient;
import com.example.demo.service.Ingredientservice;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ingredients")
public class IngredientController {

    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @PostMapping
    public Ingredient createIngredient(@RequestBody Ingredient ingredient) {
        return ingredientService.createIngredient(ingredient);
    }

    @PutMapping("/{id}")
    public Ingredient updateIngredient(
            @PathVariable Long id,
            @RequestBody Ingredient ingredient) {
        return ingredientService.updateIngredient(id, ingredient);
    }

    @GetMapping("/{id}")
    public Ingredient getIngredient(@PathVariable Long id) {
        return ingredientService.getIngredientById(id);
    }

    @GetMapping
    public List<Ingredient> getAllIngredients() {
        return ingredientService.getAllIngredients();
    }

    @PutMapping("/{id}/deactivate")
    public void deactivateIngredient(@PathVariable Long id) {
        ingredientService.deactivateIngredient(id);
    }
}