package com.prodian.StudentManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prodian.StudentManagementSystem.Entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}