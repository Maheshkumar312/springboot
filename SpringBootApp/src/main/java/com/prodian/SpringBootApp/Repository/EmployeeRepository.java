package com.prodian.SpringBootApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prodian.SpringBootApp.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long > {

}
