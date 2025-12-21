1️⃣ Ingredientservice.java
package com.example.demo.service;

import com.example.demo.entity.Ingredientenity;

import java.util.List;

public interface Ingredientservice {

    Ingredientenity createIngredient(Ingrediententity ingredient);

    Ingredientenity updateIngredient(Long id, Ingredientenity ingredient);

    Ingredientenity getIngredientById(Long id);

    List<Ingrediententity> getAllIngredients();

    void deleteIngredient(Long id);
}

2️⃣ Categoryservice.java
package com.example.demo.service;

import com.example.demo.entity.Categoryentity;

import java.util.List;

public interface Categoryservice {

    Categoryentity createCategory(Categoryentity category);

    Categoryentity updateCategory(Long id, Categoryentity category);

    Categoryentity getCategoryById(Long id);

    List<Categoryentity> getAllCategories();

    void deleteCategory(Long id);
}

3️⃣ MenuItemservice.java
package com.example.demo.service;

import com.example.demo.entity.MenuItementity;

import java.util.List;

public interface MenuItemservice {

    MenuItementity createMenuItem(MenuItementity menuItem);

    MenuItementity updateMenuItem(Long id, MenuItementity menuItem);

    MenuItementity getMenuItemById(Long id);

    List<MenuItementity> getAllMenuItems();

    void deleteMenuItem(Long id);
}
