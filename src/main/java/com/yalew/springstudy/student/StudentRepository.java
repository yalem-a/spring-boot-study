package com.yalew.springstudy.student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student, Integer> {

    Student findStudentByEmail(String email);
    void deleteByEmail(String email);

}
