package com.example.calculator.model;

import jakarta.persistence.*;

@Entity
public class CalculationRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String operation;
    private int result;

    public CalculationRecord() {}

    public CalculationRecord(String operation, int result) {
        this.operation = operation;
        this.result = result;
    }

    public Long getId() { return id; }
    public String getOperation() { return operation; }
    public void setOperation(String operation) { this.operation = operation; }
    public int getResult() { return result; }
    public void setResult(int result) { this.result = result; }
}
