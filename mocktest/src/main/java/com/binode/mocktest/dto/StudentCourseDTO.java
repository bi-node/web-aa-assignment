package com.binode.mocktest.dto;

public class StudentCourseDTO {
    private Long studentId;
    private Long courseId;
    private CourseDTO course;

    public StudentCourseDTO() {
    }

    public StudentCourseDTO(Long studentId, Long courseId, CourseDTO course) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.course = course;
    }

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

    public CourseDTO getCourse() {
        return course;
    }

    public void setCourse(CourseDTO course) {
        this.course = course;
    }
}
