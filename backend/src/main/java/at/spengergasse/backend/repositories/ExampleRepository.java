package at.spengergasse.backend.repositories;

import org.springframework.data.repository.CrudRepository;

import at.spengergasse.backend.models.ExampleModel;

public interface ExampleRepository extends CrudRepository<ExampleModel, Long>{
    
}
