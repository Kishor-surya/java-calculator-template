package com.example.calculator.repository;

import com.example.calculator.model.CalculationRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalculationRepository extends JpaRepository<CalculationRecord, Long> {}
