package org.example.model;

public class Section {
    private int sectionID;
    private String sectionName;

    public Section() {
    }

    public Section(int sectionID, String sectionName) {
        this.sectionID = sectionID;
        this.sectionName = sectionName;
    }

    public int getSectionID() {
        return sectionID;
    }

    public void setSectionID(int sectionID) {
        this.sectionID = sectionID;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    @Override
    public String toString() {
        return "Section{" +
                "sectionID=" + sectionID +
                ", sectionName='" + sectionName + '\'' +
                '}';
    }
}
