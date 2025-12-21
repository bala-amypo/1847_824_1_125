package com.example.demo.controller;

import com.example.demo.entity.CategoryEntity;
import com.example.demo.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService service;

    public CategoryController(CategoryService service) {
        this.service = service;
    }

    @PostMapping
    public CategoryEntity create(@RequestBody CategoryEntity category) {
        return service.create(category);
    }

    @GetMapping
    public List<CategoryEntity> getAll() {
        return service.getAll();
    }
}
