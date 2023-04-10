# Frontend

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 14.0.6.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The application will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via a platform of your choice. To use this command, you need to first add a package that implements end-to-end testing capabilities.

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI Overview and Command Reference](https://angular.io/cli) page.


## Example implementation Medication
> [Location FHIR Docs](https://build.fhir.org/location.html)


Resulting Structure:
```json
{
  "resourceType" : "Location",
  "id" : "1",
  "text" : {
    "status" : "generated",
    "div" : "<div xmlns=\"http://www.w3.org/1999/xhtml\">Burgers UMC, South Wing, second floor</div>"
  },
  "identifier" : [{
    "value" : "B1-S.F2"
  }],
  "status" : "active",
  "name" : "South Wing, second floor",
  "alias" : ["BU MC, SW, F2",
  "Burgers University Medical Center, South Wing, second floor"],
  "description" : "Second floor of the Old South Wing, formerly in use by Psychiatry",
  "mode" : "instance",
  "contact" : [{
    "telecom" : [{
      "system" : "phone",
      "value" : "2328",
      "use" : "work"
    },
    {
      "system" : "fax",
      "value" : "2329",
      "use" : "work"
    },
    {
      "system" : "email",
      "value" : "second wing admissions"
    }]
  },
  {
    "telecom" : [{
      "system" : "url",
      "value" : "http://sampleorg.com/southwing",
      "use" : "work"
    }]
  }],
  "address" : {
    "use" : "work",
    "line" : ["Galapagosweg 91, Building A"],
    "city" : "Den Burg",
    "postalCode" : "9105 PZ",
    "country" : "NLD"
  },
  "form" : {
    "coding" : [{
      "system" : "http://terminology.hl7.org/CodeSystem/location-physical-type",
      "code" : "wi",
      "display" : "Wing"
    }]
  },
  "position" : {
    "longitude" : -83.6945691,
    "latitude" : 42.25475478,
    "altitude" : 0
  },
  "managingOrganization" : {
    "reference" : "Organization/f001"
  },
  "characteristic" : [{
    "coding" : [{
      "system" : "http://hl7.org/fhir/location-characteristic",
      "code" : "wheelchair",
      "display" : "Wheelchair accessible"
    }]
  }],
  "endpoint" : [{
    "reference" : "Endpoint/example"
  }]
}
```