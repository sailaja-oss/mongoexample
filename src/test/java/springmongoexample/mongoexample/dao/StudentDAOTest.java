package springmongoexample.mongoexample.dao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDAOTest {

    @Test
    void addStudent() {
        StudentDAO stu = new StudentDAO();
        assertEquals("sailu", stu.fetchById("1"));
    }

    @Test
    void fetchAllStudents() {
    }

    @Test
    void fetchById() {
    }

    @Test
    void updateStudentById() {
    }

    @Test
    void deleteStudent() {
    }
}