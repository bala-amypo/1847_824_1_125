package.com.example.demo.service;
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