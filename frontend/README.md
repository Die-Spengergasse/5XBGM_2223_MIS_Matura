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
> [Medication FHIR Docs](https://build.fhir.org/medication.html)


Resulting Structure:
```json
{
  "resourceType" : "Medication",
  "id" : "med0301",
  "text" : {
    "status" : "generated",
    "div" : "<div xmlns=\"http://www.w3.org/1999/xhtml\"><p><b>Generated Narrative: Medication</b><a name=\"med0301\"> </a></p><div style=\"display: inline-block; background-color: #d9e0e7; padding: 6px; margin: 4px; border: 1px solid #8da1b4; border-radius: 5px; line-height: 60%\"><p style=\"margin-bottom: 0px\">Resource Medication &quot;med0301&quot; </p></div><p><b>identifier</b>: id:\u00a0?ngen-9?</p><p><b>code</b>: Vancomycin Hydrochloride (VANCOMYCIN HYDROCHLORIDE) <span style=\"background: LightGoldenRodYellow; margin: 4px; border: 1px solid khaki\"> (<a href=\"http://terminology.hl7.org/5.1.0/CodeSystem-v3-ndc.html\">National drug codes</a>#0409-6531-02)</span></p><p><b>status</b>: active</p><p><b>marketingAuthorizationHolder</b>: <a name=\"mmanu\"> </a></p><blockquote><p/><p><a name=\"mmanu\"> </a></p><p><b>name</b>: Medication Manufacturer</p></blockquote><p><b>doseForm</b>: Injection Solution (qualifier value) <span style=\"background: LightGoldenRodYellow; margin: 4px; border: 1px solid khaki\"> (<a href=\"https://browser.ihtsdotools.org/\">SNOMED CT</a>#385219001)</span></p><blockquote><p><b>ingredient</b></p><h3>Items</h3><table class=\"grid\"><tr><td>-</td><td><b>Concept</b></td></tr><tr><td>*</td><td>Vancomycin Hydrochloride <span style=\"background: LightGoldenRodYellow; margin: 4px; border: 1px solid khaki\"> (<a href=\"http://terminology.hl7.org/5.1.0/CodeSystem-v3-rxNorm.html\">RxNorm</a>#66955)</span></td></tr></table><p><b>isActive</b>: true</p><p><b>strength</b>: 500 mg<span style=\"background: LightGoldenRodYellow\"> (Details: UCUM code mg = 'mg')</span>/10 mL<span style=\"background: LightGoldenRodYellow\"> (Details: UCUM code mL = 'mL')</span></p></blockquote><h3>Batches</h3><table class=\"grid\"><tr><td>-</td><td><b>LotNumber</b></td><td><b>ExpirationDate</b></td></tr><tr><td>*</td><td>9494788</td><td>2017-05-22</td></tr></table></div>"
  },
  "contained" : [{
    "resourceType" : "Organization",
    "id" : "mmanu",
    "name" : "Medication Manufacturer"
  }],
  "identifier" : [{
    "id" : "123456789"
  }],
  "code" : {
    "coding" : [{
      "system" : "http://hl7.org/fhir/sid/ndc",
      "code" : "0409-6531-02",
      "display" : "Vancomycin Hydrochloride (VANCOMYCIN HYDROCHLORIDE)"
    }]
  },
  "status" : "active",
  "marketingAuthorizationHolder" : {
    "reference" : "#mmanu"
  },
  "doseForm" : {
    "coding" : [{
      "system" : "http://snomed.info/sct",
      "code" : "385219001",
      "display" : "Injection Solution (qualifier value)"
    }]
  },
  "ingredient" : [{
    "item" : {
      "concept" : {
        "coding" : [{
          "system" : "http://www.nlm.nih.gov/research/umls/rxnorm",
          "code" : "66955",
          "display" : "Vancomycin Hydrochloride"
        }]
      }
    },
    "isActive" : true,
    "strengthRatio" : {
      "numerator" : {
        "value" : 500,
        "system" : "http://unitsofmeasure.org",
        "code" : "mg"
      },
      "denominator" : {
        "value" : 10,
        "system" : "http://unitsofmeasure.org",
        "code" : "mL"
      }
    }
  }],
  "batch" : {
    "lotNumber" : "9494788",
    "expirationDate" : "2017-05-22"
  }
}
```