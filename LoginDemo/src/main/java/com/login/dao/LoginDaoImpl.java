package com.login.dao;

import com.login.model.User;

public class LoginDaoImpl implements LoginDao {

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User readByUserIdAndPassword(User user) {
		if (user.getUserId() == 123451 && user.getPassword().equalsIgnoreCase("rohini")) {
			user.setUserName("Hello");

		}
		if (user.getUserId() == 51459283 && user.getPassword().equalsIgnoreCase("Grs1234")) {
			user.setUserName("world");
		}
		return user;
	}

	@Override
	public User updateUserDetails(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
