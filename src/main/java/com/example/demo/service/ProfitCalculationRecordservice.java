

package com.example.demo.service;

import com.example.demo.entity.ProfitCalculationRecordentity;

import java.util.List;

public interface ProfitCalculationRecordsevice {

    ProfitCalculationRecordentity saveRecord(ProfitCalculationRecordentity record);

    List<ProfitCalculationRecordentity> getRecordsByMenuItem(Long menuItemId);

    List<ProfitCalculationRecordentity> getAllRecords();
}
