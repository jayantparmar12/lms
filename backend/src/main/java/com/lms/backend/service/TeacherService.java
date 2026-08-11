package com.lms.backend.service;

import com.lms.backend.entity.Teacher;

import java.util.List;

public interface TeacherService {
    Teacher addTeacher(Teacher teacher);
    List<Teacher> getTeachers();
    void deleteTeacher(Integer id);
}
