package com.freyaselberg.expensetracker.repo;

import com.freyaselberg.expensetracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepo extends JpaRepository<Expense, Long> {

}
