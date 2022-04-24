package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student abdel = new Student(
                    "Abdel",
                    "abdel@hotmail.com",
                    LocalDate.of(2000, 02, 01)

            );
            Student justine = new Student(
                    "justine",
                    "justine@hotmail.com",
                    LocalDate.of(2004, 02, 01)

            );
            repository.saveAll(List.of(abdel, justine));
        };
    }
}
