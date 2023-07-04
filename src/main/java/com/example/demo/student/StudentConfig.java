package com.example.demo.student;

import org.hibernate.mapping.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 01)
            );

            Student alex = new Student(
                    "Mariam",
                    "alex.jamal@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 01)
            );
            //repository.saveAll(mariam,alex);
        };
    }
}
