package com.freyaselberg.expensetracker.service;

import com.freyaselberg.expensetracker.model.Expense;
import com.freyaselberg.expensetracker.repo.ExpenseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService{

    @Autowired
    ExpenseRepo expenseRepo;

    @Override
    public List<Expense> findAll() {
        return expenseRepo.findAll();
    }

    @Override
    public Expense save(Expense expense) {
        expenseRepo.save(expense);
        return expense;
    }
}