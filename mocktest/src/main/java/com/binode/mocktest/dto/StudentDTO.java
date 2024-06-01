package com.binode.mocktest.dto;

import java.util.List;

public class StudentDTO {
    private Long studentId;
    private String name;
    private double gpa;
    private AddressDTO address;
    private List<StudentCourseDTO> studentCourses;

    public StudentDTO() {
    }

    public StudentDTO(Long studentId, String name, double gpa, AddressDTO address, List<StudentCourseDTO> studentCourses) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
        this.address = address;
        this.studentCourses = studentCourses;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
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

    public List<StudentCourseDTO> getStudentCourses() {
        return studentCourses;
    }

    public void setStudentCourses(List<StudentCourseDTO> studentCourses) {
        this.studentCourses = studentCourses;
    }
}
