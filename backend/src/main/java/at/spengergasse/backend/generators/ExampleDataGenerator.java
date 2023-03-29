package at.spengergasse.backend.generators;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import at.spengergasse.backend.models.ExampleModel;
import at.spengergasse.backend.repositories.ExampleRepository;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ExampleDataGenerator implements CommandLineRunner{
    
    ExampleRepository exampleRepository;
    
    @Override
    public void run(String... args) throws Exception {

        var e1 = new ExampleModel(null, "An examplatory title", "A good description", LocalDateTime.now());
        var e2 = new ExampleModel(null, "An examplatory title", "A good description", LocalDateTime.now());

        exampleRepository.save(e1);
        exampleRepository.save(e2);
    }
    

}
