package com.prodian.UserLoginAndRegistration.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prodian.UserLoginAndRegistration.Model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByEmail(String email);
}