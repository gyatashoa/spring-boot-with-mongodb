package me.example.springwithmongodb.repository;

import me.example.springwithmongodb.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,String> {
}
