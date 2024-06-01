package com.binode.mocktest.controller;

import com.binode.mocktest.dto.StudentDTO;
import com.binode.mocktest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public String addStudent(@RequestBody StudentDTO studentDTO) {
        studentService.addStudent(studentDTO);
        return "Student added successfully";
    }

    @GetMapping
    public List<StudentDTO> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentDTO getStudentById(@PathVariable long id) {
        return studentService.getStudentById(id);
    }



    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable long id) {
        studentService.deleteStudentById(id);
        return "Student deleted successfully";
    }
}
