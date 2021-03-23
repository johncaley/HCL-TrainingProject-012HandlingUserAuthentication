package com.hcl.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.demo.entities.User;
import com.hcl.demo.services.UserService;

public class ServiceTests {

	@Autowired
    private UserService userService;
	
	@Test
	public void WhenGetUserByNameInvoked_CheckGetName() {
		//Ensure username "PaulSimon" exists in table user
		String username = "PaulSimon";
		
		User testUser = userService.GetUserByName("PaulSimon");
				
		assertEquals(username, testUser.getName());
	}
	
	@Test
	public void WhenUpdateUserInvoked_CheckGetName() {
		User testUser = new User();
		testUser.setName("PaulSimon");
		testUser.setPassword("MyPassword");
		testUser.setEmail("GenericEmail@BlahBlah.com");
		userService.UpdateUser(testUser);
		
		User testUser2 = userService.GetUserByName("PaulSimon");
		
		
		assertEquals(testUser.getName(), testUser2.getName());
	}
}
