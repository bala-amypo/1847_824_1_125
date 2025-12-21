

package com.example.demo.repository;

import com.example.demo.entity.Ingrediententity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingrediententity, Long> {
}
