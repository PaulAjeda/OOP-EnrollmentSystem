package org.example.service;

import org.example.model.Course;
import java.util.*;

public class CourseRegistration {
    private ArrayList<Course> courseList = new ArrayList<>();
    Scanner hh = new Scanner(System.in);

    //Create
    public void addCourse(Course course){
        courseList.add(course);
    }

    //Read
    public void displayAll(){
        System.out.println(courseList);
    }

    //Update
    public String updateCourse(Course course){
        for (int i = 0; i < courseList.size(); i++){
            if(courseList.get(i).getCourseID() == course.getCourseID()){
                courseList.set(i, course);
                return "Course updated successfully";
            }
        }
        return "Course not found";
    }
    //Remove
    public String delete(Course course){
        for(int i = 0; i < courseList.size(); i++){
            if(courseList.get(i).getCourseID() == (course.getCourseID())){
                courseList.remove(i);
                return "Successfully deleted.";
            }
        }
        return "Error";
    }

    @Override
    public String toString() {
        return "CourseRegistration{" +
                "courseList=" + courseList +
                ", hh=" + hh +
                '}';
    }
}
