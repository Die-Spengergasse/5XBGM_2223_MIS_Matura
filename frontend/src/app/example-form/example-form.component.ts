import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Example } from 'src/models/example';
import { ExampleService } from '../example.service';

@Component({
  selector: 'app-example-form',
  templateUrl: './example-form.component.html',
  styleUrls: ['./example-form.component.css']
})
export class ExampleFormComponent implements OnInit {

  constructor(
    private exampleService: ExampleService, 
    private formBuilder: FormBuilder, 
    private route: ActivatedRoute, 
    private router: Router 
    ) { }


  emptyExample: Example = {
    id: null,
    title: '',
    description: '',
    creationDateTime: new Date(Date.now())
  };

  public objectForm: FormGroup = new FormGroup({
    id: new FormControl<number | null>(null),
    title: new FormControl<string>(this.emptyExample.title),
    description: new FormControl<string>(this.emptyExample.description),
    creationDateTime: new FormControl<Date>(this.emptyExample.creationDateTime)
  });

  ngOnInit(): void {
    this.route.params.subscribe(params => {

      if (params['id'] === undefined || params['id'] === null || params['id'] === ""){
        this.objectForm.patchValue(this.emptyExample);
      }else{
        this.exampleService.getById(params['id']).subscribe((response: Example) => {
          this.objectForm.patchValue(response);
        });
      }

    });
  }

  onDateChange(event: any) {

    console.log(event.target.value);
    
    //this.objectForm.patchValue({ creationDateTime: new Date(event.target.value) });
  }

  onSubmit() {
    if (this.objectForm.valid) {
      const updatedObject: Example = {
        id: this.emptyExample.id,
        creationDateTime: new Date(this.objectForm.value.creationDateTime),
        description: this.objectForm.value.description,
        title: this.objectForm.value.title
      };

      console.log(this.objectForm.value.creationDateTime);
      console.log(updatedObject);
      this.exampleService.add(updatedObject).subscribe(response => {
        console.log(response);
        this.router.navigate(["/exampleoverview"]);
        
      });
    }
  }
}
