package org.example.service;

import org.example.model.Department;
import java.util.List;

public interface IDepartmentService {
    void addDepartment(Department department);
    void displayAllDepartments();
    String updateDepartment(Department department);
    String deleteDepartment(Department department);
    List<Department> getAllDepartments(); // Added
}
