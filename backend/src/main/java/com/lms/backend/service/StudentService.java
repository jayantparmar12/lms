package com.lms.backend.service;

import com.lms.backend.entity.Student;

import java.util.List;

public interface StudentService {
    Student addStudent(Student student);
    List<Student> getStudents();
    void deleteStudent(Integer id);
}
