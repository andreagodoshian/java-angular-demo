import { Component, OnInit } from '@angular/core';
import { Expense } from 'src/app/models/expense';
import { ExpenseService } from 'src/app/services/expense.service';
@Component({
  selector: 'app-list-expenses',
  templateUrl: './list-expenses.component.html',
  styleUrls: ['./list-expenses.component.css']
})

export class ListExpensesComponent implements OnInit {

  expenses: Expense[] = [];

  constructor(private _expenseService: ExpenseService) {}

  ngOnInit(): void {
    this._expenseService.getExpenses().subscribe(
      data => this.expenses = data
    )
  }

}