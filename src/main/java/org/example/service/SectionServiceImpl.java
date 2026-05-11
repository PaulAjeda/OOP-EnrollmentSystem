package org.example.service;

import org.example.model.Section;
import org.example.exception.*;
import java.util.ArrayList;
import java.util.List;

public class SectionServiceImpl implements ISectionService {
    private ArrayList<Section> sectionList = new ArrayList<>();

    @Override
    public void addSection(Section section) throws EnrollmentException {
        if (section.getMaxCapacity() <= 0) {
            throw new InvalidInputException("Section capacity must be a positive integer.");
        }
        for (Section s : sectionList) {
            if (s.getSectionID() == section.getSectionID()) {
                throw new DuplicateEntryException("Section ID " + section.getSectionID() + " already exists.");
            }
        }
        sectionList.add(section);
    }

    @Override
    public void displayAllSections() {
        System.out.println(sectionList);
    }

    @Override
    public String updateSection(Section section) throws EnrollmentException {
        for (int i = 0; i < sectionList.size(); i++) {
            if (sectionList.get(i).getSectionID() == section.getSectionID()) {
                sectionList.set(i, section);
                return "Section updated successfully";
            }
        }
        throw new RecordNotFoundException("Section with ID " + section.getSectionID() + " not found.");
    }

    @Override
    public String deleteSection(Section section) throws EnrollmentException {
        for (int i = 0; i < sectionList.size(); i++) {
            if (sectionList.get(i).getSectionID() == section.getSectionID()) {
                sectionList.remove(i);
                return "Section deleted successfully";
            }
        }
        throw new RecordNotFoundException("Section with ID " + section.getSectionID() + " not found.");
    }

    @Override
    public List<Section> getAllSections() {
        return sectionList;
    }
}
