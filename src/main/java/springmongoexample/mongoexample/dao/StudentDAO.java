package springmongoexample.mongoexample.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springmongoexample.mongoexample.model.Student;
import springmongoexample.mongoexample.repository.StudentRepository;

import java.util.List;
import java.util.Optional;


@Service
public class StudentDAO {

    @Autowired
    StudentRepository studentRepository;

    @Transactional
    public String addStudent(Student student) {
        studentRepository.save(student);
        return student.getName() + "add successfully";
    }


    public List<Student> fetchAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> fetchById(String Id) {
        return studentRepository.findById(Id);
    }

    public Optional<Student> updateStudentById(String Id, Student student) {
        Optional<Student> fetchedStudent = studentRepository.findById(Id);
        if (fetchedStudent.isPresent())
            studentRepository.saveAndFlush(student);
        return fetchedStudent;
    }

    public void deleteStudent(String Id) {
        studentRepository.deleteById(Id);
    }

}


