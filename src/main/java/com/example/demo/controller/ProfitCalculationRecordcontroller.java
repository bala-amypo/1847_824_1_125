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









