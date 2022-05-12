package com.bakery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bakery.model.Category;
import com.bakery.repositry.CategoryRepositry;

@Service
public class CategoryService {

	@Autowired
	CategoryRepositry categoryRepositry;
	
	public void addCategory(Category category) {
		categoryRepositry.save(category);
	}
	
	public List<Category> getAllCategory(){
		return categoryRepositry.findAll();
	}
	
	public void removeCategoryById(int id) {
		categoryRepositry.deleteById(id);
	}
	
	public Optional<Category> getCategoryById(int id){
		return categoryRepositry.findById(id);
	}
}
