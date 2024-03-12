package com.api.taskforge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.taskforge.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
