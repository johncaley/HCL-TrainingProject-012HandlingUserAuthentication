package com.hcl.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.hcl.demo.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

    public User findByName(String name);
}