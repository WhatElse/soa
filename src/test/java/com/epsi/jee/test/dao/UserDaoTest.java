package com.epsi.jee.test.dao;

import static org.junit.Assert.assertTrue;

//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;


import java.text.ParseException;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.epsi.jee.dao.UserDao;
import com.epsi.jee.entity.User;

public class UserDaoTest extends AbstractDaoTest {

	@Autowired
	UserDao userDao;

	@Test
	public void testList() {
		assertTrue(CollectionUtils.isNotEmpty(userDao.list(User.class)));
	}

	@Test
	public void testFind() {
		assertTrue(userDao.find(1L).getName().equals("felix"));
	}

	@Test
	public void testSave() throws ParseException{
		User user = new User();
		user.setEmail("coursdejee@gmail.com");
		user.setName("JEE");
		user.setPassword("jeepaswoord");
		userDao.save(user);
		assertTrue(userDao.find(user.getId()).getName().equals("JEE"));
	}

/*	@Test
	public void testFindByEmail() {
		assertTrue(userDao.findByEmail("felix.wattez@gmail.com").getName().equals("felix"));
	} 
*/
}