package com.murita.spring_api.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.murita.spring_api.entities.Category;
import com.murita.spring_api.entities.Order;
import com.murita.spring_api.entities.User;
import com.murita.spring_api.entities.enums.OrderStatus;
import com.murita.spring_api.repositories.CategoryRepository;
import com.murita.spring_api.repositories.OrderRepository;
import com.murita.spring_api.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private OrderRepository orderRepository;

  @Autowired
  private CategoryRepository categoryRepository;

  @Override
  public void run(String... args) throws Exception {

    Category cat1 = new Category(null, "Electronics");
    Category cat2 = new Category(null, "Books");
    Category cat3 = new Category(null, "Computers");

    User u1 = new User(null, "Douglas Barbosa", "d@mail.com", "99999", "123");
    User u2 = new User(null, "Jaque Santos", "jaque@mail.com", "888888", "123");

    Order o1 = new Order(null, Instant.parse("2024-08-24T13:30:49Z"), OrderStatus.PAID, u1);
    Order o2 = new Order(null, Instant.parse("2024-07-29T20:10:20Z"), OrderStatus.WAITING_PAYMENT, u2);
    Order o3 = new Order(null, Instant.parse("2024-08-06T05:27:05Z"), OrderStatus.WAITING_PAYMENT, u1);

    userRepository.saveAll(Arrays.asList(u1, u2));
    orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
  }

}
