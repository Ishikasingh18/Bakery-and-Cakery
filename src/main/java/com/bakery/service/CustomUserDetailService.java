package com.bakery.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bakery.model.CustomUserDetail;
import com.bakery.model.User;
import com.bakery.repositry.UserRepositry;
@Service
public class CustomUserDetailService implements UserDetailsService {

	@Autowired
	UserRepositry userRepositry;
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> user=userRepositry.findUserByEmail(email);
		user.orElseThrow(() -> new UsernameNotFoundException("User Not Found"));
		return user.map(CustomUserDetail::new ).get();
	}
	

}
