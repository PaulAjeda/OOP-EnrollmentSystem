package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentID("000123");
        student.setStudentName("John Doe");
        student.setProgram("Information Technology");

        System.out.println("\nStudent ID:" + student.getStudentID());
        System.out.println("Student Name:" + student.getStudentName());
        System.out.println("Program:\n" + student.getProgram());

        Student student2 = new Student();
        student.setStudentID("000124");
        student.setStudentName("Jane Doe");
        student.setProgram("Information Technology");

        System.out.println("\nStudent ID:" + student.getStudentID());
        System.out.println("Student Name:" + student.getStudentName());
        System.out.println("Program:\n" + student.getProgram());

        Course course = new Course();
        course.setCourseID("000123");
        course.setCourseName("John Doe");
        course.setProgram("Information Technology");

        System.out.println("\nCourse ID:" + course.getCourseID());
        System.out.println("Course Name:" + course.getCourseName());
        System.out.println("Program:\n" + course.getProgram());

        Course course2 = new Course();
        course.setCourseID("000123");
        course.setCourseName("Jane Doe");
        course.setProgram("Information Technology");

        System.out.println("\nCourse ID:" + course.getCourseID());
        System.out.println("Course Name:" + course.getCourseName());
        System.out.println("Program:\n" + course.getProgram());
    }
}