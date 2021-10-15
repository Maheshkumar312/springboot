package com.prodian.UserLoginAndRegistration.Service;

import com.prodian.UserLoginAndRegistration.Model.User;

public interface UserService {

	public void saveUser(User user);

	public boolean isUserAlreadyPresent(User user);

}
