package com.example.demo.service;
import jakarta.persistence.service;
import com.example.demo.entity.Categoryentity;
@Service
public interface Categoryservice{
    public Category createCategory(Category category);
    public Category updateCategory(Long id,Category category);
    public Category getCategoryById(Long id);
    public Category getAllCategory();
    public Category deactiveCategory(Long id);
}

package com.example.demo.service;
import jakarta.persistence.service;
import com.example.demo.entity.Ingrediententity;
@Service
public interface Ingredientservice{
    public Ingredient createIngredient(Ingredient ingredient);
    public Ingredient updateIngredient(Long id,Ingredient ingredient);
    public Ingredient getIngredientById(Long id);
    public Ingredient getAllIngredient();
    public Ingredient deactivateInggredient();
    

}



package com.example.demo.service;
import jakarta.persistence.service;
import com.example.demo.entity.MenuItementity;
@Service
public interface MenuItemservice{
    public MenuItem createMenuItem(MenuItem item);
    public MenuItem updateMenuItem(Long id,MenuItem item);
    public MenuItem getMenuItemById(Long id);
    public MenuItem getallMenuItem();
    public MenuItem deactiviateMenuItem(Long id);

}


package com.example.demo.service;
import jakarta.persistence.service;
import com.example.demo.entity.ProfitCalculationRecordentity;

@service
public interface ProfitCalculationRecordservice{
    public ProfitCalculation calculateProfit(Long menuItemId);
    public ProfitCalculation updateRecipeIngredient(Long id,Double quantity);
    public ProfitCalculation getIngredientFromRecipe(Long menuItemId);
    public ProfitCalculation removeIngredientFromRecipe(Long id);
    public ProfitCalculation getTotalQuantityOfIngredient(Long ingredientId);
}


package com.example.demo.service;
import jakarta.persistence.service;
import com.example.demo.entity.RecipeIngrediententity;

@service
public  interface RecipeIngredientservice{
    public RecipeIngredient addIngredientToRecipe(Long menuItemID,Long ingredientId,Double quantity);
    public RecipeIngredient updataRecipeIngredient(Long id,Double quantity);
    public RecipeIngredient getIngredientFromRecipe(Long menuItemId);
    public RecipeIngredient removeIngredientFromRecipe(Long id);
    public RecipeIngredient getToatlQuantityOfIngredient(Long ingredientId);

}

package com.example.demo.service;
import jakarta.persistence.service;
import com.example.demo.entity.Userentity;

@service
public interface Userservice{
    public User register(RegisterRequest req);
    public User login(AuthRequest req);

}