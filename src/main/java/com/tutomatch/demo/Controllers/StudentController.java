package com.tutomatch.demo.Controllers;

import com.tutomatch.demo.Models.Student;
import com.tutomatch.demo.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "v1/students")
public class StudentController {
    @Autowired
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> getStudents() {
        return this.service.getStudents();
    }

}
