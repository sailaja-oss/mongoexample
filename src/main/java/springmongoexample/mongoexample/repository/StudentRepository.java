package springmongoexample.mongoexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springmongoexample.mongoexample.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {


}