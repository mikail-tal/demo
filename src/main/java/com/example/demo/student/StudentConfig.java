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
                    1L,
                    "Abdel",
                    "abdel@hotmail.com",
                    LocalDate.of(2000, 02, 01),
                    23
            );
            Student justine = new Student(
                    2L,
                    "justine",
                    "justine@hotmail.com",
                    LocalDate.of(2000, 02, 01),
                    23
            );
            repository.saveAll(List.of(abdel, justine));
        };
    }
}
