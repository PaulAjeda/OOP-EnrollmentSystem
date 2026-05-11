package org.example.service;

import org.example.model.*;
import java.util.List;

public interface IEnrollmentService {
    String enrollStudentInSection(Student student, Section section);
    void viewDepartmentHierarchy(List<Department> departments, List<Section> sections, List<Student> allStudents);
}
