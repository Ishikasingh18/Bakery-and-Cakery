package com.bakery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bakery.model.Product;
import com.bakery.repositry.ProductRepositry;

@Service
public class ProductService {
	@Autowired
	ProductRepositry productRepositry;
	
	public List<Product> getAllProducts(){
		return productRepositry.findAll();
	}
	
	public void addProduct(Product product) {
		productRepositry.save(product);
	}
	public void removeProductById(long id) {
		productRepositry.deleteById(id);
	}
	public Optional<Product> getProductById(long id){
	return	productRepositry.findById(id);
	}
	public List<Product> getAllProductsByCategoryId(int id){
		return productRepositry.findAllByCategory_id(id);
	}
}
