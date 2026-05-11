package org.example.service;

import org.example.model.Instructor;
import org.example.model.Section;
import java.util.List;

public interface IInstructorService {
    void addInstructor(Instructor instructor);
    void displayALLInstructor();
    String updateInstructor(Instructor instructor);
    String deleteInstructor(Instructor instructor);
    String assignInstructorToSection(Instructor instructor, Section section);
    void getInstructorDetails(Instructor instructor);
    List<Instructor> getAllInstructors(); // Added
}
