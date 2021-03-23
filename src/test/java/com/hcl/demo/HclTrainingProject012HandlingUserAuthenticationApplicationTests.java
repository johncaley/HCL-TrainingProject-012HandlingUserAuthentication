package com.hcl.demo;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;

import com.hcl.demo.entities.User;
import com.hcl.demo.repositories.UserRepository;

@SpringBootTest
class HclTrainingProject012HandlingUserAuthenticationApplicationTests {

	@Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository userRepository;


    @Test
    public void whenFindByName_thenReturnUser() {

        User testUser = new User();
        testUser.setName("Dummy");
        testUser.setEmail("test@test.com");
        testUser.setPassword("password");
        entityManager.persist(testUser);
        entityManager.flush();

        User found = userRepository.findByName(testUser.getName());

        assertEquals(found.getName(), testUser.getName());
    }

}
