package org.example.service;

import java.util.*;
import org.example.model.Student;
import org.example.exception.*;

public class StudentServiceImpl implements IStudentService {
    private ArrayList<Student> studentList = new ArrayList<>();

    @Override
    public void addStudent(Student student) throws EnrollmentException {
        if (student.getStudentName() == null || student.getStudentName().isEmpty()) {
            throw new InvalidInputException("Student name cannot be empty.");
        }
        for (Student s : studentList) {
            if (s.getStudentID() == student.getStudentID()) {
                throw new DuplicateEntryException("Student ID " + student.getStudentID() + " already exists.");
            }
        }
        studentList.add(student);
    }

    @Override
    public void displayAllStudent(){
        System.out.println(studentList);
    }

    @Override
    public String updateStudent(Student student) throws EnrollmentException {
        for(int i = 0; i < studentList.size();i++){
            if(studentList.get(i).getStudentID() == student.getStudentID()){
                studentList.set(i, student);
                return "Successfully updated";
            }
        }
        throw new RecordNotFoundException("Student with ID " + student.getStudentID() + " not found.");
    }

    @Override
    public String removeStudent(Student student) throws EnrollmentException {
        for(int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getStudentID() == (student.getStudentID())){
                studentList.remove(i);
                return "Successfully removed.";
            }
        }
        throw new RecordNotFoundException("Student with ID " + student.getStudentID() + " not found.");
    }

    @Override
    public List<Student> getAllStudents() {
        return studentList;
    }
}
