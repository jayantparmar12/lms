package com.lms.backend.service.serviceImpl;

import com.lms.backend.entity.Teacher;
import com.lms.backend.repository.TeacherRepo;
import com.lms.backend.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {
    private final TeacherRepo teacherRepo;
    @Override
    public Teacher addTeacher(Teacher teacher) {
        teacherRepo.save(teacher);
        return teacher;
    }

    @Override
    public List<Teacher> getTeachers() {
        return teacherRepo.findAll();
    }

    @Override
    public void deleteTeacher(Integer id) {
        teacherRepo.deleteById(id);
    }
}
