

package com.example.demo.controller;

// import com.example.demo.entity.IngredientEntity;
// import com.example.demo.service.IngredientService;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;

import com.example.demo.entity.IngredientEntity;
import com.example.demo.service.IngredientService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("/api/ingredients")
public class IngredientController {

    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @PostMapping
    public IngredientEntity create(@RequestBody IngredientEntity ingredient) {
        return ingredientService.createIngredient(ingredient);
    }

    @GetMapping
    public List<IngredientEntity> getAll() {
        return ingredientService.getAllIngredients();
    }

    @GetMapping("/{id}")
    public IngredientEntity getById(@PathVariable Long id) {
        return ingredientService.getIngredientById(id);
    }

    @PutMapping("/{id}")
    public IngredientEntity update(
            @PathVariable Long id,
            @RequestBody IngredientEntity ingredient) {
        return ingredientService.updateIngredient(id, ingredient);
    }

    @DeleteMapping("/{id}")
    public void deactivate(@PathVariable Long id) {
        ingredientService.deactivateIngredient(id);
    }
}
