
package com.example.demo.controller;

import com.example.demo.entity.Ingredientenity;
import com.example.demo.service.Ingredientservice;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ingredients")
public class Ingredientcontroller {

    private final Ingredientservice service;

    public Ingredientcontroller(Ingredientservice service) {
        this.service = service;
    }

    @PostMapping
    public Ingredientenity create(@RequestBody Ingredientenity ingredient) {
        return service.create(ingredient);
    }

    @GetMapping
    public List<Ingrediententity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Ingredientenity getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Ingredientenity update(
            @PathVariable Long id,
            @RequestBody Ingredientenity ingredient) {
        return service.update(id, ingredient);
    }

    @PutMapping("/{id}/deactivate")
    public void deactivate(@PathVariable Long id) {
        service.deactivate(id);
    }
}