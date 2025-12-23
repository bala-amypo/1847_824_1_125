package com.example.demo.controller;


import com.example.demo.entity.ProfitCalculationRecordEntity;
import com.example.demo.service.ProfitCalculationRecordService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;



@RestController
@RequestMapping("/profits")
public class ProfitCalculationRecordController {

    private final ProfitCalculationRecordService service;

    public ProfitCalculationRecordController(
            ProfitCalculationRecordService service) {
        this.service = service;
    }

    @PostMapping
    public ProfitCalculationRecordEntity save(
            @RequestBody ProfitCalculationRecordEntity record) {
        return service.save(record);
    }

    @GetMapping
    public List<ProfitCalculationRecordEntity> getAll() {
        return service.getAll();
    }
}
