import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-medication-form',
  templateUrl: './medication-form.component.html',
  styleUrls: ['./medication-form.component.css']
})
export class MedicationFormComponent implements OnInit {

  
  getBatchFormGroup(): FormGroup<any> {
    return this.medicationForm.controls['batch'] as any;
  }

  constructor() { }

  // add testdata
  emptyMedication: any = {
    id: 1,
    batch: {
      id: 1,
      lotNumber: "BA0001",
      expirationDate: new Date()
    }
  };

  // add form ccontrols layout
  public medicationForm: FormGroup = new FormGroup({
    id: new FormControl<number | null>(null),
    batch: new FormGroup<any>({
      lotNumber: new FormControl<string>(""),
      expirationDate: new FormControl<Date>(new Date())
    })
  });

  ngOnInit(): void {

    // get values from service
    // this.medicationService.getById()
    // apply value
    this.medicationForm.patchValue(this.emptyMedication);

  }

}
