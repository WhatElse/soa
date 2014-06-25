package com.epsi.jee.service;

import java.util.List;

import com.epsi.jee.entity.User;

public interface UserService {

	/**
	 * Return all of the users
	 * @return
	 */
	public List<User> getAllUsers();

	/**
	 * Return a user thanks to his mail
	 * @param email
	 * @return
	 */
	public User getUserByMail(String email);

	/**
	 * Check if password confirm match with password
	 * @param password
	 * @param passwordConfirm
	 * @return
	 */
	public boolean passwordConfirmMatchPassword(String password, String passwordConfirm);

	/**
	 * Check if the entered password match with the database password for the provided email
	 * @param email
	 * @param password
	 * @return
	 */
	public boolean passwordMatchWithEmail(String email, String password);

//	boolean emailExists(String email) throws CampusException;

}