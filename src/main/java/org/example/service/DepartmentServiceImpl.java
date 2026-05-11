package org.example.service;

import org.example.model.Department;
import java.util.ArrayList;

public class DepartmentServiceImpl implements IDepartmentService {
    private ArrayList<Department> departmentList = new ArrayList<>();

    @Override
    public void addDepartment(Department department) {
        departmentList.add(department);
    }

    @Override
    public void displayAllDepartments() {
        System.out.println(departmentList);
    }

    @Override
    public String updateDepartment(Department department) {
        for (int i = 0; i < departmentList.size(); i++) {
            if (departmentList.get(i).getDeptID() == department.getDeptID()) {
                departmentList.set(i, department);
                return "Department updated successfully";
            }
        }
        return "Department not found";
    }

    @Override
    public String deleteDepartment(Department department) {
        for (int i = 0; i < departmentList.size(); i++) {
            if (departmentList.get(i).getDeptID() == department.getDeptID()) {
                departmentList.remove(i);
                return "Department deleted successfully";
            }
        }
        return "Department not found";
    }
}
