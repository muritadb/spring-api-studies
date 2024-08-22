package com.murita.spring_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murita.spring_api.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
