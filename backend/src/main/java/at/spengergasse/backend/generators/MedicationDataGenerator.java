package at.spengergasse.backend.generators;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import at.spengergasse.backend.models.Batch;
import at.spengergasse.backend.models.Medication;
import at.spengergasse.backend.repositories.BatchRepository;
import at.spengergasse.backend.repositories.MedicationRepository;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class MedicationDataGenerator implements CommandLineRunner {


    MedicationRepository medrepo;

    BatchRepository batchRepo; 

    @Override
    public void run(String... args) throws Exception {

        LocalDateTime date = LocalDateTime.of(2023, 04, 13, 15, 45, 30, 100);
        
        Batch b1 = batchRepo.save(new Batch(null, "BA00001", date));

        Medication m1 = new Medication(null, b1);
        //var m2 = new Medication();

        medrepo.save(m1);


    }
    
}
