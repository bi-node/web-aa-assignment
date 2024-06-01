package com.binode.mocktest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.binode.mocktest.repository.CourseRepository;
import com.binode.mocktest.dto.CourseDTO;
import com.binode.mocktest.model.Course;
import org.modelmapper.ModelMapper;
import com.binode.mocktest.service.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {

    private final ModelMapper modelMapper;
    private final CourseRepository courseRepository;

    @Autowired
    public CourseServiceImpl(ModelMapper modelMapper, CourseRepository courseRepository) {
        this.modelMapper = modelMapper;
        this.courseRepository = courseRepository;
    }

    @Override
    public void addCourse(CourseDTO course) {
        Course newCourse = modelMapper.map(course, Course.class);
        courseRepository.save(newCourse);
    }

    @Override
    public List<CourseDTO> getAllCourses() {
        return courseRepository.findAll().stream()
                .map(course -> modelMapper.map(course, CourseDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public CourseDTO getCourseById(long id) {
        Optional<Course> course = courseRepository.findById(id);
        return course.map(value -> modelMapper.map(value, CourseDTO.class)).orElse(null);
    }

    @Override
    public void deleteCourseById(long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public void updateCourse(CourseDTO course) {
        Course updatedCourse = modelMapper.map(course, Course.class);
        courseRepository.save(updatedCourse);
    }
}
