package com.prodian.MyPractice.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prodian.MyPractice.Entity.Employee;
import com.prodian.MyPractice.Service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	public EmployeeController() {
		super();
	}

	@PostMapping("/save")
	public List<Employee> saveEmployee(@RequestBody Employee employee) {
		List<Employee> emp = this.employeeService.saveEmployee(employee);
		List<Employee> empl = new ArrayList<Employee>();
		for (Employee e : emp) {
			empl.add(e);

		}

		return empl;

	}

	@GetMapping("/get")
	public List<Employee> getEmployees() {
		List<Employee> emp = this.employeeService.getEmployees();
		return emp;
	}

}
