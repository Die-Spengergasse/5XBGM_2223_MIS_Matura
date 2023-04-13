import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ExampleOverviewComponent } from './example-overview/example-overview.component';
import { ExampleFormComponent } from './example-form/example-form.component';
import { ReactiveFormsModule } from '@angular/forms';
import { MedicationOverviewComponent } from './medication-overview/medication-overview.component';
import { MedicationFormComponent } from './medication-form/medication-form.component';

@NgModule({
  declarations: [
    AppComponent,
    ExampleOverviewComponent,
    ExampleFormComponent,
    MedicationOverviewComponent,
    MedicationFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule 
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
