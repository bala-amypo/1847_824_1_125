package com.example.demo.controller;


import com.example.demo.entity.ProfitCalculationRecord;
import com.example.demo.service.ProfitCalculationService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;



@RestController
@RequestMapping("/profits")
public class ProfitCalculationController {

    private final ProfitCalculationService service;

    public ProfitCalculationController(
            ProfitCalculationService service) {
        this.service = service;
    }

    @PostMapping
    public ProfitCalculation save(
            @RequestBody ProfitCalculation record) {
        return service.save(record);
    }

    @GetMapping
    public List<ProfitCalculationRecord> getAll() {
        return service.getAll();
    }
}
