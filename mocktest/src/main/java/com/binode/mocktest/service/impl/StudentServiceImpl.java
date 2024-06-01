package com.binode.mocktest.service.impl;

import com.binode.mocktest.repository.StudentRepository;
import com.binode.mocktest.dto.StudentDTO;
import com.binode.mocktest.model.Student;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.binode.mocktest.service.StudentService;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    StudentRepository studentRepository;
    ModelMapper modelMapper;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository, ModelMapper modelMapper) {
        this.studentRepository = studentRepository;
        this.modelMapper = modelMapper;
    }

    public List<StudentDTO> getAllStudents() {
        return studentRepository.findAll().stream().
                map(student -> modelMapper.map(student,StudentDTO.class)).collect(Collectors.toList());


    }

    public StudentDTO getStudentById(long id) {
       Student student=studentRepository.findById(id).orElse(null);
       return modelMapper.map(student, StudentDTO.class);
    }


    public void addStudent(StudentDTO studentDTO) {
        Student student=modelMapper.map(studentDTO, Student.class);
        studentRepository.save(student);
    }



    @Override
    public void deleteStudentById(long id) {
        studentRepository.deleteById(id);
    }

    public void updateStudent(StudentDTO studentDTO) {
//        Student students=modelMapper.map(studentDTO, Student.class);
//        studentRepository.findAll().stream().map(student -> {
//            student.setId(studentDTO.getId());
//            student.setName(studentDTO.getName());
//            Address address = modelMapper.map(studentDTO.getAddress(), Address.class);
//            student.setAddress(address);
//            student.setGpa(studentDTO.getGpa());
//            List<CourseDTO> enrolledClass = studentDTO.getEnrolledCourses();
//            List<Course> enrolledCourses = modelMapper.map(enrolledClass, List.class);
//            student.setEnrolledCourses(enrolledCourses);
//            return studentRepository.save(student);
//        });

    }

}
