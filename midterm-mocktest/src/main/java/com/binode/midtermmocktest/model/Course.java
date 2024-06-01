package com.binode.midtermmocktest.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="course")
public class Course {
    @Id
    private long course_id;
    private String course_name;

    @ManyToMany(mappedBy = "enrolledCourses")
    private List<Student> students;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "course")
    private Course_Details courseDetails;

    public Course() {
    }

    public Course(long course_id, String course_name, List<Student> students, Course_Details courseDetails) {
        this.course_id = course_id;
        this.course_name = course_name;
        this.students = students;
        this.courseDetails = courseDetails;
    }

    public long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(long course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Course_Details getCourseDetails() {
        return courseDetails;
    }

    public void setCourseDetails(Course_Details courseDetails) {
        this.courseDetails = courseDetails;
    }
    // getters and setters
}
