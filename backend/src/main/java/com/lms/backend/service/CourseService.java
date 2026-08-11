package com.lms.backend.service;

import com.lms.backend.entity.Course;

import java.util.List;

public interface CourseService {
    Course addCourse(Course course);
    List<Course> getCourses();
    void deleteCourse(Integer id);
}
