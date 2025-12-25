// package com.example.demo.repository;

// import com.example.demo.entity.RecipeIngredientEntity;
// import org.springframework.data.jpa.repository.JpaRepository;

// import java.util.List;

// public interface RecipeIngredientRepository
//         extends JpaRepository<RecipeIngredientEntity, Long> {

//     List<RecipeIngredientEntity> findByMenuItemId(Long menuItemId);
// }



// package com.example.demo.repository;

// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.jpa.repository.JpaRepository;

// public interface RecipeIngredientRepository extends JpaRepository<Object, Long> {

//     @Query("SELECT SUM(r.quantity) FROM RecipeIngredient r WHERE r.ingredient.id = :ingredientId")
//     Double getTotalQuantityByIngredientId(Long ingredientId);
// }

package com.example.demo.repository;

import com.example.demo.entity.RecipeIngredientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecipeIngredientRepository
        extends JpaRepository<RecipeIngredientEntity, Long> {

    List<RecipeIngredientEntity> findByMenuItemId(Long menuItemId);
}
