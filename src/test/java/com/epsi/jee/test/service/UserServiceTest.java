package com.epsi.jee.test.service;

import junit.framework.Assert;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.epsi.jee.entity.User;
import com.epsi.jee.service.UserService;

public class UserServiceTest extends AbstractServiceTest {

	@Autowired
	UserService userService;

	private final static User user = new User();

	@Test
	public void testPasswordMatchWithEmail() {
		user.setEmail("select@campus.fr");
		user.setPassword("felix");
		Assert.assertTrue(userService.passwordMatchWithEmail(user.getEmail(), user.getPassword()));
	}

	@Test
	public void testPasswordDoesntMatchWithEmail() {
		user.setEmail("select@campus.fr");
		user.setPassword("WrongPass");
		Assert.assertFalse(userService.passwordMatchWithEmail(user.getEmail(), user.getPassword()));
	}

	@Test
	public void testGetUserByEmail() {
		user.setEmail("select@campus.fr");
		Assert.assertTrue(userService.getUserByMail(user.getEmail()).getName().equals("felix"));
	}

	@Test
	public void testList() {
		Assert.assertTrue(CollectionUtils.isNotEmpty(userService.getAllUsers()));
	}

	@Test
	public void testPasswordConfirmMatchPassword() {
		Assert.assertTrue(userService.passwordConfirmMatchPassword("Test13", "Test13"));
	}

	@Test
	public void testPasswordConfirmDoesntMatchPassword() {
		Assert.assertFalse(userService.passwordConfirmMatchPassword("Test13", "pass"));
	}

}