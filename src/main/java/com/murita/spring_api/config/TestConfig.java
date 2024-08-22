package com.murita.spring_api.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.murita.spring_api.entities.User;
import com.murita.spring_api.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

  @Autowired
  private UserRepository userRepository;

  @Override
  public void run(String... args) throws Exception {
    User u1 = new User(null, "Douglas Barbosa", "d@mail.com", "99999", "123");
    User u2 = new User(null, "Jaque Santos", "jaque@mail.com", "888888", "123");

    userRepository.saveAll(Arrays.asList(u1, u2));
  }

}
