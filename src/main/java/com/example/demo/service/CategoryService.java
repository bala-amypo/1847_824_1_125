package com.example.demo.service;

import com.example.demo.entity.CategoryEntity;
import java.util.List;

public interface CategoryService {

    CategoryEntity create(CategoryEntity category);

    List<CategoryEntity> getAll();

    CategoryEntity getById(Long id);

    CategoryEntity update(Long id, CategoryEntity category);

    void deactivate(Long id);
}
