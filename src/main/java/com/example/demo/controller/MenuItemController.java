package com.example.demo.controller;

import com.example.demo.entity.MenuItemEntity;
import com.example.demo.service.MenuItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu-items")
public class MenuItemController {

    private final MenuItemService service;

    public MenuItemController(MenuItemService service) {
        this.service = service;
    }

    @PostMapping
    public MenuItemEntity create(@RequestBody MenuItemEntity item) {
        return service.create(item);
    }

    @GetMapping
    public List<MenuItemEntity> getAll() {
        return service.getAll();
    }
}
