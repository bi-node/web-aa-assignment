package com.binode.mocktest.model;

import jakarta.persistence.*;


import java.util.List;

@Entity
public class Student {
    @Id
    private Long studentId;
    private String name;
    private double gpa;

    @ManyToOne
    @JoinColumn(name = "addressId")
    private Address address;

    @OneToMany(mappedBy = "student")
    private List<StudentCourse> studentCourses;

    public Student() {
    }

    public Student(Long studentId, String name, double gpa, Address address, List<StudentCourse> studentCourses) {
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<StudentCourse> getStudentCourses() {
        return studentCourses;
    }

    public void setStudentCourses(List<StudentCourse> studentCourses) {
        this.studentCourses = studentCourses;
    }
}