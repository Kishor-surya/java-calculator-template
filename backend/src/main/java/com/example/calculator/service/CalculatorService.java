package com.example.calculator.service;

import com.example.calculator.model.CalculationRecord;
import com.example.calculator.repository.CalculationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    @Autowired
    private CalculationRepository repo;

    public CalculationRecord calculate(String operation, int result) {
        CalculationRecord record = new CalculationRecord(operation, result);
        return repo.save(record);
    }
}
