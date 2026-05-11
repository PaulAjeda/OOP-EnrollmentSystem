package org.example.service;

import java.util.ArrayList;
import org.example.model.Course;
import java.util.*;

public class CourseRegistrationImpl implements CourseRegistration {
    private ArrayList<Course> courseList = new ArrayList<>();

    //Create
    @Override
    public void addCourse(Course course){
        courseList.add(course);
    }

    //Read
    @Override
    public void displayAllCourse(){
        System.out.println(courseList);
    }

    //Update
    @Override
    public String updateCourse(Course course){
        for (int i = 0; i < courseList.size(); i++){
            if(courseList.get(i).getCourseID().equals(course.getCourseID())){
                courseList.set(i, course);
                return "Course updated successfully";
            }
        }
        return "Course not found";
    }
    //Remove
    @Override
    public String deleteCourse(Course course){
        for(int i = 0; i < courseList.size(); i++){
            if(courseList.get(i).getCourseID().equals(course.getCourseID())){
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
                '}';
    }
}
