package com.prodian.Restapi.Service;


import com.prodian.Restapi.Entity.Employee;

@org.springframework.stereotype.Service
public interface Service {
	String get();
	Employee  save(Employee employee);
}
