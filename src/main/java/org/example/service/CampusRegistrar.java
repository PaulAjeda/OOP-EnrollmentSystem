package org.example.service;

import org.example.model.Student;
import org.example.model.Course;
import org.example.service.StudentRegistration;
import org.example.service.CourseRegistration;

public class CampusRegistrar {
    private StudentRegistration studentRegistration;
    private CourseRegistration courseRegistration;

    public CampusRegistrar(StudentRegistration studentRegistration, CourseRegistration courseRegistration){
        this.studentRegistration = studentRegistration;
        this.courseRegistration = courseRegistration;
    }

    // Student
    public void addStudent(Student student){
        studentRegistration.addStudent(student);
    }

    public void displayAllStudent(){
        studentRegistration.displayAllStudent();
    }

    public String updateStudent(Student student){
        return studentRegistration.updateStudent(student);
    }

    public String deleteStudent(Student student){
        return studentRegistration.deleteStudent(student);

    }

    // Course
    public void addCourse(Course course){
        courseRegistration.addCourse(course);
    }

    public void displayAllCourse(){
        courseRegistration.displayAllCourse();
    }

    public String updateCourse(Course course){
        return courseRegistration.updateCourse(course);
    }

    public String deleteCourse(Course course){
        return courseRegistration.deleteCourse(course);
    }
}
