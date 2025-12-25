// package com.example.demo.repository;

// import com.example.demo.entity.ProfitCalculationRecordEntity;
// import org.springframework.data.jpa.repository.JpaRepository;

// public interface ProfitCalculationRecordRepository
//         extends JpaRepository<ProfitCalculationRecordEntity, Long> {
// }


package com.example.demo.repository;

import com.example.demo.entity.ProfitCalculationRecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfitCalculationRecordRepository
        extends JpaRepository<ProfitCalculationRecordEntity, Long> {

    ProfitCalculationRecordEntity findByMenuItemId(Long menuItemId);
}
