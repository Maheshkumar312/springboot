package com.prodian.SpringBootApp.Service;


import java.util.List;
import java.util.Optional;

import com.prodian.SpringBootApp.Dto.AddEmployeeResponse;
import com.prodian.SpringBootApp.Dto.EmployeeDTO;
import com.prodian.SpringBootApp.Dto.UpdateEmployeeResponse;
import com.prodian.SpringBootApp.Entity.Employee;

public interface EmployeeService {
	AddEmployeeResponse saveEmployee(EmployeeDTO employee);
	List<EmployeeDTO> getAllEmployees();
	Optional<EmployeeDTO> getEmployeeById(long id);
	 UpdateEmployeeResponse updateEmployee(EmployeeDTO employee, long id);
	EmployeeDTO deleteEmployee(long id);
	
	//query
	List<EmployeeDTO> getAllQuery();
	EmployeeDTO UpadateUserQuery(String name, Long id);
	List<String> nameAll();
}