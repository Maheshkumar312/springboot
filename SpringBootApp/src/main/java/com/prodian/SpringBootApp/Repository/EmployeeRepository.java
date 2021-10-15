package com.prodian.SpringBootApp.Repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.prodian.SpringBootApp.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long > {
	@Query(value = "Select* from employees", nativeQuery = true)
	public List<Employee> getAll();

	

	@Transactional
	@Modifying
	@Query(value = "update employees set first_name = ?2 where id = ?1",nativeQuery = true)
	public Integer updateUserNameByID(String name, Long id);

	@Query(value = "Select first_name from employees", nativeQuery = true)
	public List<String> getNameAll();

}
