package com.prodian.StudentManagementSystem.Service;

import java.util.List;

import com.prodian.StudentManagementSystem.Entity.Student;



public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}