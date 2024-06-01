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

    public CourseDetails() {
    }

    public CourseDetails(Long descriptionId, String courseDescription, int credit, String program, String lastUpdated, Course course) {
        this.descriptionId = descriptionId;
        this.courseDescription = courseDescription;
        this.credit = credit;
        this.program = program;
        this.lastUpdated = lastUpdated;
        this.course = course;
    }

    public Long getDescriptionId() {
        return descriptionId;
    }

    public void setDescriptionId(Long descriptionId) {
        this.descriptionId = descriptionId;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    // Getters and Setters
}
