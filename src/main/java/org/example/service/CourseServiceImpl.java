package org.example.service;

import org.example.model.Course;
import java.util.ArrayList;
import java.util.List;

public class CourseServiceImpl implements ICourseService {
    private ArrayList<Course> courseList = new ArrayList<>();

    @Override
    public void addCourse(Course course) {
        courseList.add(course);
    }

    @Override
    public void displayAllCourse() {
        System.out.println(courseList);
    }

    @Override
    public String updateCourse(Course course) {
        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).getCourseID().equals(course.getCourseID())) {
                courseList.set(i, course);
                return "Course updated successfully";
            }
        }
        return "Course not found";
    }

    @Override
    public String removeCourse(Course course) {
        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).getCourseID().equals(course.getCourseID())) {
                courseList.remove(i);
                return "Course removed successfully";
            }
        }
        return "Course not found";
    }

    @Override
    public List<Course> getAllCourses() {
        return courseList;
    }
}
