package com.example.demo.repository;

import com.example.demo.entity.RecipeIngrediententity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecipeIngredientRepository extends JpaRepository<RecipeIngrediententity, Long> {

    List<RecipeIngrediententity> findByMenuItemId(Long menuItemId);

    List<RecipeIngrediententity> findByIngredientId(Long ingredientId);
}
