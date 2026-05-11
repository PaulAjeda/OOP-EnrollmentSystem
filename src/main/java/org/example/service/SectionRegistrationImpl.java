package org.example.service;

import org.example.model.Section;
import java.util.ArrayList;

public class SectionRegistrationImpl implements SectionRegistration {
    private ArrayList<Section> sectionList = new ArrayList<>();

    @Override
    public void addSection(Section section) {
        sectionList.add(section);
    }

    @Override
    public void displayAllSections() {
        System.out.println(sectionList);
    }

    @Override
    public String updateSection(Section section) {
        for (int i = 0; i < sectionList.size(); i++) {
            if (sectionList.get(i).getSectionID() == section.getSectionID()) {
                sectionList.set(i, section);
                return "Section updated successfully";
            }
        }
        return "Section not found";
    }

    @Override
    public String deleteSection(Section section) {
        for (int i = 0; i < sectionList.size(); i++) {
            if (sectionList.get(i).getSectionID() == section.getSectionID()) {
                sectionList.remove(i);
                return "Section deleted successfully";
            }
        }
        return "Section not found";
    }
}
