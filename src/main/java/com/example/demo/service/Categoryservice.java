

package com.example.demo.service;

import com.example.demo.entity.Categoryentity;

import java.util.List;

public interface Categoryservice {

    Categoryentity createCategory(Categoryentity category);

    Categoryentity updateCategory(Long id, Categoryentity category);

    Categoryentity getCategoryById(Long id);

    List<Categoryentity> getAllCategories();

    void deleteCategory(Long id);
}

