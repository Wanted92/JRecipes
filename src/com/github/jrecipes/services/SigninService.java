package com.github.jrecipes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.jrecipes.DAOs.UserDAO;
import com.github.jrecipes.models.User;

@Service("signinService")
public class SigninService {

	UserDAO userDao = new UserDAO();

	/**
	 * @param userDAO the userDAO to set
	 */
	@Autowired
	public void setUserDAO(UserDAO userDAO) {
		this.userDao = userDAO;
	}
	
	public void create(User user) {
		userDao.create(user);
	}
	
	
}
