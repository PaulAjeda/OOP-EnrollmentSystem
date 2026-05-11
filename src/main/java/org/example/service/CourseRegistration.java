package org.example.service;

import org.example.model.Course;

public interface CourseRegistration {
    void addCourse(Course course);
    void displayAllCourse();
    String updateCourse(Course course);
    String deleteCourse(Course course);
}
