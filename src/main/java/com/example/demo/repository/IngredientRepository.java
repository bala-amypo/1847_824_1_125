📄 1. Entity

File name: IngredientEntity.java

package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ingredients")
public class IngredientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    private Double cost;

    private Boolean active = true;

    public IngredientEntity() {
    }

    public IngredientEntity(String name, Double cost) {
        this.name = name;
        this.cost = cost;
        this.active = true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}

📄 2. Repository

File name: IngredientRepository.java

package com.example.demo.repository;

import com.example.demo.entity.IngredientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository
        extends JpaRepository<IngredientEntity, Long> {
}

📄 3. Service Interface

File name: IngredientService.java

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

