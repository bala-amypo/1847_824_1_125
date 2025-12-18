package com.example.demo.service;
import jakarta.persistence.service;
import com.example.demo.entity.Categoryentity;
@Service
public interface Categoryservice{
    public Category createCategory(Category category);
    public Category updateCategory(Long id,Category category);
    public Category getCategoryById(Long id);
    public Category getAllCategory();
    public Category deactiveCategory(Long id);
}