package org.example.service;

import org.example.model.Instructor;
import java.util.ArrayList;
import java.util.Scanner;

public class InstructorRegistration {
    private ArrayList<Instructor> instructorList = new ArrayList();
    Scanner scan = new Scanner(System.in);

    //Create
    public void saveInstructor(Instructor instructor){
        instructorList.add(instructor);
    }

    //Read
    public void displayAllInstructor(){
        System.out.println(instructorList);
    }

    //Update
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
