package org.example.service;

import org.example.model.Instructor;
import org.example.model.Section;
import org.example.exception.*;
import java.util.ArrayList;
import java.util.List;

public class InstructorServiceImpl implements IInstructorService {
    private ArrayList<Instructor> instructorList = new ArrayList<>();

    @Override
    public void addInstructor(Instructor instructor) throws EnrollmentException {
        if (instructor.getName() == null || instructor.getName().isEmpty()) {
            throw new InvalidInputException("Instructor name cannot be empty.");
        }
        for (Instructor i : instructorList) {
            if (i.getID() == instructor.getID()) {
                throw new DuplicateEntryException("Instructor ID " + instructor.getID() + " already exists.");
            }
        }
        instructorList.add(instructor);
    }

    @Override
    public void displayALLInstructor(){
        System.out.println(instructorList);
    }

    @Override
    public String updateInstructor(Instructor instructor) throws EnrollmentException {
        for (int i = 0; i < instructorList.size(); i++){
            if(instructorList.get(i).getID() == instructor.getID()){
                instructorList.set(i, instructor);
                return "Updated Successfully";
            }
        }
        throw new RecordNotFoundException("Instructor with ID " + instructor.getID() + " not found.");
    }

    @Override
    public String deleteInstructor(Instructor instructor) throws EnrollmentException {
        for (int i = 0; i < instructorList.size(); i++) {
            if (instructorList.get(i).getID() == instructor.getID()) {
                instructorList.remove(i);
                return "Deleted Successfully";
            }
        }
        throw new RecordNotFoundException("Instructor with ID " + instructor.getID() + " not found.");
    }

    @Override
    public String assignInstructorToSection(Instructor instructor, Section section) throws EnrollmentException {
        if (section == null) throw new RecordNotFoundException("Section not found.");
        section.setAssignedInstructor(instructor);
        return "Instructor " + instructor.getName() + " assigned to Section " + section.getSectionName();
    }

    @Override
    public void getInstructorDetails(Instructor instructor) throws EnrollmentException {
        for (Instructor i : instructorList) {
            if (i.getID() == instructor.getID()) {
                System.out.println(i);
                return;
            }
        }
        throw new RecordNotFoundException("Instructor with ID " + instructor.getID() + " not found.");
    }

    @Override
    public List<Instructor> getAllInstructors() {
        return instructorList;
    }
}
