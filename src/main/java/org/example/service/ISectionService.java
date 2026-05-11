package org.example.service;

import org.example.model.Section;
import org.example.exception.EnrollmentException;
import java.util.List;

public interface ISectionService {
    void addSection(Section section) throws EnrollmentException;
    void displayAllSections();
    String updateSection(Section section) throws EnrollmentException;
    String deleteSection(Section section) throws EnrollmentException;
    List<Section> getAllSections();
}
