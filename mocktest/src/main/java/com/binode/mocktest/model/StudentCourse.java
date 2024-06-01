package com.binode.mocktest.model;

import jakarta.persistence.*;


@Entity
@IdClass(StudentCourseId.class)
public class StudentCourse {
    @Id
    private Long studentId;
    @Id
    private Long courseId;

    @ManyToOne
    @JoinColumn(name = "studentId", insertable = false, updatable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "courseId", insertable = false, updatable = false)
    private Course course;

    public StudentCourse() {
    }

    public StudentCourse(Long studentId, Long courseId, Student student, Course course) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.student = student;
        this.course = course;
    }

    // Getters and Setters
    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
