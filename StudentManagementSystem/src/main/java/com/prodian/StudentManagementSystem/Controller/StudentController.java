package com.prodian.StudentManagementSystem.Controller;


	import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.prodian.StudentManagementSystem.Entity.Student;
import com.prodian.StudentManagementSystem.Service.StudentService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


	@Controller
 	@Api("this is student management system")
	public class StudentController {
		
		private StudentService studentService;

		public StudentController(StudentService studentService) {
			super();
			this.studentService = studentService;
		}
		
		// handler method to handle list students and return mode and view
//		@ApiOperation("this is used to store student details")
		@GetMapping("/students")
		public String listStudents(Model model) {
			model.addAttribute("students", studentService.getAllStudents());
			return "students";
		}
		
		@GetMapping("/students/new")
		public String createStudentForm(Model model) {
			
			// create student object to hold student form data
			Student student = new Student();
			model.addAttribute("student", student);
			return "create_student";
			
		}
		
		@PostMapping("/students")

//		@PostMapping( value = "/students",consumes = {
//				"application/json",
//				"application/xml"
//		},
//				produces =  {
//						"application/json",
//						"application/xml"
//				}
//		)
		public String saveStudent(@ModelAttribute("student") Student student) {
			studentService.saveStudent(student);
			return "redirect:/students";
		}
		
		@GetMapping("/students/edit/{id}")
		public String editStudentForm(@PathVariable Long id, Model model) {
			model.addAttribute("student", studentService.getStudentById(id));
			return "edit_student";
		}

		@PostMapping("/students/{id}")
		public String updateStudent(@PathVariable Long id,
				@ModelAttribute("student") Student student,
				Model model) {
			
			// get student from database by id
			Student existingStudent = studentService.getStudentById(id);
			existingStudent.setId(id);
			existingStudent.setFirstName(student.getFirstName());
			existingStudent.setLastName(student.getLastName());
			existingStudent.setEmail(student.getEmail());
			
			// save updated student object
			studentService.updateStudent(existingStudent);
			return "redirect:/students";		
		}
		
		// handler method to handle delete student request
		
		@GetMapping("/students/{id}")
		public String deleteStudent(@PathVariable Long id) {
			studentService.deleteStudentById(id);
			return "redirect:/students";
		}
		
	}


