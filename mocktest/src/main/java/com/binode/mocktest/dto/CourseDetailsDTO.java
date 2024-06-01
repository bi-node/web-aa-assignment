package com.binode.midtermmocktest.dto;


public class CourseDetailsDTO {
    private int description_id;
    private String course_description;
    private int credit;
    private String program;
    private int last_updated;

    // Getters and Setters

    public int getDescription_id() {
        return description_id;
    }

    public void setDescription_id(int description_id) {
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
}
