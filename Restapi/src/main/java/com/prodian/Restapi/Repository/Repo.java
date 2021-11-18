package com.prodian.Restapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prodian.Restapi.Entity.Employee;

public interface Repo extends JpaRepository<Employee, Long> {

}
