package com.binode.mocktest.dto;


import java.util.List;

public class CourseDTO {
    private long course_id;
    private String course_name;
    private List<StudentDTO> students;
    private CourseDetailsDTO courseDetails;

    public CourseDTO() {
    }

    public CourseDTO(long course_id, String course_name, List<StudentDTO> students, CourseDetailsDTO courseDetails) {
        this.course_id = course_id;
        this.course_name = course_name;
        this.students = students;
        this.courseDetails = courseDetails;
    }
    // Getters and Setters

    public long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(long course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public List<StudentDTO> getStudents() {
        return students;
    }

    public void setStudents(List<StudentDTO> students) {
        this.students = students;
    }

    public CourseDetailsDTO getCourseDetails() {
        return courseDetails;
    }

    public void setCourseDetails(CourseDetailsDTO courseDetails) {
        this.courseDetails = courseDetails;
    }
}
