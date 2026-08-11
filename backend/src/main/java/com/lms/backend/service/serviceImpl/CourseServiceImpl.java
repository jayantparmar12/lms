package com.lms.backend.service.serviceImpl;

import com.lms.backend.entity.Course;
import com.lms.backend.repository.CourseRepo;
import com.lms.backend.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {
    private final CourseRepo courseRepo;
    @Override
    public Course addCourse(Course course) {
        courseRepo.save(course);
        return course;
    }

    @Override
    public List<Course> getCourses() {
        return courseRepo.findAll();
    }

    @Override
    public void deleteCourse(Integer id) {
        courseRepo.deleteById(id);
    }
}
