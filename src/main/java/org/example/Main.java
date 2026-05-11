package org.example;

import java.util.*;
import org.example.model.*;
import org.example.service.*;

public class Main {

    public static void main(String[] args) {
        Scanner hh = new Scanner(System.in);

        // Service Implementations
        IStudentService studentService = new StudentServiceImpl();
        ICourseService courseService = new CourseServiceImpl();
        IInstructorService instructorService = new InstructorServiceImpl();
        ISectionService sectionService = new SectionServiceImpl();
        IDepartmentService departmentService = new DepartmentServiceImpl();
        ITuitionService tuitionService = new TuitionServiceImpl();


        CampusRegistrar campusRegistrar = new CampusRegistrar(
                studentService,
                courseService,
                sectionService,
                departmentService,
                tuitionService
        );

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
            System.out.println("[5] Department Menu");
            System.out.println("[6] Tuition Fee Menu");
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
                        System.out.println("[4] Remove Student");
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
                                System.out.print("Enter ID to remove: ");
                                sid = hh.nextInt();
                                hh.nextLine();
                                System.out.println(campusRegistrar.removeStudent(new Student(sid)));
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
                        System.out.println("[4] Remove Course");
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
                                System.out.print("Enter Course ID to remove: ");
                                cid = hh.nextLine();
                                System.out.println(campusRegistrar.removeCourse(new Course(cid, "", "")));
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
                                instructorService.addInstructor(new Instructor(iid, iname, course));
                                System.out.println("Instructor added.");
                                break;
                            case 2:
                                instructorService.displayALLInstructor();
                                break;
                            case 3:
                                System.out.print("Enter ID to update: ");
                                iid = hh.nextInt();
                                hh.nextLine();
                                System.out.print("New Name: ");
                                iname = hh.nextLine();
                                System.out.print("New Course: ");
                                course = hh.nextLine();
                                System.out.println(instructorService.updateInstructor(new Instructor(iid, iname, course)));
                                break;
                            case 4:
                                System.out.print("Enter ID to delete: ");
                                iid = hh.nextInt();
                                hh.nextLine();
                                System.out.println(instructorService.deleteInstructor(new Instructor(iid, "", "")));
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
                                System.out.print("Enter Max Capacity: ");
                                int cap = hh.nextInt();
                                campusRegistrar.addSection(new Section(secid, secname, cap));
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
                                System.out.print("New Max Capacity: ");
                                cap = hh.nextInt();
                                Section s = new Section(secid, secname);
                                s.setMaxCapacity(cap);
                                System.out.println(campusRegistrar.updateSection(s));
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

                // ================= DEPARTMENT MENU =================
                case 5:
                    int dChoice;
                    do {
                        System.out.println("\nDEPARTMENT MENU");
                        System.out.println("[1] Add Department");
                        System.out.println("[2] Display Departments");
                        System.out.println("[3] Update Department");
                        System.out.println("[4] Delete Department");
                        System.out.println("[0] Back");
                        System.out.print("Enter choice: ");
                        dChoice = hh.nextInt();
                        hh.nextLine();

                        switch (dChoice) {
                            case 1:
                                System.out.print("Enter Department ID: ");
                                int did = hh.nextInt();
                                hh.nextLine();
                                System.out.print("Enter Department Name: ");
                                String dname = hh.nextLine();
                                campusRegistrar.addDepartment(new Department(did, dname));
                                System.out.println("Department added.");
                                break;
                            case 2:
                                campusRegistrar.displayAllDepartments();
                                break;
                            case 3:
                                System.out.print("Enter Department ID to update: ");
                                did = hh.nextInt();
                                hh.nextLine();
                                System.out.print("New Department Name: ");
                                dname = hh.nextLine();
                                System.out.println(campusRegistrar.updateDepartment(new Department(did, dname)));
                                break;
                            case 4:
                                System.out.print("Enter Department ID to delete: ");
                                did = hh.nextInt();
                                hh.nextLine();
                                System.out.println(campusRegistrar.deleteDepartment(new Department(did, "")));
                                break;
                        }
                    } while (dChoice != 0);
                    break;

                // ================= TUITION FEE MENU =================
                case 6:
                    int tChoice;
                    do {
                        System.out.println("\nTUITION FEE MENU");
                        System.out.println("[1] Calculate Fee");
                        System.out.println("[2] Make Payment");
                        System.out.println("[3] Check Balance");
                        System.out.println("[4] Display Payment Info");
                        System.out.println("[0] Back");
                        System.out.print("Enter choice: ");
                        tChoice = hh.nextInt();
                        hh.nextLine();

                        int tid;
                        switch (tChoice) {
                            case 1:
                                System.out.print("Enter Student ID: ");
                                tid = hh.nextInt();
                                System.out.print("Enter Number of Units: ");
                                int units = hh.nextInt();
                                campusRegistrar.calculateFee(tid, units);
                                break;
                            case 2:
                                System.out.print("Enter Student ID: ");
                                tid = hh.nextInt();
                                System.out.print("Enter Payment Amount: ");
                                double amount = hh.nextDouble();
                                System.out.println(campusRegistrar.makePayment(tid, amount));
                                break;
                            case 3:
                                System.out.print("Enter Student ID: ");
                                tid = hh.nextInt();
                                double balance = campusRegistrar.getRemainingBalance(tid);
                                System.out.println("Remaining Balance: " + balance);
                                break;
                            case 4:
                                System.out.print("Enter Student ID: ");
                                tid = hh.nextInt();
                                campusRegistrar.displayPaymentInfo(tid);
                                break;
                        }
                    } while (tChoice != 0);
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