package com.example.demo.service;

import com.example.demo.entity.RecipeIngredientEntity;
import java.util.List;

public interface RecipeIngredientService {

    RecipeIngredientEntity add(RecipeIngredientEntity ingredient);

    List<RecipeIngredientEntity> getByMenuItem(Long menuItemId);

    void delete(Long id);
}
