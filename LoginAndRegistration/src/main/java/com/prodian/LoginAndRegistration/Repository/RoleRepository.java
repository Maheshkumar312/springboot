package com.prodian.LoginAndRegistration.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prodian.LoginAndRegistration.Model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
