package me.example.springwithmongodb.service_impl;

import lombok.AllArgsConstructor;
import me.example.springwithmongodb.models.Student;
import me.example.springwithmongodb.repository.StudentRepository;
import me.example.springwithmongodb.services.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;
    @Override
    public List<Student> getAllStudents() {
        return List.of();
    }

    @Override
    public Student getStudentByEmail(String email) {
        return null;
    }

    @Override
    public Student getStudentByFirstName(String firstName) {
        return null;
    }

    @Override
    public Student getStudentByLastName(String lastName) {
        return null;
    }

    @Override
    public void addStudent(Student student) {
        //TODO: validate
        studentRepository.save(student);
    }
}
