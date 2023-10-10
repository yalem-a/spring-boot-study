package com.yalew.springstudy.student;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {


    private StudentService service;
    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping() //POST
    public Student save(
            @RequestBody Student student
    ) {
        return service.save(student);
    }

    @GetMapping("/{email}") //GET
    public Student findByEmail(@PathVariable("email") String email){
        return service.findByEmail(email);
    }

    @PutMapping //UPDATE
    public Student updateStudent(@RequestBody Student student){
        return service.update(student);
    }

    @DeleteMapping("/{email}") //DELETE
    public void delete(@PathVariable("email") String email){
        service.delete(email);

    }
    @GetMapping() //GET ALL
    public List<Student> findAllStudents(){
        return service.findAllStudents();
    }
}
