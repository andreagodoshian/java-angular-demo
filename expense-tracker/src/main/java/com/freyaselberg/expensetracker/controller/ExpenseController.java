package com.freyaselberg.expensetracker.controller;

import com.freyaselberg.expensetracker.model.Expense;
import com.freyaselberg.expensetracker.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class ExpenseController {

    @Autowired
    ExpenseService expenseService;

    @GetMapping("/expenses")
    public ResponseEntity<List<Expense>> get() {
        List<Expense> allExpenses = expenseService.findAll();
        return new ResponseEntity<List<Expense>>(allExpenses, HttpStatus.OK);
    }

    @PostMapping("/expenses")
    public ResponseEntity<Expense> save(@RequestBody Expense expense) {
        Expense savedExpense = expenseService.save(expense);
        return new ResponseEntity<Expense>(savedExpense, HttpStatus.OK);
    }
}