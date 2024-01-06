package com.learning.springboot.controller;

import com.learning.springboot.entity.Students;
import com.learning.springboot.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentsController {

    @Autowired
    StudentsRepository studentsRepository;

    @PostMapping("/students")
    public String saveStudentController(@RequestBody Students students){
        studentsRepository.save(students);
        return "Student with id " + students.getId() + " is saved in db successfully";
    }

    @GetMapping("/students")
    public List<Students> fetchAllStudents(){
        return studentsRepository.findAll();

    }
}
