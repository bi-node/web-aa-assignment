package service;

import com.binode.midtermmocktest.dto.StudentDTO;
import com.binode.midtermmocktest.model.Course;
import com.binode.midtermmocktest.model.Student;

import java.util.List;

public interface StudentService {
    public void addStudent(StudentDTO student);
    public List<StudentDTO> getAllStudents();
    public StudentDTO getStudentById(long id);
    public void deleteStudentById(long id);
    public void updateStudent(StudentDTO student);

}
