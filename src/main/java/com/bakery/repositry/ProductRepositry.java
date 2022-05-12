package com.bakery.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bakery.model.Product;

public interface ProductRepositry extends JpaRepository<Product, Long>{
	List<Product> findAllByCategory_id(int id);
}
