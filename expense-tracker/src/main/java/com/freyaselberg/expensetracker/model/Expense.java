package com.freyaselberg.expensetracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Setter
@Getter
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String expense;

    private String description;

    // BIG DECIMALS! Do you know what kind of coffee this is?
    private BigDecimal amount;

}