package com.sushreeta.studentmanagementsystem.service;

import com.sushreeta.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student updateStudent(Student student);
    Student getStudentById(Long id);
}
