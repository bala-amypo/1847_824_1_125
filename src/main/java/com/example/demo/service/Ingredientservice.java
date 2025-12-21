
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

