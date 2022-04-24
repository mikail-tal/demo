package com.example.demo.student;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    public void createStudent(@RequestBody Student student) {
        System.out.println("student ==>" + student.toString());
        studentService.createStudent(student);
        return;
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Long> deleteUser(@PathVariable Long id) {
        studentService.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
