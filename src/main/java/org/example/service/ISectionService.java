package org.example.service;

import org.example.model.Section;
import java.util.List;

public interface ISectionService {
    void addSection(Section section);
    void displayAllSections();
    String updateSection(Section section);
    String deleteSection(Section section);
    List<Section> getAllSections(); // Added
}
