package com.binode.midtermmocktest.model;

import jakarta.persistence.*;

@Entity
@Table(name="course_details")
public class Course_Details {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int description_id;
    private String course_description;
    private int credit;
    private String program;
    private int last_updated;

    @OneToOne
    @JoinColumn(name="course_id")
    private Course course;

    // getters and setters
}
