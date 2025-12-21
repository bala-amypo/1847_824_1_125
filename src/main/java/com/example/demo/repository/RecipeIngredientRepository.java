package com.example.demo.repository;

import com.example.demo.entity.RecipeIngredientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecipeIngredientRepository
        extends JpaRepository<RecipeIngredientEntity, Long> {

    List<RecipeIngredientEntity> findByMenuItemId(Long menuItemId);
}
