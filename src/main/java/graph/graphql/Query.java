package graph.graphql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import graph.entities.Student;
import graph.repositories.StudentRepository;

public class Query implements GraphQLQueryResolver {
  private StudentRepository studentRepository;

  public Query(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  public List<Student> allStudents() {
    return studentRepository.allStudents();
  }

}
