package springmongoexample.mongoexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springmongoexample.mongoexample.model.Student;
import springmongoexample.mongoexample.service.StudentService;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addstudents")
    public String addStudent(@RequestBody Student student) {

        return studentService.addStudent(student);
    }

    @GetMapping("/fetchallstudents")
    public List<Student> fetchAllStudents() {

        return studentService.fetchAllStudents();
    }

    @GetMapping("/fetchstubyid/{id}")
    public Optional<Student> fetchById(@PathVariable("id") String Id) {

        return studentService.fetchById(Id);
    }

    @PutMapping("/updatestu/{id}")
    public Optional<Student> updateStudentById(@PathVariable("id") String id, @RequestBody Student student) {
        return studentService.updateStudentById(id, student);
    }

    @DeleteMapping("/deletestu/{id}")
    public void deleteCustomer(@PathVariable("id") String Id) {

        studentService.deleteStudent(Id);


    }
}

