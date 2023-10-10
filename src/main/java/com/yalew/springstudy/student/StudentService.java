package com.yalew.springstudy.student;

import java.util.List;


public interface StudentService {

     Student save(Student s); //post

     List<Student> findAllStudents(); //get

     Student findByEmail(String email); // by emailId

     Student update(Student s); //update
     void delete (String email); //delete
}
