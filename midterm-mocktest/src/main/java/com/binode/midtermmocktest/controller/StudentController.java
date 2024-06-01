package com.binode.midtermmocktest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
    StudentService studentService;

    public StudentController() {
    }

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
}
