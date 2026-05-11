package org.example;

import java.util.*;
import org.example.model.*;
import org.example.service.*;

public class Main {

    public static void main(String[] args) {
        Scanner hh = new Scanner(System.in);

        // Service Implementations
        StudentRegistrationImpl studentRegistration = new StudentRegistrationImpl();
        CourseRegistrationImpl courseRegistration = new CourseRegistrationImpl();
        InstructorRegistrationImpl instructorRegistration = new InstructorRegistrationImpl();
        SectionRegistrationImpl sectionRegistration = new SectionRegistrationImpl();

        // Facade
        CampusRegistrar campusRegistrar = new CampusRegistrar(studentRegistration, courseRegistration, sectionRegistration);

        int mainChoice;

        System.out.println("=================================");
        System.out.println("   ENROLLMENT MANAGEMENT SYSTEM  ");
        System.out.println("       by: Paul Geneo Ajeda      ");
        System.out.println("=================================");

        do {
            System.out.println("\nMAIN MENU");
            System.out.println("[1] Student Menu");
            System.out.println("[2] Course Menu");
            System.out.println("[3] Instructor Menu");
            System.out.println("[4] Section Menu");
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
                                campusRegistrar.addStudent(new Student(sid, sname, sprog));
                                System.out.println("Student added.");
                                break;
                            case 2:
                                campusRegistrar.displayAllStudent();
                                break;
                            case 3:
                                System.out.print("Enter ID to update: ");
                                sid = hh.nextInt();
                                hh.nextLine();
                                System.out.print("New Name: ");
                                sname = hh.nextLine();
                                System.out.print("New Program: ");
                                sprog = hh.nextLine();
                                System.out.println(campusRegistrar.updateStudent(new Student(sid, sname, sprog)));
                                break;
                            case 4:
                                System.out.print("Enter ID to delete: ");
                                sid = hh.nextInt();
                                hh.nextLine();
                                System.out.println(campusRegistrar.deleteStudent(new Student(sid)));
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
                                campusRegistrar.addCourse(new Course(cid, cname, cprog));
                                System.out.println("Course added.");
                                break;
                            case 2:
                                campusRegistrar.displayAllCourse();
                                break;
                            case 3:
                                System.out.print("Enter Course ID to update: ");
                                cid = hh.nextLine();
                                System.out.print("New Course Name: ");
                                cname = hh.nextLine();
                                System.out.print("New Program: ");
                                cprog = hh.nextLine();
                                System.out.println(campusRegistrar.updateCourse(new Course(cid, cname, cprog)));
                                break;
                            case 4:
                                System.out.print("Enter Course ID to delete: ");
                                cid = hh.nextLine();
                                System.out.println(campusRegistrar.deleteCourse(new Course(cid, "", "")));
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
                                instructorRegistration.addInstructor(new Instructor(iid, iname, course));
                                System.out.println("Instructor added.");
                                break;
                            case 2:
                                instructorRegistration.displayALLInstructor();
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
                                System.out.println(instructorRegistration.deleteInstructor(new Instructor(iid, "", "")));
                                break;
                        }
                    } while (iChoice != 0);
                    break;

                // ================= SECTION MENU =================
                case 4:
                    int secChoice;
                    do {
                        System.out.println("\nSECTION MENU");
                        System.out.println("[1] Add Section");
                        System.out.println("[2] Display Sections");
                        System.out.println("[3] Update Section");
                        System.out.println("[4] Delete Section");
                        System.out.println("[0] Back");

                        System.out.print("Enter choice: ");
                        secChoice = hh.nextInt();
                        hh.nextLine();

                        switch (secChoice) {
                            case 1:
                                System.out.print("Enter Section ID: ");
                                int secid = hh.nextInt();
                                hh.nextLine();
                                System.out.print("Enter Section Name: ");
                                String secname = hh.nextLine();
                                campusRegistrar.addSection(new Section(secid, secname));
                                System.out.println("Section added.");
                                break;
                            case 2:
                                campusRegistrar.displayAllSections();
                                break;
                            case 3:
                                System.out.print("Enter Section ID to update: ");
                                secid = hh.nextInt();
                                hh.nextLine();
                                System.out.print("New Section Name: ");
                                secname = hh.nextLine();
                                System.out.println(campusRegistrar.updateSection(new Section(secid, secname)));
                                break;
                            case 4:
                                System.out.print("Enter Section ID to delete: ");
                                secid = hh.nextInt();
                                hh.nextLine();
                                System.out.println(campusRegistrar.deleteSection(new Section(secid, "")));
                                break;
                        }
                    } while (secChoice != 0);
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