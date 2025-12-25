package com.example.demo.controller;


import com.example.demo.entity.RecipeIngredient;
import com.example.demo.service.RecipeIngredientService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@RestController
@RequestMapping("/recipe-ingredients")
public class RecipeIngredientController {

    private final RecipeIngredientService service;

    public RecipeIngredientController(RecipeIngredientService service) {
        this.service = service;
    }

    @PostMapping
    public RecipeIngredient add(@RequestBody RecipeIngredient ingredient) {
        return service.add(ingredient);
    }

    @GetMapping("/{menuItemId}")
    public List<RecipeIngredient> getByMenuItem(@PathVariable Long menuItemId) {
        return service.getByMenuItem(menuItemId);
    }
}
