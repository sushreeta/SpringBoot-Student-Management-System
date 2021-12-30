package com.sushreeta.studentmanagementsystem.repository;

import com.sushreeta.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
