package com.example.demo.service.impl;

import com.example.demo.entity.ProfitCalculationRecordEntity;
import com.example.demo.repository.ProfitCalculationRecordRepository;
import com.example.demo.service.ProfitCalculationRecordService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfitCalculationRecordServiceImpl
        implements ProfitCalculationRecordService {

    private final ProfitCalculationRecordRepository repository;

    public ProfitCalculationRecordServiceImpl(
            ProfitCalculationRecordRepository repository) {
        this.repository = repository;
    }

    @Override
    public ProfitCalculationRecordEntity save(
            ProfitCalculationRecordEntity record) {

        record.setProfit(
                record.getSellingPrice() - record.getCostPrice()
        );
        return repository.save(record);
    }

    @Override
    public List<ProfitCalculationRecordEntity> getAll() {
        return repository.findAll();
    }
}
