
package com.example.demo.repository;

import com.example.demo.entity.Ingredientenity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IngredientRespository
        extends JpaRepository<Ingrediententity, Long> {

    boolean existsByName(String name);

    Optional<Ingrediententity> findByName(String name);
}
