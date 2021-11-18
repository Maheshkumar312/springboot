package com.prodian.MyPractice.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.prodian.MyPractice.Entity.Employee;

@Service
public class EmployeeService {
	List<Employee> emplList = new ArrayList<Employee>();

	public List<Employee> saveEmployee(Employee employee) {

		Employee emp = new Employee();
		emp.setEmpid(employee.getEmpid());
		emp.setEmpName(emp.getEmpName());
		emp.setSalary(emp.getSalary());
		emplList.add(emp);

		return emplList;

	}

	public List<Employee> getEmployees() {
		List<Employee> emp = new ArrayList<Employee>();
		for (Employee em : emplList) {
			emp.add(em);
		}
		return emp;
	}
}
