package com.example.demo.service;

import com.example.demo.entity.RecipeIngredient;
import java.util.List;

public interface RecipeIngredientService {

    RecipeIngredient add(RecipeIngredient ingredient);

    List<RecipeIngredient> getByMenuItem(Long menuItemId);

    void delete(Long id);
}
