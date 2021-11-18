package com.prodian.EmployeeTask.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.prodian.EmployeeTask.Pojo.Employee;
@Service
public class EmployeeService {
	public List<Employee> saveEmployee(Employee employee) {
		Employee emp =new Employee();
		emp.setEmpId(employee.getEmpId());
		emp.setpDetails(employee.getpDetails());
		emp.seteDetails(employee.geteDetails());
		List<Employee> employeeList= new ArrayList<>();
		employeeList.add(emp);
		
		return employeeList;
	}
}
