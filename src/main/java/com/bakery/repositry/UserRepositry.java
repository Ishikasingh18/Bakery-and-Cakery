package com.bakery.repositry;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bakery.model.User;

public interface UserRepositry extends JpaRepository<User, Integer> {
//	@Query("select u from user u where u.email = : email")
	Optional<User> findUserByEmail( String email);
}
