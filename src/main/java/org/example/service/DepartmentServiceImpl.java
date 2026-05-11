package org.example.service;

import org.example.model.Department;
import org.example.exception.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentServiceImpl implements IDepartmentService {
    private ArrayList<Department> departmentList = new ArrayList<>();

    @Override
    public void addDepartment(Department department) throws EnrollmentException {
        if (department.getDeptName() == null || department.getDeptName().isEmpty()) {
            throw new InvalidInputException("Department name cannot be empty.");
        }
        for (Department d : departmentList) {
            if (d.getDeptID() == department.getDeptID()) {
                throw new DuplicateEntryException("Department ID " + department.getDeptID() + " already exists.");
            }
        }
        departmentList.add(department);
    }

    @Override
    public void displayAllDepartments() {
        System.out.println(departmentList);
    }

    @Override
    public String updateDepartment(Department department) throws EnrollmentException {
        for (int i = 0; i < departmentList.size(); i++) {
            if (departmentList.get(i).getDeptID() == department.getDeptID()) {
                departmentList.set(i, department);
                return "Department updated successfully";
            }
        }
        throw new RecordNotFoundException("Department with ID " + department.getDeptID() + " not found.");
    }

    @Override
    public String deleteDepartment(Department department) throws EnrollmentException {
        for (int i = 0; i < departmentList.size(); i++) {
            if (departmentList.get(i).getDeptID() == department.getDeptID()) {
                departmentList.remove(i);
                return "Department deleted successfully";
            }
        }
        throw new RecordNotFoundException("Department with ID " + department.getDeptID() + " not found.");
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentList;
    }
}
