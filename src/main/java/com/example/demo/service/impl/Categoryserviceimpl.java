
package com.example.demo.service.impl;

import com.example.demo.entity.Categoryentity;
import com.example.demo.repository.CategoryResposiory;
import com.example.demo.service.Categoryservice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Categoryserviceimpl implements Categoryservice {

    private final CategoryResposiory repository;

    public Categoryserviceimpl(CategoryResposiory repository) {
        this.repository = repository;
    }

    @Override
    public Categoryentity create(Categoryentity category) {
        return repository.save(category);
    }

    @Override
    public List<Categoryentity> getAll() {
        return repository.findAll();
    }

    @Override
    public Categoryentity getById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public Categoryentity update(Long id, Categoryentity category) {
        category.setId(id);
        return repository.save(category);
    }

    @Override
    public void deactivate(Long id) {
        Categoryentity category = getById(id);
        category.setActive(false);
        repository.save(category);
    }
}
