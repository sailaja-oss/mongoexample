package springmongoexample.mongoexample.service;

import springmongoexample.mongoexample.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    String addStudent(Student student);

    List<Student> fetchAllStudents();

    Optional<Student> fetchById(String Id);

    Optional<Student> updateStudentById(String id, Student student);

    void deleteStudent(String Id);
}
