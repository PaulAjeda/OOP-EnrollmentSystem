package org.example.service;

import java.util.*;
import org.example.model.Student;

public class StudentRegistrationImpl implements StudentRegistration {
    private ArrayList<Student> studentList = new ArrayList<>();
    Scanner hh = new Scanner(System.in);

    //Create
    @Override
    public void addStudent(Student student){
        studentList.add(student);
    }

    //Read
    @Override
    public void displayAllStudent(){
        System.out.println(studentList);
    }

    //Update
    @Override
    public String updateStudent(Student student){

        for(int i = 0; i < studentList.size();i++){
            if(studentList.get(i).getStudentID() == student.getStudentID()){
                studentList.set(i, student);
                return "Successfully updated";
            }
        }
        return "Student not found";
    }
    //Remove
    @Override
    public String deleteStudent(Student student){
        for(int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getStudentID() == (student.getStudentID())){
                studentList.remove(i);
                return "Successfully deleted.";
            }
        }
        return "Error";
    }
}
