
package com.example.demo.repository;

import com.example.demo.entity.ProfitCalculationRecordentity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfitCalculationRecordRepostiory
        extends JpaRepository<ProfitCalculationRecordentity, Long> {

    List<ProfitCalculationRecordentity> findByMenuItemId(Long menuItemId);
}