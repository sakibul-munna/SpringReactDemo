package com.example.springreactdemo.student;

import com.example.springreactdemo.Enums.Gender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudent(){
        return List.of(
            new Student( UUID.randomUUID(), "James", "Bond", "jamesbond@gmail.com", Gender.Male ),
            new Student( UUID.randomUUID(), "Harry", "Potter", "harrypotter@gmail.com", Gender.Male ),
            new Student( UUID.randomUUID(), "Emily", "Watson", "emilywatson@gmail.com", Gender.Female )
        );
    }
}
