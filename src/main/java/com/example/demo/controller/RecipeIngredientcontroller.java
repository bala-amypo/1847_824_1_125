

package com.example.demo.controller;

import com.example.demo.entity.RecipeIngrediententity;
import com.example.demo.service.RecipeIngredientservice;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recipe-ingredients")
public class RecipeIngredientcontroller {

    private final RecipeIngredientservice service;

    public RecipeIngredientcontroller(RecipeIngredientservice service) {
        this.service = service;
    }

    @PostMapping
    public RecipeIngrediententity add(@RequestBody RecipeIngrediententity recipe) {
        return service.add(recipe);
    }

    @GetMapping("/menu/{menuItemId}")
    public List<RecipeIngrediententity> getByMenuItem(
            @PathVariable Long menuItemId) {
        return service.getByMenuItem(menuItemId);
    }

    @PutMapping("/{id}")
    public RecipeIngrediententity update(
            @PathVariable Long id,
            @RequestBody RecipeIngrediententity recipe) {
        return service.update(id, recipe);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
