package service;

import com.binode.midtermmocktest.dto.CourseDTO;

import java.util.List;

public interface CourseService {
    void addCourse(CourseDTO course);
    List<CourseDTO> getAllCourses();
    CourseDTO getCourseById(long id);
    void deleteCourseById(long id);
    void updateCourse(CourseDTO course);
}
