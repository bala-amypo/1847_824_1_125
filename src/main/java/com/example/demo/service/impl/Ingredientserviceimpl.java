1️⃣ ENTITY
📄 Ingrediententity.java
package com.example.demo.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "ingredients")
public class Ingrediententity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    private String unit;

    private BigDecimal costPerUnit;

    private Boolean active = true;

    // No-args constructor
    public Ingrediententity() {
    }

    // All-args constructor
    public Ingrediententity(Long id, String name, String unit,
                            BigDecimal costPerUnit, Boolean active) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.costPerUnit = costPerUnit;
        this.active = active;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getUnit() { return unit; }
    public void setUnit(String unit) { this.unit = unit; }

    public BigDecimal getCostPerUnit() { return costPerUnit; }
    public void setCostPerUnit(BigDecimal costPerUnit) { this.costPerUnit = costPerUnit; }

    public Boolean getActive() { return active; }
    public void setActive(Boolean active) { this.active = active; }
}

2️⃣ REPOSITORY
📄 IngredientRepository.java
package com.example.demo.repository;

import com.example.demo.entity.Ingrediententity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository
        extends JpaRepository<Ingrediententity, Long> {
}

3️⃣ SERVICE (INTERFACE)
📄 Ingredientservice.java
package com.example.demo.service;

import com.example.demo.entity.Ingrediententity;

import java.util.List;

public interface Ingredientservice {

    Ingrediententity create(Ingrediententity ingredient);

    Ingrediententity update(Long id, Ingrediententity ingredient);

    Ingrediententity getById(Long id);

    List<Ingrediententity> getAll();

    void deactivate(Long id);
}


📄 Ingredientserviceimpl.java
package com.example.demo.service.impl;

import com.example.demo.entity.Ingrediententity;
import com.example.demo.repository.IngredientRepository;
import com.example.demo.service.Ingredientservice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Ingredientserviceimpl implements Ingredientservice {

    private final IngredientRepository repository;

    public Ingredientserviceimpl(IngredientRepository repository) {
        this.repository = repository;
    }

    @Override
    public Ingrediententity create(Ingrediententity ingredient) {
        return repository.save(ingredient);
    }

    @Override
    public Ingrediententity update(Long id, Ingrediententity ingredient) {
        Ingrediententity existing = getById(id);
        existing.setName(ingredient.getName());
        existing.setUnit(ingredient.getUnit());
        existing.setCostPerUnit(ingredient.getCostPerUnit());
        return repository.save(existing);
    }

    @Override
    public Ingrediententity getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ingredient not found"));
    }

    @Override
    public List<Ingrediententity> getAll() {
        return repository.findAll();
    }

    @Override
    public void deactivate(Long id) {
        Ingrediententity ingredient = getById(id);
        ingredient.setActive(false);
        repository.save(ingredient);
    }
}

