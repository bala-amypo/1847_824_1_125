package com.example.demo.service;

import com.example.demo.entity.Category;
import java.util.List;

public interface CategoryService {

    Category create(Category category);

    List<Category> getAll();

    Category getById(Long id);

    Category update(Long id, Category category);

    void deactivate(Long id);
}
