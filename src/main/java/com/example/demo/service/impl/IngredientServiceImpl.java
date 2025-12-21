
package com.example.demo.service.impl;

import com.example.demo.entity.IngredientEntity;
import com.example.demo.repository.IngredientRepository;
import com.example.demo.service.IngredientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientServiceImpl implements IngredientService {

    private final IngredientRepository ingredientRepository;

    public IngredientServiceImpl(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public IngredientEntity createIngredient(IngredientEntity ingredient) {
        return ingredientRepository.save(ingredient);
    }

    @Override
    public List<IngredientEntity> getAllIngredients() {
        return ingredientRepository.findAll();
    }

    @Override
    public IngredientEntity getIngredientById(Long id) {
        return ingredientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ingredient not found"));
    }

    @Override
    public IngredientEntity updateIngredient(Long id, IngredientEntity ingredient) {
        IngredientEntity existing = getIngredientById(id);
        existing.setName(ingredient.getName());
        existing.setCost(ingredient.getCost());
        return ingredientRepository.save(existing);
    }

    @Override
    public void deactivateIngredient(Long id) {
        IngredientEntity ingredient = getIngredientById(id);
        ingredient.setActive(false);
        ingredientRepository.save(ingredient);
    }
}

