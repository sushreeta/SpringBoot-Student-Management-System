package com.sushreeta.studentmanagementsystem.service.impl;

import com.sushreeta.studentmanagementsystem.entity.Student;
import com.sushreeta.studentmanagementsystem.repository.StudentRepository;
import com.sushreeta.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}