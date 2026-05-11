package org.example.service;

import org.example.model.Instructor;
import org.example.model.Section;
import org.example.exception.EnrollmentException;
import java.util.List;

public interface IInstructorService {
    void addInstructor(Instructor instructor) throws EnrollmentException;
    void displayALLInstructor();
    String updateInstructor(Instructor instructor) throws EnrollmentException;
    String deleteInstructor(Instructor instructor) throws EnrollmentException;
    String assignInstructorToSection(Instructor instructor, Section section) throws EnrollmentException;
    void getInstructorDetails(Instructor instructor) throws EnrollmentException;
    List<Instructor> getAllInstructors();
}
