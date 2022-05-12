package com.bakery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.bakery.repositry.UserRepositry;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepositry.class)
public class BakeryShopWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(BakeryShopWebsiteApplication.class, args);
		System.out.println("Connected...");
		System.out.println("Welcome to Bakery Shop!!");
	}

}
