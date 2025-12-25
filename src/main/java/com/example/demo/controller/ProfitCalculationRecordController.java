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
public class ProfitCalculationRecordController {

    private final ProfitCalculationService service;

    public ProfitCalculationRecordController(
            ProfitCalculationService service) {
        this.service = service;
    }

    @PostMapping
    public ProfitCalculationRecord save(
            @RequestBody ProfitCalculationRecord record) {
        return service.save(record);
    }

    @GetMapping
    public List<ProfitCalculationRecordy> getAll() {
        return service.getAll();
    }
}
