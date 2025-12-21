package com.example.demo.service.impl;

import com.example.demo.entity.CategoryEntity;
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
    public CategoryEntity create(CategoryEntity category) {
        category.setActive(true);
        return repository.save(category);
    }

    @Override
    public List<CategoryEntity> getAll() {
        return repository.findAll();
    }

    @Override
    public CategoryEntity getById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public CategoryEntity update(Long id, CategoryEntity category) {
        CategoryEntity existing = getById(id);
        existing.setName(category.getName());
        return repository.save(existing);
    }

    @Override
    public void deactivate(Long id) {
        CategoryEntity existing = getById(id);
        existing.setActive(false);
        repository.save(existing);
    }
}
