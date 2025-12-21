package com.example.demo.controller;

import com.example.demo.entity.MenuItem;
import com.example.demo.service.MenuItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menu-items")
public class MenuItemController {

    private final MenuItemService menuItemService;

    public MenuItemController(MenuItemService menuItemService) {
        this.menuItemService = menuItemService;
    }

    @PostMapping
    public MenuItem createMenuItem(@RequestBody MenuItem menuItem) {
        return menuItemService.createMenuItem(menuItem);
    }

    @PutMapping("/{id}")
    public MenuItem updateMenuItem(
            @PathVariable Long id,
            @RequestBody MenuItem menuItem) {
        return menuItemService.updateMenuItem(id, menuItem);
    }

    @GetMapping("/{id}")
    public MenuItem getMenuItem(@PathVariable Long id) {
        return menuItemService.getMenuItemById(id);
    }

    @GetMapping
    public List<MenuItem> getAllMenuItems() {
        return menuItemService.getAllMenuItems();
    }

    @PutMapping("/{id}/deactivate")
    public void deactivateMenuItem(@PathVariable Long id) {
        menuItemService.deactivateMenuItem(id);
    }
}


package com.example.demo.controller;

import com.example.demo.entity.RecipeIngredient;
import com.example.demo.service.RecipeIngredientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recipe-ingredients")
public class RecipeIngredientController {

    private final RecipeIngredientService recipeIngredientService;

    public RecipeIngredientController(RecipeIngredientService recipeIngredientService) {
        this.recipeIngredientService = recipeIngredientService;
    }

    @PostMapping("/add")
    public RecipeIngredient addIngredientToRecipe(
            @RequestParam Long menuItemId,
            @RequestParam Long ingredientId,
            @RequestParam Double quantity) {

        return recipeIngredientService
                .addIngredientToRecipe(menuItemId, ingredientId, quantity);
    }

    @GetMapping("/menu/{menuItemId}")
    public List<RecipeIngredient> getIngredientsByMenuItem(
            @PathVariable Long menuItemId) {

        return recipeIngredientService.getIngredientsByMenuItem(menuItemId);
    }

    @DeleteMapping("/{id}")
    public void removeRecipeIngredient(@PathVariable Long id) {
        recipeIngredientService.removeRecipeIngredient(id);
    }
}

package com.example.demo.controller;

import com.example.demo.entity.Category;
import com.example.demo.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    public Category createCategory(@RequestBody Category category) {
        return categoryService.createCategory(category);
    }

    @PutMapping("/{id}")
    public Category updateCategory(
            @PathVariable Long id,
            @RequestBody Category category) {
        return categoryService.updateCategory(id, category);
    }

    @GetMapping
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @PutMapping("/{id}/deactivate")
    public void deactivateCategory(@PathVariable Long id) {
        categoryService.deactivateCategory(id);
    }
}


package com.example.demo.controller;

import com.example.demo.entity.ProfitCalculation;
import com.example.demo.service.ProfitCalculationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/profit")
public class ProfitCalculationController {

    private final ProfitCalculationService profitCalculationService;

    public ProfitCalculationController(ProfitCalculationService profitCalculationService) {
        this.profitCalculationService = profitCalculationService;
    }

    @PostMapping("/calculate/{menuItemId}")
    public ProfitCalculation calculateProfit(
            @PathVariable Long menuItemId) {

        return profitCalculationService.calculateProfit(menuItemId);
    }
}









