package org.example.service;

import org.example.model.*;

public class CampusRegistrar {
    private IStudentService studentService;
    private ICourseService courseService;
    private ISectionService sectionService;
    private IDepartmentService departmentService;
    private ITuitionService tuitionService;
    private IEnrollmentService enrollmentService;

    public CampusRegistrar(IStudentService studentService,
                           ICourseService courseService,
                           ISectionService sectionService,
                           IDepartmentService departmentService,
                           ITuitionService tuitionService,
                           IEnrollmentService enrollmentService) {
        this.studentService = studentService;
        this.courseService = courseService;
        this.sectionService = sectionService;
        this.departmentService = departmentService;
        this.tuitionService = tuitionService;
        this.enrollmentService = enrollmentService;
    }

    // Student operations
    public void addStudent(Student student) { studentService.addStudent(student); }
    public void displayAllStudent() { studentService.displayAllStudent(); }
    public String updateStudent(Student student) { return studentService.updateStudent(student); }
    public String removeStudent(Student student) { return studentService.removeStudent(student); }

    // Course operations
    public void addCourse(Course course) { courseService.addCourse(course); }
    public void displayAllCourse() { courseService.displayAllCourse(); }
    public String updateCourse(Course course) { return courseService.updateCourse(course); }
    public String removeCourse(Course course) { return courseService.removeCourse(course); }

    // Section operations
    public void addSection(Section section) { sectionService.addSection(section); }
    public void displayAllSections() { sectionService.displayAllSections(); }
    public String updateSection(Section section) { return sectionService.updateSection(section); }
    public String deleteSection(Section section) { return sectionService.deleteSection(section); }

    // Department operations
    public void addDepartment(Department department) { departmentService.addDepartment(department); }
    public void displayAllDepartments() { departmentService.displayAllDepartments(); }
    public String updateDepartment(Department department) { return departmentService.updateDepartment(department); }
    public String deleteDepartment(Department department) { return departmentService.deleteDepartment(department); }

    // Tuition operations
    public void calculateFee(int studentID, int units) { tuitionService.calculateFee(studentID, units); }
    public String makePayment(int studentID, double amount) { return tuitionService.makePayment(studentID, amount); }
    public double getRemainingBalance(int studentID) { return tuitionService.getRemainingBalance(studentID); }
    public void displayPaymentInfo(int studentID) { tuitionService.displayPaymentInfo(studentID); }

    // Enrollment operations
    public String enrollStudentInSection(Student student, Section section) { return enrollmentService.enrollStudentInSection(student, section); }
    public void viewDepartmentHierarchy() { enrollmentService.viewDepartmentHierarchy(); }
}
