package com.prodian.SpringSecurityDatabaseAuthentication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prodian.SpringSecurityDatabaseAuthentication.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
