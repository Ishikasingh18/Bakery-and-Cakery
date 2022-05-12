package com.bakery.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bakery.model.Category;

public interface CategoryRepositry extends JpaRepository<Category, Integer>{

}
