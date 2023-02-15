package com.freyaselberg.expensetracker.service;

import com.freyaselberg.expensetracker.model.Expense;
import com.freyaselberg.expensetracker.repo.ExpenseRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ExpenseServiceImpl implements ExpenseService{

    @Autowired
    ExpenseRepo expenseRepo;

    @Override
    public List<Expense> findAll() {
        return expenseRepo.findAll();
    }
}
