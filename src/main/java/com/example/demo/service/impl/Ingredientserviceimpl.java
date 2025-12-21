

package com.example.demo.service.impl;

import com.example.demo.entity.Ingrediententity;
import com.example.demo.repository.IngredientRepository;
import com.example.demo.service.Ingredientservice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Ingredientserviceimpl implements Ingredientservice {

    private final IngredientRepository repository;

    public Ingredientserviceimpl(IngredientRepository repository) {
        this.repository = repository;
    }

    @Override
    public Ingrediententity create(Ingrediententity ingredient) {
        return repository.save(ingredient);
    }

    @Override
    public Ingrediententity update(Long id, Ingrediententity ingredient) {
        Ingrediententity existing = getById(id);
        existing.setName(ingredient.getName());
        existing.setUnit(ingredient.getUnit());
        existing.setCostPerUnit(ingredient.getCostPerUnit());
        return repository.save(existing);
    }

    @Override
    public Ingrediententity getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ingredient not found"));
    }

    @Override
    public List<Ingrediententity> getAll() {
        return repository.findAll();
    }

    @Override
    public void deactivate(Long id) {
        Ingrediententity ingredient = getById(id);
        ingredient.setActive(false);
        repository.save(ingredient);
    }
}

