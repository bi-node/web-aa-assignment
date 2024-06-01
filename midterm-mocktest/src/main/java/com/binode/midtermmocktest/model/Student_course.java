package com.binode.midtermmocktest.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="student_course")
public class Student_course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToMany
    @JoinTable(
            name = "student_course_mapping",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Student> students;

    @ManyToMany
    @JoinTable(
            name = "course_student_mapping",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private List<Course> courses;

    // getters and setters
}
