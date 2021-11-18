package com.prodian.EmployeeTask.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prodian.EmployeeTask.Pojo.Employee;
import com.prodian.EmployeeTask.Service.EmployeeService;

//@RequestMapping("/employee")
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

	@PostMapping("/addEmployee")
	public Map<Long, Employee> saveEmployee(@RequestBody Employee employee) {
		List<Employee> employeeList = this.employeeService.saveEmployee(employee);
		Map<Long, Employee> empMap = new HashMap<>();
		for (Employee e : employeeList) {
			empMap.put(e.getEmpId(), e);
			System.out.println(empMap);
		}
		return empMap;
	}

}
