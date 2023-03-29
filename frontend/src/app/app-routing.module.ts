import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ExampleFormComponent } from './example-form/example-form.component';
import { ExampleOverviewComponent } from './example-overview/example-overview.component';

const routes: Routes = [
  {path: "exampleoverview", component: ExampleOverviewComponent},
  {path: "", "pathMatch": 'full', redirectTo: "exampleoverview"},
  {path: "exampleform/:id", component: ExampleFormComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
