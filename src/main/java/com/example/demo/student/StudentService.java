package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return this.studentRepository.findAll();
    }

    public void createStudent(Student student) {
        this.studentRepository.save(student);
    }

    public void deleteById(Long id) {
        this.studentRepository.deleteById(id);
    }
}
