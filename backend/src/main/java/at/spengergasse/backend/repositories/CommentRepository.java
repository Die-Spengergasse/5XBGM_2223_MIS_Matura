package at.spengergasse.backend.repositories;

import org.springframework.data.repository.CrudRepository;
import at.spengergasse.backend.models.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long>{
    
}
