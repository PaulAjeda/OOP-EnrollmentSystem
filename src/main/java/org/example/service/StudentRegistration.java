package org.example.service;

import org.example.model.Student;

public interface StudentRegistration {
    void addStudent(Student student);
    void displayAllStudent();
    String updateStudent(Student student);
    String deleteStudent(Student student);
}
