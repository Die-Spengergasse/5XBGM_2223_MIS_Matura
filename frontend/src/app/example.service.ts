import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Example } from 'src/models/example';

@Injectable({
  providedIn: 'root'
})
export class ExampleService {


  constructor(private http: HttpClient) { }

  private static exampleBasePath = "http://localhost:8080/example/";

  public getAll(): Observable<Example[]>{
    return this.http.get<Example[]>(ExampleService.exampleBasePath);
  }

  public add(example: Example): Observable<Example>{
    return this.http.put<Example>(ExampleService.exampleBasePath, example);
  }

  public getById(id: number): Observable<Example> {
    return this.http.get<Example>(ExampleService.exampleBasePath+id);
  }

}
