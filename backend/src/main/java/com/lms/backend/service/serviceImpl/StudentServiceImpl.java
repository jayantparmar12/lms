package com.lms.backend.service.serviceImpl;

import com.lms.backend.entity.Student;
import com.lms.backend.repository.StudentRepo;
import com.lms.backend.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepo studentRepo;
    @Override
    public Student addStudent(Student student) {
        studentRepo.save(student);
        return student;
    }

    @Override
    public List<Student> getStudents() {
        return studentRepo.findAll();
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepo.deleteById(id);
    }
}
