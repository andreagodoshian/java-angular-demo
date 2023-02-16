import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ListExpensesComponent } from './components/list-expenses/list-expenses.component';

@NgModule({
  declarations: [
    AppComponent,
    ListExpensesComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
