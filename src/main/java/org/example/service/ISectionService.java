package org.example.service;

import org.example.model.Section;

public interface ISectionService {
    void addSection(Section section);
    void displayAllSections();
    String updateSection(Section section);
    String deleteSection(Section section);
}
