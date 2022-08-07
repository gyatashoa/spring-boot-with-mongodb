package me.example.springwithmongodb.models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Getter
@Setter
@Document
public class Student {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    @Indexed(

            unique = true)
    private String email;
    private LocalDateTime dob;

}
