package com.example.demo.service;

import com.example.demo.entity.ProfitCalculationRecord;
import java.util.List;

public interface ProfitCalculationService {

    ProfitCalculation save(ProfitCalculation record);

    List<ProfitCalculation> getAll();
}
