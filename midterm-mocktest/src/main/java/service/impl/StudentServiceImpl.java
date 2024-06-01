package service;

import com.binode.midtermmocktest.Repository.StudentRepository;
import com.binode.midtermmocktest.dto.CourseDTO;
import com.binode.midtermmocktest.dto.StudentDTO;
import com.binode.midtermmocktest.model.Address;
import com.binode.midtermmocktest.model.Course;
import com.binode.midtermmocktest.model.Student;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    ModelMapper modelMapper;


    public List<StudentDTO> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        List<StudentDTO> studentDTOs = new ArrayList<>();
        for (Student student : students) {
            studentDTOs.add(modelMapper.map(student, StudentDTO.class));
        }

        return studentDTOs;
    }

    public StudentDTO getStudentById(long id) {
       Student student=studentRepository.findById(id).orElse(null);
       return modelMapper.map(student, StudentDTO.class);
    }

    public void DeleteStudentById(long id) {
        studentRepository.deleteById(id);
    }

    public void saveStudent(StudentDTO studentDTO) {
        Student student=modelMapper.map(studentDTO, Student.class);
        studentRepository.save(student);
    }

    public void updateStudent(StudentDTO studentDTO) {
        Student students=modelMapper.map(studentDTO, Student.class);
        studentRepository.findAll().stream().map(student -> {
            student.setId(studentDTO.getId());
            student.setName(studentDTO.getName());
            Address address = modelMapper.map(studentDTO.getAddress(), Address.class);
            student.setAddress(address);
            student.setGpa(studentDTO.getGpa());
            List<CourseDTO> enrolledClass = studentDTO.getEnrolledCourses();
            List<Course> enrolledCourses = modelMapper.map(enrolledClass, List.class);
            student.setEnrolledCourses(enrolledCourses);
            return studentRepository.save(student);
        });

    }

}
