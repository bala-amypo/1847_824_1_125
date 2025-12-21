
package com.example.demo.controller;

import com.example.demo.entity.Categoryentity;
import com.example.demo.service.Categoryservice;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class Categorycontroller {

    private final Categoryservice service;

    public Categorycontroller(Categoryservice service) {
        this.service = service;
    }

    @PostMapping
    public Categoryentity create(@RequestBody Categoryentity category) {
        return service.create(category);
    }

    @GetMapping
    public List<Categoryentity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Categoryentity getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Categoryentity update(
            @PathVariable Long id,
            @RequestBody Categoryentity category) {
        return service.update(id, category);
    }

    @PutMapping("/{id}/deactivate")
    public void deactivate(@PathVariable Long id) {
        service.deactivate(id);
    }
}
