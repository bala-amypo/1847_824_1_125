
package com.example.demo.service.impl;

import com.example.demo.entity.RecipeIngrediententity;
import com.example.demo.repository.RecipeIngredientRepository;
import com.example.demo.service.RecipeIngredientservice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeIngredientserviceimpl implements RecipeIngredientservice {

    private final RecipeIngredientRepository repository;

    public RecipeIngredientserviceimpl(RecipeIngredientRepository repository) {
        this.repository = repository;
    }

    @Override
    public RecipeIngrediententity add(RecipeIngrediententity recipe) {
        return repository.save(recipe);
    }

    @Override
    public List<RecipeIngrediententity> getByMenuItem(Long menuItemId) {
        return repository.findByMenuItemId(menuItemId);
    }

    @Override
    public RecipeIngrediententity update(Long id, RecipeIngrediententity recipe) {
        recipe.setId(id);
        return repository.save(recipe);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}