package me.example.springwithmongodb.services;

import me.example.springwithmongodb.models.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student getStudentByEmail(String email);

    Student getStudentByFirstName(String firstName);

    Student getStudentByLastName(String lastName);

    void addStudent(Student student);
}
