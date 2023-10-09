package com.yalew.springstudy.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents(){
        return List.of(
                new Student(
                        "Yalew",
                        "Adimassu",
                        LocalDate.now(),
                        "contact@yalew.com",
                        34
                ),
                new Student(
                        "Barok",
                        "Yalew",
                        LocalDate.now(),
                        "barokeye@yalew.com",
                        1
                )

        );
    }
}
