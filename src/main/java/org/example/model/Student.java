package org.example.model;

public class Student extends Person {
    private String program;

    public Student() {
        super(0, "Unknown Student");
        this.program = "Information Technology";
    }

    public Student(int ID) {
        super(ID, "Unknown Student");
        this.program = "Information Technology";
    }

    public Student(int ID, String name, String program) {
        super(ID, name);
        this.program = program;
    }

    public int getStudentID() {
        return getID();
    }

    public String getStudentName() {
        return getName();
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public void mainTask() {
        System.out.println("Attend classes and complete assignments.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + getID() +
                ", Name='" + getName() + '\'' +
                ", Program='" + program + '\'' +
                '}';
    }
}
