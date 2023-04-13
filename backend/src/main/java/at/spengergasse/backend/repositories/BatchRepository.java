package at.spengergasse.backend.repositories;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import at.spengergasse.backend.models.Batch;

public interface BatchRepository extends CrudRepository<Batch, UUID> {
    
}
