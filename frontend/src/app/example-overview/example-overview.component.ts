import { Component, OnInit } from '@angular/core';
import { Example } from 'src/models/example';
import { ExampleService } from '../example.service';

@Component({
  selector: 'app-example-overview',
  templateUrl: './example-overview.component.html',
  styleUrls: ['./example-overview.component.css']
})
export class ExampleOverviewComponent implements OnInit {

  constructor(private exampleService: ExampleService) { }

  exampleData: Example[] = [];

  ngOnInit(): void {
    this.exampleService.getAll().subscribe((data: Example[]) => {
      this.exampleData = data;
    });
  }
}
