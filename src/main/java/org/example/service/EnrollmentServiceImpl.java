package org.example.service;

import org.example.model.Student;
import org.example.model.Section;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnrollmentServiceImpl implements IEnrollmentService {
    private Map<Integer, List<Integer>> sectionEnrollments = new HashMap<>();

    @Override
    public String enrollStudentInSection(Student student, Section section) {
        List<Integer> students = sectionEnrollments.computeIfAbsent(section.getSectionID(), k -> new ArrayList<>());

        if (students.size() >= section.getMaxCapacity()) {
            return "Enrollment failed: Section " + section.getSectionName() + " is at full capacity (" + section.getMaxCapacity() + ").";
        }

        if (students.contains(student.getStudentID())) {
            return "Student " + student.getStudentName() + " is already enrolled in Section " + section.getSectionName();
        }

        students.add(student.getStudentID());
        return "Student " + student.getStudentName() + " successfully enrolled in Section " + section.getSectionName();
    }

    @Override
    public void viewDepartmentHierarchy() {
        System.out.println("\n--- Department Hierarchy ---");
        System.out.println("University");
        System.out.println(" └── College of Information Technology");
        System.out.println("     ├── BS Information Technology");
        System.out.println("     └── BS Computer Science");
        System.out.println(" └── College of Engineering");
        System.out.println("     └── BS Civil Engineering");
    }
}
