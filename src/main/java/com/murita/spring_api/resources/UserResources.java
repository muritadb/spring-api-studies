package com.murita.spring_api.resources;

import com.murita.spring_api.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L,"Douglas","any@mail.com", "9999999", "123");
        return ResponseEntity.ok().body(u);
    }

}
