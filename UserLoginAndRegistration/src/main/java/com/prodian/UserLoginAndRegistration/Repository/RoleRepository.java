package com.prodian.UserLoginAndRegistration.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prodian.UserLoginAndRegistration.Model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

	public Role findByRole(String role);
}
