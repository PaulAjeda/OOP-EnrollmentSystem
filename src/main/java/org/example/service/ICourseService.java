package org.example.service;

import org.example.model.Course;
import org.example.exception.EnrollmentException;
import java.util.List;

public interface ICourseService {
    void addCourse(Course course) throws EnrollmentException;
    String updateCourse(Course course) throws EnrollmentException;
    String removeCourse(Course course) throws EnrollmentException;
    List<Course> getAllCourses();
    void displayAllCourse();
}
