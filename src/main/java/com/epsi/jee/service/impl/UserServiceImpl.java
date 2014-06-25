package com.epsi.jee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epsi.jee.dao.UserDao;
import com.epsi.jee.entity.User;
import com.epsi.jee.service.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

/*	@Override
	public boolean emailExists(String email) throws CampusException {
		if (userDao.findByEmail(email) != null)
			return true;
		return false;
	}
*/
	@Override
	public List<User> getAllUsers() {
		return userDao.list(User.class);
	}

	@Override
	public User getUserByMail(String email) {
		return userDao.findByEmail(email);
	}

	@Override
	public boolean passwordConfirmMatchPassword(String password, String passwordConfirm) {
		if(password.equals(passwordConfirm))
			return true;
		return false;
	}

	@Override
	public boolean passwordMatchWithEmail(String email, String password) {
		if (userDao.findByEmail(email) != null && userDao.findByEmail(email).getPassword().equals(password))
			return true;
		return false;
	}
}