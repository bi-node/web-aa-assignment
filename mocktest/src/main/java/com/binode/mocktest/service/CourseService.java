package com.binode.mocktest.service;

import com.binode.mocktest.dto.CourseDTO;

import java.util.List;

public interface CourseService {
    void addCourse(CourseDTO course);
    List<CourseDTO> getAllCourses();
    CourseDTO getCourseById(long id);
    void deleteCourseById(long id);
    void updateCourse(CourseDTO course);
}
