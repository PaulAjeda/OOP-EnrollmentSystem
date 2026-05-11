package org.example.service;

import java.util.*;
import org.example.model.Student;

public class StudentServiceImpl implements IStudentService {
    private ArrayList<Student> studentList = new ArrayList<>();

    @Override
    public void addStudent(Student student){
        studentList.add(student);
    }

    @Override
    public void displayAllStudent(){
        System.out.println(studentList);
    }

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

    @Override
    public String removeStudent(Student student){
        for(int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getStudentID() == (student.getStudentID())){
                studentList.remove(i);
                return "Successfully removed.";
            }
        }
        return "Error";
    }

    @Override
    public List<Student> getAllStudents() {
        return studentList;
    }
}
