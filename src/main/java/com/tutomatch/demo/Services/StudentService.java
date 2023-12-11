package com.tutomatch.demo.Services;

import com.tutomatch.demo.Models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    public StudentService() {
    }

    /**
     * @return
     */
    public List<Student> getStudents() {
        return List.of(new Student("Profesional"));
    }
}