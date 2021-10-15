package com.prodian.SpringBootApp.Controller;

import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prodian.SpringBootApp.Dto.AddEmployeeResponse;
import com.prodian.SpringBootApp.Dto.EmployeeDTO;
import com.prodian.SpringBootApp.Dto.UpdateEmployeeResponse;
import com.prodian.SpringBootApp.Entity.Employee;
import com.prodian.SpringBootApp.Service.EmployeeService;
@CrossOrigin
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	// build create employee REST API
	@PostMapping("/addEmployee")

	public AddEmployeeResponse saveEmployee( @RequestBody EmployeeDTO employee){
		return employeeService.saveEmployee(employee);
	}
	
	
 //create getemployees api
	@GetMapping
	public List<EmployeeDTO> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	// build get employee by id REST API
	@GetMapping("{id}")
	public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable( value="id") long employeeId)
	{
		return  ResponseEntity.ok().body(employeeService.getEmployeeById(employeeId).get());
	}
		// build update employee REST API
	// http://localhost:8080/api/employees/1
	@PutMapping("{id}")
	public UpdateEmployeeResponse updateEmployee(@PathVariable(name = "id") Long id,@RequestBody EmployeeDTO employeeDTO) {
		return employeeService.updateEmployee(employeeDTO, id);
	}
	// build delete employee REST API
	// http://localhost:8080/api/employees/1
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id){
		
		// delete employee from DB
		employeeService.deleteEmployee(id);
		
		return new ResponseEntity<String>("Employee deleted successfully!.", HttpStatus.OK);
	}
	
	
	//custom queries
	@GetMapping("/names")
	public List<EmployeeDTO> getAllQuery() {
		return employeeService.getAllQuery();
	}

	@PutMapping("query/{id}")
	public ResponseEntity<String> UpadateUserQuery(String name, Long id) {

		// delete employee from DB
		employeeService.UpadateUserQuery(name,id);

		return new ResponseEntity<String>("Employee updated successfully!.", HttpStatus.OK);
	}
@GetMapping("/getAll")
	public List<String> nameAll() {
		return employeeService.nameAll();
		
	}
	
}