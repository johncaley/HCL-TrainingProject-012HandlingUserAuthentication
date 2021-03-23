package com.hcl.demo;

import com.hcl.demo.entities.User;
import com.hcl.demo.repositories.UserRepository;
import com.hcl.demo.services.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class EntityTests {
	
	@Test
	public void WhenSetPassword_CheckGetPassword() {
		User testUser = new User();
		testUser.setPassword("strongPassword");
		assertEquals(testUser.getPassword(), "strongPassword");
	}
	
	@Test
	public void WhenSetEmail_CheckGetEmail() {
		User testUser = new User();
		testUser.setEmail("myNewEmail@SomethingSomething.com");
		assertEquals(testUser.getEmail(), "myNewEmail@SomethingSomething.com");
	}
	
	@Test
	public void WhenSetUsername_CheckGetUsername() {
		User testUser = new User();
		testUser.setName("myNewName");
		assertEquals(testUser.getName(), "myNewName");
	}
	
	
}
