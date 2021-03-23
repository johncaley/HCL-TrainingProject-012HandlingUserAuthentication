package com.hcl.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.demo.entities.User;
import com.hcl.demo.repositories.UserRepository;
import com.hcl.demo.exceptions.UserNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

   public User GetUserByName(String name) {
       User foundUser = userRepository.findByName(name);
       return foundUser;
   }
   
   public void UpdateUser(User usertoUpdate) {
   	userRepository.save(usertoUpdate);
   }



}
