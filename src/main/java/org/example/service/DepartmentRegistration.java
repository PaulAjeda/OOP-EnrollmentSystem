package org.example.service;

import org.example.model.Department;

public interface DepartmentRegistration {
    void addDepartment(Department department);
    void displayAllDepartments();
    String updateDepartment(Department department);
    String deleteDepartment(Department department);
}

