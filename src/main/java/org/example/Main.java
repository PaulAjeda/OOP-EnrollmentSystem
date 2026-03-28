package org.example;

import java.util.*;

import org.example.model.Student;
import org.example.model.Course;
import org.example.model.Instructor;
import org.example.service.StudentRegistration;
import org.example.service.CourseRegistration;
import org.example.service.InstructorRegistration;

public class Main {

    public static void main(String[] args) {
        Scanner hh = new Scanner(System.in);

        StudentRegistration studentRegistration = new StudentRegistration();
        CourseRegistration courseRegistration = new CourseRegistration();
        InstructorRegistration instructorRegistration = new InstructorRegistration();

        int mainChoice;

        System.out.println("=================================");
        System.out.println("   ENROLLMENT MANAGEMENT SYSTEM");
        System.out.println("       by: Paul Geneo Ajeda");
        System.out.println("=================================");

        do {
            System.out.println("\nMAIN MENU");
            System.out.println("[1] Student Menu");
            System.out.println("[2] Course Menu");
            System.out.println("[3] Instructor Menu");
            System.out.println("[0] Exit");
            System.out.print("Enter choice: ");
            mainChoice = hh.nextInt();
            hh.nextLine();

            switch (mainChoice) {

                // ================= STUDENT MENU =================
                case 1:
                    int sChoice;
                    do {
                        System.out.println("\nSTUDENT MENU");
                        System.out.println("[1] Add Student");
                        System.out.println("[2] Display Students");
                        System.out.println("[3] Update Student");
                        System.out.println("[4] Delete Student");
                        System.out.println("[0] Back");

                        System.out.print("Enter choice: ");
                        sChoice = hh.nextInt();
                        hh.nextLine();

                        switch (sChoice) {
                            case 1:
                                System.out.print("Enter ID: ");
                                int sid = hh.nextInt();
                                hh.nextLine();

                                System.out.print("Enter Name: ");
                                String sname = hh.nextLine();

                                System.out.print("Enter Program: ");
                                String sprog = hh.nextLine();

                                studentRegistration.addStudent(
                                        new Student(sid, sname, sprog)
                                );
                                System.out.println("Student added.");
                                break;

                            case 2:
                                studentRegistration.displayAll();
                                break;

                            case 3:
                                System.out.print("Enter ID to update: ");
                                sid = hh.nextInt();
                                hh.nextLine();

                                System.out.print("New Name: ");
                                sname = hh.nextLine();

                                System.out.print("New Program: ");
                                sprog = hh.nextLine();

                                System.out.println(
                                        studentRegistration.updateStudent(
                                                new Student(sid, sname, sprog)
                                        )
                                );
                                break;

                            case 4:
                                System.out.print("Enter ID to delete: ");
                                sid = hh.nextInt();
                                hh.nextLine();

                                System.out.println(
                                        studentRegistration.delete(
                                                new Student(sid)
                                        )
                                );
                                break;
                        }

                    } while (sChoice != 0);
                    break;

                // ================= COURSE MENU =================
                case 2:
                    int cChoice;
                    do {
                        System.out.println("\nCOURSE MENU");
                        System.out.println("[1] Add Course");
                        System.out.println("[2] Display Courses");
                        System.out.println("[3] Update Course");
                        System.out.println("[4] Delete Course");
                        System.out.println("[0] Back");

                        System.out.print("Enter choice: ");
                        cChoice = hh.nextInt();
                        hh.nextLine();

                        switch (cChoice) {
                            case 1:
                                System.out.print("Enter Course ID: ");
                                String cid = hh.nextLine();

                                System.out.print("Enter Course Name: ");
                                String cname = hh.nextLine();

                                System.out.print("Enter Program: ");
                                String cprog = hh.nextLine();

                                courseRegistration.addCourse(
                                        new Course(cid, cname, cprog)
                                );
                                System.out.println("Course added.");
                                break;

                            case 2:
                                courseRegistration.displayAll();
                                break;

                            case 3:
                                System.out.print("Enter Course ID to update: ");
                                cid = hh.nextLine();

                                System.out.print("New Course Name: ");
                                cname = hh.nextLine();

                                System.out.print("New Program: ");
                                cprog = hh.nextLine();

                                System.out.println(
                                        courseRegistration.updateCourse(
                                                new Course(cid, cname, cprog)
                                        )
                                );
                                break;

                            case 4:
                                System.out.print("Enter Course ID to delete: ");
                                cid = hh.nextLine();

                                System.out.println(
                                        courseRegistration.delete(
                                                new Course(cid, "", "")
                                        )
                                );
                                break;
                        }

                    } while (cChoice != 0);
                    break;

                // ================= INSTRUCTOR MENU =================
                case 3:
                    int iChoice;
                    do {
                        System.out.println("\nINSTRUCTOR MENU");
                        System.out.println("[1] Add Instructor");
                        System.out.println("[2] Display Instructors");
                        System.out.println("[3] Update Instructor");
                        System.out.println("[4] Delete Instructor");
                        System.out.println("[0] Back");

                        System.out.print("Enter choice: ");
                        iChoice = hh.nextInt();
                        hh.nextLine();

                        switch (iChoice) {
                            case 1:
                                System.out.print("Enter ID: ");
                                int iid = hh.nextInt();
                                hh.nextLine();

                                System.out.print("Enter Name: ");
                                String iname = hh.nextLine();

                                System.out.print("Enter Course: ");
                                String course = hh.nextLine();

                                instructorRegistration.saveInstructor(
                                        new Instructor(iid, iname, course)
                                );
                                System.out.println("Instructor added.");
                                break;

                            case 2:
                                instructorRegistration.displayAllInstructor();
                                break;

                            case 3:
                                System.out.print("Enter ID to update: ");
                                iid = hh.nextInt();
                                hh.nextLine();

                                System.out.print("New Name: ");
                                iname = hh.nextLine();

                                System.out.print("New Course: ");
                                course = hh.nextLine();

                                System.out.println(instructorRegistration.updateInstructor(new Instructor(iid, iname, course)));
                                break;

                            case 4:
                                System.out.print("Enter ID to delete: ");
                                iid = hh.nextInt();
                                hh.nextLine();

                                System.out.println(
                                        instructorRegistration.deleteInstructor(
                                                new Instructor(iid, "", "")
                                        )
                                );
                                break;
                        }

                    } while (iChoice != 0);
                    break;

                case 0:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (mainChoice != 0);

        hh.close();
    }
}


/*package org.example;
import java.util.*;

import org.example.model.Person;
import org.example.model.Course;
import org.example.model.Student;
import org.example.model.Instructor;
import org.example.service.StudentRegistration;
import org.example.service.CourseRegistration;
import org.example.service.InstructorRegistration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static String name = "";
    static String program = "";

    public static void main(String[] args) {
        Scanner hh = new Scanner(System.in);

        StudentRegistration studentRegistration = new StudentRegistration();
        CourseRegistration courseRegistration = new CourseRegistration();
        InstructorRegistration instructorRegistration = new InstructorRegistration();

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
//

 */