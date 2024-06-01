package com.binode.midtermmocktest.model;

import jakarta.persistence.*;

@Entity
@Table(name="course_details")
public class Course_Details {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long description_id;
    private String course_description;
    private int credit;
    private String program;
    private int last_updated;

    @OneToOne
    @JoinColumn(name="course_id")
    private Course course;

    public Course_Details() {
    }

    public Course_Details(long description_id, String course_description, int credit, String program, int last_updated, Course course) {
        this.description_id = description_id;
        this.course_description = course_description;
        this.credit = credit;
        this.program = program;
        this.last_updated = last_updated;
        this.course = course;
    }

// getters and setters


    public long getDescription_id() {
        return description_id;
    }

    public void setDescription_id(long description_id) {
        this.description_id = description_id;
    }

    public String getCourse_description() {
        return course_description;
    }

    public void setCourse_description(String course_description) {
        this.course_description = course_description;
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

    public int getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(int last_updated) {
        this.last_updated = last_updated;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
