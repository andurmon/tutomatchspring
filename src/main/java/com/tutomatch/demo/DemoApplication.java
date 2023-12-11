package com.tutomatch.demo;

import com.tutomatch.demo.Models.Student;
import com.tutomatch.demo.Services.StudentService;
import org.bson.json.JsonObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        StudentService service = new StudentService();
        return service.getStudents();
    }

    @GetMapping("/hello")
    public String sayHello() {
        JsonObject obj =  new JsonObject("{\"HelloThere\": \"General Kenobi\"}");
        return obj.getJson();
    }

}
