package com.example.demo.service.impl;

import com.example.demo.entity.Category;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository repository;

    public CategoryServiceImpl(CategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public Category create(Category category) {
        category.setActive(true);
        return repository.save(category);
    }

    @Override
    public List<Category> getAll() {
        return repository.findAll();
    }

    @Override
    public Category getById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public Category update(Long id, Category category) {
        Category existing = getById(id);
        existing.setName(category.getName());
        return repository.save(existing);
    }

    @Override
    public void deactivate(Long id) {
        Category existing = getById(id);
        existing.setActive(false);
        repository.save(existing);
    }
}
