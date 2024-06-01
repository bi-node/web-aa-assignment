package com.binode.midtermmocktest.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="course")
public class Course {
    @Id
    private long course_id;
    private String course_name;

    @ManyToOne
    @JoinColumn(name="student_id")
    private Student student;

    @ManyToMany(mappedBy = "studentCourses")
    private List<Student> students;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "course")
    private Course_Details courseDetails;

    // getters and setters
}
