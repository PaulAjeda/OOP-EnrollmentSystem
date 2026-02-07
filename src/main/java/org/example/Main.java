package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentID("000123");
        student.setStudentName("John Doe");
        student.setProgram("Information Technology");

        student.display();

        Student student2 = new Student();
        student2.setStudentID("000124");
        student2.setStudentName("Jane Doe");
        student2.setProgram("Information Technology");

        student2.display();

        Course course = new Course();
        course.setCourseID("0001");
        course.setCourseName("Integrative Programming");
        course.setProgram("Information Technology");

        course.display();

        Course course2 = new Course();
        course2.setCourseID("0001");
        course2.setCourseName("Integrative Programming");
        course2.setProgram("Information Technology");

        course2.display();

    }
}