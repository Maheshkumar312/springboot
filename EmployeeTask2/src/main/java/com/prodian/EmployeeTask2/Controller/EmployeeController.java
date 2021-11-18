package com.prodian.EmployeeTask2.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prodian.EmployeeTask2.Pojo.Employee;
import com.prodian.EmployeeTask2.Pojo.EmployeeDetails;
import com.prodian.EmployeeTask2.Pojo.PersonalDetails;
import com.prodian.EmployeeTask2.Service.EmployeeService;

@RestController
public class EmployeeController {
	private EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	public EmployeeController() {
		super();
	}

	@PostMapping("/addEmployee")
	public Map<Long, Employee> saveEmployee(@RequestBody Employee employee) {
		List<Employee> emplist = this.employeeService.saveEmployee(employee);
		Map<Long, Employee> map = new HashMap<Long, Employee>();
		for (Employee emp : emplist) {
			map.put(emp.getEmpId(), emp);

		}
		return map;

	}

	@GetMapping("/PersonalDetails")
	public Map<String, List<PersonalDetails>> getPersonalDetails() {
		Map<String, List<PersonalDetails>> personalDetailsmap = this.employeeService.getPersonalDetails();
		return personalDetailsmap;

	}

	@GetMapping("/empId")
	public Map<String, List<Long>> empId() {
		Map<String, List<Long>> empIdmap = this.employeeService.getEmpId();
		return empIdmap;
	}

	@GetMapping("/employeeDetails")
	public Map<String, List<EmployeeDetails>> getEmployeeDetails() {
		Map<String, List<EmployeeDetails>> empmap = this.employeeService.getEEmployeeDetails();
		return empmap;
	}

}
