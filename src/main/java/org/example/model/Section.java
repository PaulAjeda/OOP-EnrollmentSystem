package org.example.model;

public class Section {
    private int sectionID;
    private String sectionName;
    private int maxCapacity;
    private int departmentID; // Added for hierarchy
    private Instructor assignedInstructor; // Added for hierarchy

    public Section() {
    }

    public Section(int sectionID, String sectionName) {
        this(sectionID, sectionName, 30);
    }

    public Section(int sectionID, String sectionName, int maxCapacity) {
        this.sectionID = sectionID;
        this.sectionName = sectionName;
        this.maxCapacity = maxCapacity;
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

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public Instructor getAssignedInstructor() {
        return assignedInstructor;
    }

    public void setAssignedInstructor(Instructor assignedInstructor) {
        this.assignedInstructor = assignedInstructor;
    }

    @Override
    public String toString() {
        return "Section{" +
                "sectionID=" + sectionID +
                ", sectionName='" + sectionName + '\'' +
                ", maxCapacity=" + maxCapacity +
                ", deptID=" + departmentID +
                ", instructor=" + (assignedInstructor != null ? assignedInstructor.getName() : "None") +
                '}';
    }
}
