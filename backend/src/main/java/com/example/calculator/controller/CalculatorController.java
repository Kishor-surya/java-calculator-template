package com.example.calculator.controller;

import com.example.calculator.model.CalculationRecord;
import com.example.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {

    @Autowired
    private CalculatorService service;

    @GetMapping("/add")
    public CalculationRecord add(@RequestParam int a, @RequestParam int b) {
        return service.calculate("add", a + b);
    }

    @GetMapping("/subtract")
    public CalculationRecord subtract(@RequestParam int a, @RequestParam int b) {
        return service.calculate("subtract", a - b);
    }

    @GetMapping("/multiply")
    public CalculationRecord multiply(@RequestParam int a, @RequestParam int b) {
        return service.calculate("multiply", a * b);
    }

    @GetMapping("/divide")
    public CalculationRecord divide(@RequestParam int a, @RequestParam int b) {
        return service.calculate("divide", b != 0 ? a / b : 0);
    }
}
