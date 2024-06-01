package com.binode.midtermmocktest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.binode.midtermmocktest.dto.CourseDTO;
import service.CourseService;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/add")
    public void addCourse(@RequestBody CourseDTO course) {
        courseService.addCourse(course);
    }

    @GetMapping("/getAll")
    public List<CourseDTO> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public CourseDTO getCourseById(@PathVariable long id) {
        return courseService.getCourseById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCourseById(@PathVariable long id) {
        courseService.deleteCourseById(id);
    }

    @PutMapping("/update")
    public void updateCourse(@RequestBody CourseDTO course) {
        courseService.updateCourse(course);
    }
}
