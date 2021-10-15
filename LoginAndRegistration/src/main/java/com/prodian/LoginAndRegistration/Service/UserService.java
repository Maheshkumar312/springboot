package com.prodian.LoginAndRegistration.Service;

import com.prodian.LoginAndRegistration.Model.User;

public interface UserService {
	 void save(User user);

	    User findByUsername(String username);
}
