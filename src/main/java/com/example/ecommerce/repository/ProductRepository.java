package com.example.ecommerce.repository;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
	List<Product> findByName(String name);
	
	List<Product> findByPriceLessThan(double price);

	List<Product> findByPriceLessThanEqual(double price);
	
	List<Product> findByNameContaining(String keyword);
}
