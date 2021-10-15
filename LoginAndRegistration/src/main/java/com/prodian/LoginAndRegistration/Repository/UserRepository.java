package com.prodian.LoginAndRegistration.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prodian.LoginAndRegistration.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
