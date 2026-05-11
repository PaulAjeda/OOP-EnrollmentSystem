package org.example.service;

import org.example.model.Course;
import org.example.exception.*;
import java.util.ArrayList;
import java.util.List;

public class CourseServiceImpl implements ICourseService {
    private ArrayList<Course> courseList = new ArrayList<>();

    @Override
    public void addCourse(Course course) throws EnrollmentException {
        if (course.getCourseID() == null || course.getCourseID().isEmpty()) {
            throw new InvalidInputException("Course ID cannot be empty.");
        }
        for (Course c : courseList) {
            if (c.getCourseID().equals(course.getCourseID())) {
                throw new DuplicateEntryException("Course ID " + course.getCourseID() + " already exists.");
            }
        }
        courseList.add(course);
    }

    @Override
    public void displayAllCourse() {
        System.out.println(courseList);
    }

    @Override
    public String updateCourse(Course course) throws EnrollmentException {
        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).getCourseID().equals(course.getCourseID())) {
                courseList.set(i, course);
                return "Course updated successfully";
            }
        }
        throw new RecordNotFoundException("Course with ID " + course.getCourseID() + " not found.");
    }

    @Override
    public String removeCourse(Course course) throws EnrollmentException {
        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).getCourseID().equals(course.getCourseID())) {
                courseList.remove(i);
                return "Course removed successfully";
            }
        }
        throw new RecordNotFoundException("Course with ID " + course.getCourseID() + " not found.");
    }

    @Override
    public List<Course> getAllCourses() {
        return courseList;
    }
}
