
package com.example.demo.service.impl;

import com.example.demo.entity.Ingredientenity;
import com.example.demo.repository.IngredientRespository;
import com.example.demo.service.Ingredientservice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Ingredientserviceimpl implements Ingredientservice {

    private final IngredientRespository repository;

    public Ingredientserviceimpl(IngredientRespository repository) {
        this.repository = repository;
    }

    @Override
    public Ingredientenity create(Ingrediententity ingredient) {
        return repository.save(ingredient);
    }

    @Override
    public List<Ingrediententity> getAll() {
        return repository.findAll();
    }

    @Override
    public Ingredientenity getById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public Ingredientenity update(Long id, Ingredientenity ingredient) {
        ingredient.setId(id);
        return repository.save(ingredient);
    }

    @Override
    public void deactivate(Long id) {
        Ingredientenity ingredient = getById(id);
        ingredient.setActive(false);
        repository.save(ingredient);
    }
}
