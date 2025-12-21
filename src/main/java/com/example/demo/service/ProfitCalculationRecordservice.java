package com.example.demo.service;

import com.example.demo.entity.ProfitCalculationRecordEntity;
import java.util.List;

public interface ProfitCalculationRecordService {

    ProfitCalculationRecordEntity save(ProfitCalculationRecordEntity record);

    List<ProfitCalculationRecordEntity> getAll();
}
