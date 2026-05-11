package org.example.service;

import org.example.model.*;
import org.example.exception.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnrollmentServiceImpl implements IEnrollmentService {
    private Map<Integer, List<Integer>> sectionEnrollments = new HashMap<>();

    @Override
    public String enrollStudentInSection(Student student, Section section) throws EnrollmentException {
        if (student == null) throw new RecordNotFoundException("Enrollment Error: Student not found.");
        if (section == null) throw new RecordNotFoundException("Enrollment Error: Section not found.");

        List<Integer> students = sectionEnrollments.computeIfAbsent(section.getSectionID(), k -> new ArrayList<>());

        if (students.size() >= section.getMaxCapacity()) {
            throw new CapacityExceededException("Enrollment failed: Section " + section.getSectionName() + " is at full capacity (" + section.getMaxCapacity() + ").");
        }

        if (students.contains(student.getStudentID())) {
            throw new DuplicateEntryException("Student " + student.getStudentName() + " is already enrolled in Section " + section.getSectionName());
        }

        students.add(student.getStudentID());
        return "Student " + student.getStudentName() + " successfully enrolled in Section " + section.getSectionName();
    }

    @Override
    public void viewDepartmentHierarchy(List<Department> departments, List<Section> sections, List<Student> allStudents) {
        System.out.println("\n--- INSTITUTIONAL HIERARCHY ---");

        if (departments.isEmpty()) {
            System.out.println("No departments registered.");
            return;
        }

        for (Department dept : departments) {
            System.out.println("Department: " + dept.getDeptName() + " (ID: " + dept.getDeptID() + ")");

            boolean hasSections = false;
            for (Section sec : sections) {
                if (sec.getDepartmentID() == dept.getDeptID()) {
                    hasSections = true;
                    System.out.println("  └── Section: " + sec.getSectionName() + " (ID: " + sec.getSectionID() + ")");

                    String instName = (sec.getAssignedInstructor() != null) ? sec.getAssignedInstructor().getName() : "None Assigned";
                    System.out.println("      ├── Instructor: " + instName);

                    System.out.println("      └── Enrolled Students:");
                    List<Integer> studentIDs = sectionEnrollments.get(sec.getSectionID());
                    if (studentIDs == null || studentIDs.isEmpty()) {
                        System.out.println("          └── None");
                    } else {
                        for (Integer sid : studentIDs) {
                            String sname = "Unknown Student";
                            for (Student s : allStudents) {
                                if (s.getStudentID() == sid) {
                                    sname = s.getStudentName();
                                    break;
                                }
                            }
                            System.out.println("          └── " + sname + " (ID: " + sid + ")");
                        }
                    }
                }
            }
            if (!hasSections) {
                System.out.println("  └── No sections assigned to this department.");
            }
            System.out.println();
        }
    }
}
