package graph.repositories;

import java.util.ArrayList;
import java.util.List;

import graph.entities.Student;

public class StudentRepository {
  private List<Student> students;

  public StudentRepository() {
    students = new ArrayList<>();
    students.add(new Student("khalil", "jammazi", "khalil@esprit.tn"));
    students.add(new Student("ali", "ali", "ali@esprit.tn"));
  }

  public List<Student> allStudents() {
    return students;
  }

  public void saveStudent(Student student) {
    students.add(student);
  }
}