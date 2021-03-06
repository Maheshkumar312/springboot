package com.prodian.SpringBootApp.ServiceImplement;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.prodian.SpringBootApp.Dto.AddEmployeeResponse;
import com.prodian.SpringBootApp.Dto.EmployeeDTO;
import com.prodian.SpringBootApp.Dto.UpdateEmployeeResponse;
import com.prodian.SpringBootApp.Entity.Employee;
import com.prodian.SpringBootApp.Exception.ResourceNotFoundException;
import com.prodian.SpringBootApp.Repository.EmployeeRepository;
import com.prodian.SpringBootApp.Service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public AddEmployeeResponse saveEmployee(EmployeeDTO employee) {
		Employee emp = new Employee();
		AddEmployeeResponse addEmp = new AddEmployeeResponse();
		emp.setFirstName(employee.getFirstName());
		emp.setLastName(employee.getLastName());
		emp.setEmail(employee.getEmail());
		emp.setProfile(employee.getProfile());
		emp = this.employeeRepository.save(emp);
		if (emp != null) {
			addEmp.setStatus("success");
		} else {
			addEmp.setStatus("Failed");
		}
		return addEmp;
	}

	@Override
	public List<EmployeeDTO> getAllEmployees() {
		List<EmployeeDTO> list = new ArrayList<>();
		List<Employee> employees = this.employeeRepository.findAll();
		for (Employee emp : employees) {
			list.add(new EmployeeDTO(emp.getId(), emp.getFirstName(), emp.getLastName(), emp.getEmail(),
					emp.getProfile()));
		}
		return list;
	}

	@Override
	public Optional<EmployeeDTO> getEmployeeById(long employeeId) {
		Optional<Employee> employee = this.employeeRepository.findById(employeeId);
		Employee emp = employee.get();

		return Optional.of(
				new EmployeeDTO(emp.getId(), emp.getFirstName(), emp.getLastName(), emp.getEmail(), emp.getProfile()));

	}

	@Override
	public UpdateEmployeeResponse updateEmployee(EmployeeDTO employeeDto, long id) {
//			Post post = new Post(); 
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee", "id", id));

		employee.setId(id);
		employee.setFirstName(employeeDto.getFirstName());
		employee.setLastName(employeeDto.getLastName());
		employee.setEmail(employeeDto.getEmail());
		employee.setProfile(employeeDto.getProfile());
		// save existing employee to DB

		employee = employeeRepository.save(employee);
		UpdateEmployeeResponse updateEmployeeResponse = new UpdateEmployeeResponse();
		if (employee != null) {
			updateEmployeeResponse.setId(employeeDto.getId());
			updateEmployeeResponse.setFirstName(employeeDto.getFirstName());
			updateEmployeeResponse.setLastName(employeeDto.getLastName());
			updateEmployeeResponse.setEmail(employeeDto.getEmail());

		}

		return updateEmployeeResponse;

	}

	@Override
	public EmployeeDTO deleteEmployee(long id) {
		EmployeeDTO emp = new EmployeeDTO();

		// check whether a employee exist in a DB or not
		employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id));
		employeeRepository.deleteById(id);
		return emp;
	}

	// custom queries

	@Override
	public List<EmployeeDTO> getAllQuery() {
		List<EmployeeDTO> list = new ArrayList<>();
		List<Employee> employees = this.employeeRepository.getAll();
		for (Employee emp : employees) {
			list.add(new EmployeeDTO(emp.getId(), emp.getFirstName(), emp.getLastName(), emp.getEmail(),
					emp.getProfile()));
		}
		return list;
	}

	@Override
	public EmployeeDTO UpadateUserQuery(String name, Long id) {
		Integer test = this.employeeRepository.updateUserNameByID(name, id);
		EmployeeDTO employeeDTO;
		if (test == 1) {
			Optional<Employee> employee = employeeRepository.findById(id);
			Employee emp = employee.get();
			employeeDTO = new EmployeeDTO(emp.getId(), emp.getFirstName(), emp.getLastName(), emp.getEmail(),
					emp.getProfile());
			return employeeDTO;
		} else {
			new ResourceNotFoundException(" employee", "id", id);
			employeeDTO = new EmployeeDTO();
		}
		return employeeDTO;

	}

	@Override
	public List<String> nameAll() {
		List<String> str = employeeRepository.getNameAll();
		return str;
	}

}