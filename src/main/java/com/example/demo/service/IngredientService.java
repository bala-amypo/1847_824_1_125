

package com.example.demo.service;

import com.example.demo.entity.IngredientEntity;
import java.util.List;

public interface IngredientService {

    IngredientEntity createIngredient(IngredientEntity ingredient);

    List<IngredientEntity> getAllIngredients();

    IngredientEntity getIngredientById(Long id);

    IngredientEntity updateIngredient(Long id, IngredientEntity ingredient);

    void deactivateIngredient(Long id);
}

