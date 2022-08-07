package me.example.springwithmongodb.controllers;

import lombok.AllArgsConstructor;
import me.example.springwithmongodb.models.Student;
import me.example.springwithmongodb.services.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class StudentController {


    final private StudentService studentService;

    @GetMapping("/students")
    List<Student> getStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping("/student")
    void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
}
