package com.binode.mocktest.model;

import jakarta.persistence.*;

@Entity
public class CourseDetails {
    @Id
    private Long descriptionId;
    private String courseDescription;
    private int credit;
    private String program;
    private String lastUpdated;

    @OneToOne
    @JoinColumn(name = "courseId")
    private Course course;

    // Getters and Setters
}
