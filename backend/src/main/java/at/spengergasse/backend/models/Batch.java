package at.spengergasse.backend.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Batch {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id; 

    @Nullable()
    @Column(name = "ba_lotNumber")
    private String lotNumber;

    @Nullable()
    @Column(name = "ba_expirationDate")
    private LocalDateTime expirationDate;
    

}
