package com.freyaselberg.expensetracker.service;

import com.freyaselberg.expensetracker.model.Expense;
import java.util.List;

public interface ExpenseService {

    List<Expense> findAll();

    Expense save(Expense expense);

    Expense findById(long id);

    void delete(long id);
}
