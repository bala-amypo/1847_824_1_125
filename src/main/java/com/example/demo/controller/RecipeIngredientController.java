package com.example.demo.controller;

import com.example.demo.entity.RecipeIngredientEntity;
import com.example.demo.service.RecipeIngredientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipe-ingredients")
public class RecipeIngredientController {

    private final RecipeIngredientService service;

    public RecipeIngredientController(RecipeIngredientService service) {
        this.service = service;
    }

    @PostMapping
    public RecipeIngredientEntity add(@RequestBody RecipeIngredientEntity ingredient) {
        return service.add(ingredient);
    }

    @GetMapping("/{menuItemId}")
    public List<RecipeIngredientEntity> getByMenuItem(@PathVariable Long menuItemId) {
        return service.getByMenuItem(menuItemId);
    }
}
