package org.example.model;

public class Student {
    private int StudentID;
    private String studentName;
    private String program;

    public Student(){
        this(0);
    }

    public Student(int StudentID){
        this(StudentID, "Unknown");
    }

    public Student(int StudentID, String studentName){
        this(StudentID, studentName, "Information Technology");
        }

        public Student(int ID, String name, String program) {

        this.StudentID = ID;
        this.studentName = name;
        this.program = program;
    }

    public int getStudentID(){ return StudentID; }

/*    public void setStudentID(String studentID) {
        this.StudentID = studentID;
    }
*/
    public String getStudentName(){
        return studentName;
    }

    public void setName(String name){
        this.studentName = name;
    }

    public String getProgram(){
        return program;
    }

    public void setProgram(String program){
        this.program = program;
    }

    public void display(){
        System.out.println("\nStudent ID:" + getStudentID());
        System.out.println("Student Name:" + getStudentName());
        System.out.println("Program:" + getProgram());
    }
    @Override
    public String toString() {
        return "Student{" +
                "StudentID=" + StudentID +
                ", studentName='" + studentName + '\'' +
                ", program='" + program + '\'' +
                '}';
    }
}


