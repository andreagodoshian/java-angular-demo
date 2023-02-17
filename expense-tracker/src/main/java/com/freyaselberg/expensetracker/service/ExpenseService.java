package com.freyaselberg.expensetracker.service;

import com.freyaselberg.expensetracker.model.Expense;
import java.util.List;

public interface ExpenseService {

    List<Expense> findAll();

    Expense save(Expense expense);
}
