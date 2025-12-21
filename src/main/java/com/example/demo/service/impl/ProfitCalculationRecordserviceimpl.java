

package com.example.demo.service.impl;

import com.example.demo.entity.ProfitCalculationRecordentity;
import com.example.demo.repository.MenuItemrepository;
import com.example.demo.repository.ProfitCalculationRecordRepostiory;
import com.example.demo.repository.RecipeIngredientRepository;
import com.example.demo.service.ProfitCalculationRecordsevice;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProfitCalculationRecordserviceimpl
        implements ProfitCalculationRecordsevice {

    private final MenuItemrepositrory menuRepo;
    private final RecipeIngredientRepository recipeRepo;
    private final ProfitCalculationRecordRepostiory profitRepo;

    public ProfitCalculationRecordserviceimpl(
            MenuItemrepositrory menuRepo,
            RecipeIngredientRepository recipeRepo,
            ProfitCalculationRecordRepostiory profitRepo) {

        this.menuRepo = menuRepo;
        this.recipeRepo = recipeRepo;
        this.profitRepo = profitRepo;
    }

    @Override
    public ProfitCalculationRecordentity calculate(Long menuItemId) {

        var menuItem = menuRepo.findById(menuItemId).orElseThrow();
        var recipes = recipeRepo.findByMenuItemId(menuItemId);

        BigDecimal totalCost = BigDecimal.ZERO;

        for (var r : recipes) {
            BigDecimal cost = r.getIngredient()
                    .getCostPerUnit()
                    .multiply(BigDecimal.valueOf(r.getQuantityRequired()));
            totalCost = totalCost.add(cost);
        }

        BigDecimal profit =
                menuItem.getSellingPrice().subtract(totalCost);

        ProfitCalculationRecordentity record =
                new ProfitCalculationRecordentity();

        record.setMenuItem(menuItem);
        record.setTotalCost(totalCost);
        record.setProfitMargin(profit);

        return profitRepo.save(record);
    }

    @Override
    public List<ProfitCalculationRecordentity> getAll() {
        return profitRepo.findAll();
    }

    @Override
    public List<ProfitCalculationRecordentity> getByMenuItem(Long menuItemId) {
        return profitRepo.findAll()
                .stream()
                .filter(r -> r.getMenuItem().getId().equals(menuItemId))
                .toList();
    }
}
