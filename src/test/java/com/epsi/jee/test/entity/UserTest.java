package com.epsi.jee.test.entity;

//import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;


import java.text.ParseException;
import org.junit.Before;
import org.junit.Test;


//import com.epsi.jee.common.CipherUtils;
import com.epsi.jee.entity.User;

public class UserTest {

	private final static User user = new User();
	private final static String VALID_EMAIL = "felixwattez@gmail.com";
	private final static String VALID_PASSWORD = "felix";
	private final static String NAME = "TestName";

	@Before
	public void setUpTest() throws ParseException {
		user.setId(1L);
		user.setEmail(VALID_EMAIL);
		user.setPassword(VALID_PASSWORD);
		user.setName(NAME);
	}

	@Test
	public void testHasValidEmail() {
		assertTrue(user.getEmail() != null);
	}

	@Test
	public void testHasValidPassword() {
		assertTrue(user.getPassword() != null);
	}

	@Test
	public void testUserGotAnId() {
		assertTrue(user.getId() != null);
	}

	@Test
	public void testUserGotAName() {
		assertTrue(user.getName() != null);
	}
}