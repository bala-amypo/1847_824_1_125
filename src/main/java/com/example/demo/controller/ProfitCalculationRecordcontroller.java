

package com.example.demo.controller;

import com.example.demo.entity.ProfitCalculationRecordentity;
import com.example.demo.service.ProfitCalculationRecordsevice;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profit")
public class ProfitCalculationRecordcontroller {

    private final ProfitCalculationRecordsevice service;

    public ProfitCalculationRecordcontroller(
            ProfitCalculationRecordsevice service) {
        this.service = service;
    }

    @PostMapping("/calculate/{menuItemId}")
    public ProfitCalculationRecordentity calculate(
            @PathVariable Long menuItemId) {
        return service.calculate(menuItemId);
    }

    @GetMapping("/menu/{menuItemId}")
    public List<ProfitCalculationRecordentity> getHistory(
            @PathVariable Long menuItemId) {
        return service.getByMenuItem(menuItemId);
    }

    @GetMapping
    public List<ProfitCalculationRecordentity> getAll() {
        return service.getAll();
    }
}





