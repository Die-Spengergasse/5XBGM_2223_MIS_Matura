package at.spengergasse.backend.controllers;

import java.util.List;
import java.util.stream.StreamSupport;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import at.spengergasse.backend.models.Medication;
import at.spengergasse.backend.repositories.MedicationRepository;

@RestController
@RequestMapping("/medication")
@CrossOrigin
public class MedicationController {
    
    MedicationRepository medicationRepository;
    
    @GetMapping("/")
    List<Medication> getAll(){
        return StreamSupport.stream(medicationRepository.findAll().spliterator(), false).toList();
    }

}
