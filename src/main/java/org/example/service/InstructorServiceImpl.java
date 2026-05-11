package org.example.service;

import org.example.model.Instructor;
import org.example.model.Section;
import java.util.ArrayList;

public class InstructorServiceImpl implements IInstructorService {
    private ArrayList<Instructor> instructorList = new ArrayList<>();

    @Override
    public void addInstructor(Instructor instructor){
        instructorList.add(instructor);
    }

    @Override
    public void displayALLInstructor(){
        System.out.println(instructorList);
    }

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

    @Override
    public String deleteInstructor(Instructor instructor) {
        for (int i = 0; i < instructorList.size(); i++) {
            if (instructorList.get(i).getID() == instructor.getID()) {
                instructorList.remove(i);
                return "Deleted Successfully";
            }
        }
        return "Error";
    }

    @Override
    public String assignInstructorToSection(Instructor instructor, Section section) {
        return "Instructor " + instructor.getName() + " assigned to Section " + section.getSectionName();
    }

    @Override
    public void getInstructorDetails(Instructor instructor) {
        for (Instructor i : instructorList) {
            if (i.getID() == instructor.getID()) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("Instructor not found.");
    }
}
