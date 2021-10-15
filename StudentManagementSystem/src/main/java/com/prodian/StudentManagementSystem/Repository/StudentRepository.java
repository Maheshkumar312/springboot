package com.prodian.StudentManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prodian.StudentManagementSystem.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{



}
