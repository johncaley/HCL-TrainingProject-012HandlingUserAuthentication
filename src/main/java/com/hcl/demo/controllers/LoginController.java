package com.hcl.demo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hcl.demo.entities.User;
import com.hcl.demo.services.UserService;


@Controller
public class LoginController {

	private UserService service;
	
	@GetMapping("login")
	public String home() {
		return "login";
	}
	
	@GetMapping(value="LoginToServer")
	public String LoginToServer(@RequestParam String username, String password, HttpSession session) {
		
		
		User user = service.GetUserByName(username);
		
		
		if (user.getName() == null) {
			System.out.println("Error: User doesn't Exist");
		}
		else if (user.getPassword().equals(password)) {
			System.out.println("Error: Invalid Password");
		}
		else {
			System.out.println(user.getName());
			System.out.println(user.getPassword());
			System.out.println(user.getEmail());
		}
		
		return "home";
	}
}
