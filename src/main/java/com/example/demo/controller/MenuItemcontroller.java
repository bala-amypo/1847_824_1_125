package com.example.demo.controller;

import com.example.demo.entity.MenuItementity;
import com.example.demo.service.MenuItemservice;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menu-items")
public class MenuItemcontroller {

    private final MenuItemservice service;

    public MenuItemcontroller(MenuItemservice service) {
        this.service = service;
    }

    @PostMapping
    public MenuItementity create(@RequestBody MenuItementity item) {
        return service.create(item);
    }
    @GetMapping
    public List<MenuItementity> getAll() {
        return service.getAll();
    }
   @GetMapping("/{id}")
    public MenuItementity getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public MenuItementity update(
            @PathVariable Long id,
            @RequestBody MenuItementity item) {
        return service.update(id, item);
    }

    @PutMapping("/{id}/deactivate")
    public void deactivate(@PathVariable Long id) {
        service.deactivate(id);
    }
}
