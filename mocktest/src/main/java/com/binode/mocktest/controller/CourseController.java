package com.binode.mocktest.controller;

import com.binode.mocktest.dto.CourseDTO;
import com.binode.mocktest.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<CourseDTO> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public CourseDTO getCourseById(@PathVariable long id) {
        return courseService.getCourseById(id);
    }

    @PostMapping
    public String addCourse(@RequestBody CourseDTO courseDTO) {
        courseService.addCourse(courseDTO);
        return "Course added successfully";
    }

    @PutMapping
    public String updateCourse(@RequestBody CourseDTO courseDTO) {
        courseService.updateCourse(courseDTO);
        return "Course updated successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteCourseById(@PathVariable long id) {
        courseService.deleteCourseById(id);
        return "Course deleted successfully";
    }
}
