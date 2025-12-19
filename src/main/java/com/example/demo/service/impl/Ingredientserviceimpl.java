package com.example.demo.service.impl;

import com.example.demo.entity.Ingredient;
import com.example.demo.repository.IngredientRepository;
import com.example.demo.service.Ingredientservice;
import org.springframework.stereotype.service;
import java.util.List;

@Service
public class Ingredientserviceimpl implements Ingredientservice{

    private final IngredientRepository ingredientRepository;
    public Ingredientserviceimpl(IngredientRepository ingredientRepository){
        this.ingredientRepository=ingredientRepository;
    }
    @Override
   @Override
    public Ingredient createIngredient(Ingredient ingredient) {
        return ingredientRepository.save(ingredient);
    }

    @Override
    public Ingredient updateIngredient(Long id, Ingredient ingredient) {
        Ingredient existing = ingredientRepository.findById(id).orElseThrow();
        existing.setName(ingredient.getName());
        existing.setUnit(ingredient.getUnit());
        existing.setCostPerUnit(ingredient.getCostPerUnit());
        existing.setActive(ingredient.getActive());
        return ingredientRepository.save(existing);
    }

    @Override
    public Ingredient getIngredientById(Long id) {
        return ingredientRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Ingredient> getAllIngredients() {
        return ingredientRepository.findAll();
    }

    @Override
    public void deactivateIngredient(Long id) {
        Ingredient ingredient = ingredientRepository.findById(id).orElseThrow();
        ingredient.setActive(false);
        ingredientRepository.save(ingredient);
    }
}
}