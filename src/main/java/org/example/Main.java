package org.example;

import org.example.model.Course;
import org.example.model.Student;
import org.example.service.StudentRegistration;
import org.example.service.CourseRegistration;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static String name = "";
    static String program = "";

    public static void main(String[] args) {
        Scanner hh = new Scanner(System.in);

        StudentRegistration studentRegistration = new StudentRegistration();

        int choice;
        int studID;
        String studName = "";
        String program = "";

        do {
            System.out.println("[0] Exit");
            System.out.println("[1] Save Student");
            System.out.println("[2] Display Student");
            System.out.println("[3] Update Student");
            System.out.println("[4] Remove Student");

            System.out.println("Enter choice: ");
            choice = hh.nextInt();
            hh.nextLine();

            switch (choice) {
                case 1:
                    //Create
                    System.out.print("Enter student ID: ");
                    studID = hh.nextInt();
                    hh.nextLine();

                    System.out.print("Enter student name: ");
                    studName = hh.nextLine();

                    System.out.print("Enter program: ");
                    program = hh.nextLine();

                    studentRegistration.addStudent(new Student(studID, studName, program));
                    break;

                case 2:
                    //Read

                    studentRegistration.displayAll();
                    break;

                case 3:
                    //Update
                    System.out.print("Enter student ID to be updated: ");
                    studID = hh.nextInt();
                    hh.nextLine();

                    studentRegistration.updateStudent(new Student(studID));
                    break;

                case 4:
                    //Delete
                    System.out.print("Enter student ID to be removed: ");
                    studID = hh.nextInt();
                    hh.nextLine();

                    studentRegistration.delete(new Student(studID));
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 0);
    }
}
//    public static void main(String[] args) {
//        Student student = new Student();
//        student.setStudentID("000123");
//        student.setStudentName("John Doe");
//        student.setProgram("Information Technology");
//
//        student.display();
//
//        Student student2 = new Student();
//        student2.setStudentID("000124");
//        student2.setStudentName("Jane Doe");
//        student2.setProgram("Information Technology");
//
//        student2.display();
//
//        Course course = new Course();
//        course.setCourseID("0001");
//        course.setCourseName("Integrative Programming");
//        course.setProgram("Information Technology");
//
//        course.display();
//
//        Course course2 = new Course();
//        course2.setCourseID("0001");
//        course2.setCourseName("Integrative Programming");
//        course2.setProgram("Information Technology");
//
//        course2.display();
//
//    }
//}