package com.binode.midtermmocktest.dto;


import java.util.List;

public class StudentDTO {
    private long id;
    private String name;
    private double gpa;
    private AddressDTO address;
    private List<CourseDTO> enrolledCourses;

    // Getters and Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    public List<CourseDTO> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(List<CourseDTO> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }
}
