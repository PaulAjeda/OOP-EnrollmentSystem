package org.example.service;

import org.example.model.Student;
import org.example.model.Course;
import org.example.model.Section;
import org.example.model.Department;

public class CampusRegistrar {
    private StudentRegistration studentRegistration;
    private CourseRegistration courseRegistration;
    private SectionRegistration sectionRegistration;
    private DepartmentRegistration departmentRegistration;

    public CampusRegistrar(StudentRegistration studentRegistration, CourseRegistration courseRegistration, SectionRegistration sectionRegistration, DepartmentRegistration departmentRegistration) {
        this.studentRegistration = studentRegistration;
        this.courseRegistration = courseRegistration;
        this.sectionRegistration = sectionRegistration;
        this.departmentRegistration = departmentRegistration;
    }

    // Student
    public void addStudent(Student student) {
        studentRegistration.addStudent(student);
    }

    public void displayAllStudent() {
        studentRegistration.displayAllStudent();
    }

    public String updateStudent(Student student) {
        return studentRegistration.updateStudent(student);
    }

    public String deleteStudent(Student student) {
        return studentRegistration.deleteStudent(student);
    }

    // Course
    public void addCourse(Course course) {
        courseRegistration.addCourse(course);
    }

    public void displayAllCourse() {
        courseRegistration.displayAllCourse();
    }

    public String updateCourse(Course course) {
        return courseRegistration.updateCourse(course);
    }

    public String deleteCourse(Course course) {
        return courseRegistration.deleteCourse(course);
    }

    // Section
    public void addSection(Section section) {
        sectionRegistration.addSection(section);
    }

    public void displayAllSections() {
        sectionRegistration.displayAllSections();
    }

    public String updateSection(Section section) {
        return sectionRegistration.updateSection(section);
    }

    public String deleteSection(Section section) {
        return sectionRegistration.deleteSection(section);
    }

    // Department
    public void addDepartment(Department department) {
        departmentRegistration.addDepartment(department);
    }

    public void displayAllDepartments() {
        departmentRegistration.displayAllDepartments();
    }

    public String updateDepartment(Department department) {
        return departmentRegistration.updateDepartment(department);
    }

    public String deleteDepartment(Department department) {
        return departmentRegistration.deleteDepartment(department);
    }
}
