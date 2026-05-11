package org.example.service;

import org.example.model.Instructor;

public interface InstructorRegistration {
    void addInstructor(Instructor instructor);
    void displayALLInstructor();
    String updateInstructor(Instructor instructor);
    String deleteInstructor(Instructor instructor);
}
