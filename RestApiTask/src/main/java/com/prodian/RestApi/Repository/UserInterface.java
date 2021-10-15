package com.prodian.RestApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prodian.RestApi.Entity.User;

public interface UserInterface extends JpaRepository<User,Integer> {

}
