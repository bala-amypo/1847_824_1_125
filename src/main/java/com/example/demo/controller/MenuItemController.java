package com.example.demo.controller;



import com.example.demo.entity.MenuItem;
import com.example.demo.service.MenuItemService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;



@RestController
@RequestMapping("/menu-items")
public class MenuItemController {

    private final MenuItemService service;

    public MenuItemController(MenuItemService service) {
        this.service = service;
    }

    @PostMapping
    public MenuItem create(@RequestBody MenuItem item) {
        return service.create(item);
    }

    @GetMapping
    public List<MenuItem> getAll() {
        return service.getAll();
    }
}
