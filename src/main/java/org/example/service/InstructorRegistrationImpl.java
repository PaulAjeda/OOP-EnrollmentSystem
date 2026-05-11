package org.example.service;

import org.example.model.Instructor;
import java.util.ArrayList;
import java.util.Scanner;

public class InstructorRegistrationImpl implements InstructorRegistration {
    private ArrayList<Instructor> instructorList = new ArrayList();

    //Create
    @Override
    public void addInstructor(Instructor instructor){
        instructorList.add(instructor);
    }

    //Read
    @Override
    public void displayALLInstructor(){
        System.out.println(instructorList);
    }

    //Update
    @Override
    public String updateInstructor(Instructor instructor){
        for (int i = 0; i < instructorList.size(); i++){
            if(instructorList.get(i).getID() == instructor.getID()){
                instructorList.set(i, instructor);
                return "Updated Successfully";
            }
        }
        return "Instructor not found";
    }

    //Remove
    @Override
    public String deleteInstructor(Instructor instructor) {
        for (int i = 0; i < instructorList.size(); i++) {
            if (instructorList.get(i).getID() == (instructor.getID())) {
                instructorList.remove(i);
                return "Deleted Successfully";
            }
        }
        return "Error";
    }
}
