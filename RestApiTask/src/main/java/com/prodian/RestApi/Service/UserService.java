package com.prodian.RestApi.Service;

import java.util.List;

import com.prodian.RestApi.Entity.User;

public interface UserService {
	 User addUser(User user);
//	  User getUserById(int userId);
//	  void updateUser(User user);
//	  void deleteUserById(int userId);
	  List<User> getAllUsers();

}
