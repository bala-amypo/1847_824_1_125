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