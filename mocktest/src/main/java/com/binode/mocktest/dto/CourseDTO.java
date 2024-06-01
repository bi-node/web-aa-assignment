package com.binode.mocktest.dto;

public class CourseDTO {
    private Long courseId;
    private String name;

    public CourseDTO() {
    }

    public CourseDTO(Long courseId, String name) {
        this.courseId = courseId;
        this.name = name;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
