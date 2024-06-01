package com.binode.mocktest.model;

import jakarta.persistence.*;
import java.util.List;


@Entity
public class Course {
    @Id
    private Long courseId;
    private String name;

    @OneToMany(mappedBy = "course")
    private List<StudentCourse> studentCourses;

    @OneToOne(mappedBy = "course")
    private CourseDetails courseDetails;

    public Course() {
    }

    public Course(Long courseId, String name, List<StudentCourse> studentCourses, CourseDetails courseDetails) {
        this.courseId = courseId;
        this.name = name;
        this.studentCourses = studentCourses;
        this.courseDetails = courseDetails;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StudentCourse> getStudentCourses() {
        return studentCourses;
    }

    public void setStudentCourses(List<StudentCourse> studentCourses) {
        this.studentCourses = studentCourses;
    }

    public CourseDetails getCourseDetails() {
        return courseDetails;
    }

    public void setCourseDetails(CourseDetails courseDetails) {
        this.courseDetails = courseDetails;
    }
}

