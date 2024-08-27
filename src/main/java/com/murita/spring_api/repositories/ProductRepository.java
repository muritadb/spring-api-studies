package com.murita.spring_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murita.spring_api.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
