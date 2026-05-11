package org.example.service;

import org.example.model.Student;
import org.example.exception.EnrollmentException;
import java.util.List;

public interface IStudentService {
    void addStudent(Student student) throws EnrollmentException;
    String updateStudent(Student student) throws EnrollmentException;
    String removeStudent(Student student) throws EnrollmentException;
    List<Student> getAllStudents();
    void displayAllStudent();
}
