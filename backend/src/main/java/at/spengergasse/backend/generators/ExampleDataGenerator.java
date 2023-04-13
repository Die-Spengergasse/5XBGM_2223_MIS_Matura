package at.spengergasse.backend.generators;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.StreamSupport;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import at.spengergasse.backend.models.Comment;
import at.spengergasse.backend.models.ExampleModel;
import at.spengergasse.backend.repositories.CommentRepository;
import at.spengergasse.backend.repositories.ExampleRepository;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ExampleDataGenerator implements CommandLineRunner{
    
    ExampleRepository exampleRepository;

    CommentRepository commentRepository;
    
    @Override
    public void run(String... args) throws Exception {

        List<Comment> newComments = List.of(
                new Comment(null, "usr1", "text1"),
                new Comment(null, "usr2", "text2"),
                new Comment(null, "usr3", "text3"),
                new Comment(null, "usr4", "text4"),
                new Comment(null, "usr5", "text5"));

        var storedComments = StreamSupport.stream(
            commentRepository.saveAll(newComments).spliterator(), false
            ).toList();

        var e1 = new ExampleModel(null, "An examplatory title", "A good description", LocalDateTime.now(), storedComments.subList(0, 2));
        var e2 = new ExampleModel(null, "An examplatory title", "A good description", LocalDateTime.now(), storedComments.subList(2, 5));

        exampleRepository.save(e1);
        exampleRepository.save(e2);
    }
    

}
