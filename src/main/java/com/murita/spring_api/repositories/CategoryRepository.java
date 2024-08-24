package com.murita.spring_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murita.spring_api.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
