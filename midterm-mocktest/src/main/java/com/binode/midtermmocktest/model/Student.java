package com.binode.midtermmocktest.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private double gpa;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_address")
    private Address address;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Course> courses;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "student_course",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> studentCourses;

    // getters and setters
}
