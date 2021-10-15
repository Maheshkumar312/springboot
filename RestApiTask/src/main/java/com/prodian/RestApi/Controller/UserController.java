package com.prodian.RestApi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.prodian.RestApi.Entity.User;
import com.prodian.RestApi.Service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  UserService userService;
  // Insert user record
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public User addEmployee(@RequestBody User user) {
    return userService.addUser(user);
  }
  // Fetch all user records
  @GetMapping
  public List<User> getAllUsers(){
    return userService.getAllUsers();
  }
}
