package com.prodian.Restapi.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.prodian.Restapi.Entity.Employee;
import com.prodian.Restapi.Repository.Repo;
import com.prodian.Restapi.Service.Service;

public class ServiceImpl implements Service {
	@Autowired
	private Repo repo;

	public ServiceImpl() {
		super();
	}

	public ServiceImpl(Repo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public String get() {

		return null;
	}

	@Override
	public Employee save(Employee employee) {
		Employee emp = new Employee();
		emp.setempid (employee.getEmpid());
		

		return emp;
	}

}
