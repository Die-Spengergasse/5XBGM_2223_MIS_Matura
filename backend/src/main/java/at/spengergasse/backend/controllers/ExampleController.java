package at.spengergasse.backend.controllers;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;

import at.spengergasse.backend.models.ExampleModel;
import at.spengergasse.backend.repositories.ExampleRepository;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.StreamSupport;

@CrossOrigin
@AllArgsConstructor
@RestController
@RequestMapping("/example")
public class ExampleController {
    
    ExampleRepository exampleRepository;

    Gson gson;

    @GetMapping("/")
    List<ExampleModel> getAll(){
        return StreamSupport.stream(exampleRepository.findAll().spliterator(), false).toList();
    }

    @PutMapping("/")
    ExampleModel putExampleModel(@RequestBody String exampleModelStr){

        ExampleModel exampleModel =  gson.fromJson(exampleModelStr, ExampleModel.class);

        return exampleRepository.save(exampleModel);
    }

    @GetMapping("/{id}")
    ExampleModel getExampleModel(@PathVariable Long id){
        return exampleRepository.findById(id).orElse(null);
    }

}
