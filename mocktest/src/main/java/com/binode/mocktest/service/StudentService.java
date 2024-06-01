package com.binode.mocktest.service;

import com.binode.mocktest.dto.StudentDTO;
import com.binode.mocktest.model.Course;
import com.binode.mocktest.model.Student;

import java.util.List;

public interface StudentService {
    public void addStudent(StudentDTO student);
    public List<StudentDTO> getAllStudents();
    public StudentDTO getStudentById(long id);
    public void deleteStudentById(long id);
    public void updateStudent(StudentDTO student);

}
