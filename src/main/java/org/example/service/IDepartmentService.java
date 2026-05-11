package org.example.service;

import org.example.model.Department;
import org.example.exception.EnrollmentException;
import java.util.List;

public interface IDepartmentService {
    void addDepartment(Department department) throws EnrollmentException;
    void displayAllDepartments();
    String updateDepartment(Department department) throws EnrollmentException;
    String deleteDepartment(Department department) throws EnrollmentException;
    List<Department> getAllDepartments();
}
