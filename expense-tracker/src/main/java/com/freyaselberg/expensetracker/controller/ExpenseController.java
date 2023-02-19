package com.freyaselberg.expensetracker.controller;

import com.freyaselberg.expensetracker.model.Expense;
import com.freyaselberg.expensetracker.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RequestMapping("/expenses")
@RestController
public class ExpenseController {

    @Autowired
    ExpenseService expenseService;

    @GetMapping()
    public ResponseEntity<List<Expense>> get() {
        List<Expense> allExpenses = expenseService.findAll();
        return new ResponseEntity<>(allExpenses, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Expense> getById(@PathVariable("id") long id) {
        Expense expense = expenseService.findById(id);
        return new ResponseEntity<>(expense, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Expense> save(@RequestBody Expense expense) {
        Expense savedExpense = expenseService.save(expense);
        return new ResponseEntity<>(savedExpense, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") long id) {
        expenseService.delete(id);
        return new ResponseEntity<>("Expense was deleted successfully!", HttpStatus.OK);
    }
}