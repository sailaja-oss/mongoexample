package springmongoexample.mongoexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springmongoexample.mongoexample.dao.StudentDAO;
import springmongoexample.mongoexample.model.Student;

import java.util.List;
import java.util.Optional;


@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDAO studentDAO;

    @Override
    public String addStudent(Student student) {
        return studentDAO.addStudent(student);
    }

    @Override
    public List<Student> fetchAllStudents() {
        return studentDAO.fetchAllStudents();
    }

    @Override
    public Optional<Student> fetchById(String Id) {
        return studentDAO.fetchById(Id);
    }

    @Override
    public Optional<Student> updateStudentById(String id, Student student) {
        return studentDAO.updateStudentById(id, student);
    }

    @Override
    public void deleteStudent(String Id) {
        studentDAO.deleteStudent(Id);

    }
}