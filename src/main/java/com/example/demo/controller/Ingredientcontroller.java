package com.example.demo.controller;

import com.example.demo.entity.Ingrediententity;
import com.example.demo.service.Ingredientservice;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredients")
public class Ingredientcontroller {

    private final Ingredientservice ingredientservice;

    public Ingredientcontroller(Ingredientservice ingredientservice) {
        this.ingredientservice = ingredientservice;
    }

    @PostMapping
    public Ingrediententity create(@RequestBody Ingrediententity ingredient) {
        return ingredientservice.createIngredient(ingredient);
    }

    @GetMapping
    public List<Ingrediententity> getAll() {
        return ingredientservice.getAllIngredients();
    }

    @DeleteMapping("/{id}")
    public void deactivate(@PathVariable Long id) {
        ingredientservice.deactivateIngredient(id);
    }
}


