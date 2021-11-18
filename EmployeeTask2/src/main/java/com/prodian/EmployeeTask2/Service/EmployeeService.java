package com.prodian.EmployeeTask2.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.prodian.EmployeeTask2.Pojo.Employee;
import com.prodian.EmployeeTask2.Pojo.EmployeeDetails;
import com.prodian.EmployeeTask2.Pojo.PersonalDetails;

@Service
public class EmployeeService {
	List<Employee> emplist = new ArrayList<Employee>();

	public List<Employee> saveEmployee(Employee employee) {
 
		Employee empl = new Employee();
		empl.setEmpId(employee.getEmpId());
		empl.setPersonal_details(employee.getPersonal_details());
		empl.setEmployee_details(employee.getEmployee_details());
		emplist.add(empl);		
		return emplist;

	}

	public Map<String, List<PersonalDetails>> getPersonalDetails() {
		List<PersonalDetails> personalDetailsList = new ArrayList<PersonalDetails>();
		for (Employee emp : emplist) {
			personalDetailsList.add(emp.getPersonal_details());
		}

		Map<String, List<PersonalDetails>> map = new HashMap<String, List<PersonalDetails>>();
		map.put("personaDetails", personalDetailsList);
		return map;

	}

	public Map<String, List<Long>> getEmpId() {
		List<Long> empId = new ArrayList<Long>();
		for (Employee emp : emplist)
			empId.add(emp.getEmpId());

		Map<String, List<Long>> empMap = new HashMap<String, List<Long>>();
		empMap.put("empId", empId);
		return empMap;
	}

	public Map<String, List<EmployeeDetails>> getEEmployeeDetails() {
		List<EmployeeDetails> empDetailsList = new ArrayList<EmployeeDetails>();
		for (Employee e : emplist) {
			empDetailsList.add(e.getEmployee_details());
		}
		Map<String, List<EmployeeDetails>> map = new HashMap<String, List<EmployeeDetails>>();
		map.put("employeeDetails", empDetailsList);
		return map;

	}
}
