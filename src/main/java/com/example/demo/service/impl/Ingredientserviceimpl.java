package com.example.demo.service.impl;

import com.example.demo.entity.Ingrediententity;
import com.example.demo.repository.IngredientRepository;
import com.example.demo.service.Ingredientservice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Ingredientserviceimpl implements Ingredientservice {

    private final IngredientRepository ingredientRepository;

    public Ingredientserviceimpl(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public Ingrediententity createIngredient(Ingrediententity ingredient) {
        return ingredientRepository.save(ingredient);
    }

    @Override
    public List<Ingrediententity> getAllIngredients() {
        return ingredientRepository.findAll();
    }

    @Override
    public Ingrediententity getIngredientById(Long id) {
        return ingredientRepository.findById(id).orElseThrow();
    }

    @Override
    public Ingrediententity updateIngredient(Long id, Ingrediententity ingredient) {
        Ingrediententity existing = getIngredientById(id);
        existing.setName(ingredient.getName());
        existing.setPricePerUnit(ingredient.getPricePerUnit());
        return ingredientRepository.save(existing);
    }

    @Override
    public void deactivateIngredient(Long id) {
        Ingrediententity ingredient = getIngredientById(id);
        ingredient.setActive(false);
        ingredientRepository.save(ingredient);
    }
}
