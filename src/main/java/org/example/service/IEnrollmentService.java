package org.example.service;

import org.example.model.*;
import org.example.exception.EnrollmentException;
import java.util.List;

public interface IEnrollmentService {
    String enrollStudentInSection(Student student, Section section) throws EnrollmentException;
    void viewDepartmentHierarchy(List<Department> departments, List<Section> sections, List<Student> allStudents);
}
