package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.toystore.app.ToyStoreApplication;

import com.toystore.app.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ToyStoreApplication.class)
public class TestUserPojo {

	
	@MockBean 
	User user;
	
	@Test
	public void testDefaultconstructor() {
		user = new User();
		Object expectedObject = new User();
		assertNotEquals(expectedObject, user);
	}
	
	
	@Test
	public void testAdminid() {
		user = new User(1,"admin","Admin", "Admin@123");
		user.setAid(101);
		assertEquals (true, user.getAid()==101);
	}

	
	@Test
	public void testRole() {
		user = new User(1,"customer","Admin", "Admin@123");
		user.setRole("admin");
		assertEquals (true, user.getRole()=="admin");
	}
	
	@Test
	public void testUsername() {
		user = new User(1,"customer","Customer", "Admin@123");
		user.setUsername("Admin");
		assertEquals (true, user.getUsername()=="Admin");
	}

	@Test
	public void testPassword() {
		user = new User(1,"admin","Admin", "Customer@123");
		user.setPassword("Admin@123");
		assertEquals (true, user.getPassword()=="Admin@123");
	}
}
