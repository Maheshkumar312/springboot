package com.prodian.StudentManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prodian.StudentManagementSystem.Entities.Account;

public interface AccountRepository  extends JpaRepository<Account, String> {

	Account findOne(String accountId);

}