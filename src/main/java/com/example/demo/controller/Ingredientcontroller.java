
package com.example.demo.controller;

import com.example.demo.entity.Ingrediententity;
import com.example.demo.service.Ingredientservice;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredients")
public class Ingredientcontroller {

    private final Ingredientservice service;

    public Ingredientcontroller(Ingredientservice service) {
        this.service = service;
    }

    @PostMapping
    public Ingrediententity create(@RequestBody Ingrediententity ingredient) {
        return service.create(ingredient);
    }

    @GetMapping
    public List<Ingrediententity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Ingrediententity getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Ingrediententity update(
            @PathVariable Long id,
            @RequestBody Ingrediententity ingredient) {
        return service.update(id, ingredient);
    }

    @DeleteMapping("/{id}")
    public void deactivate(@PathVariable Long id) {
        service.deactivate(id);
    }
}
