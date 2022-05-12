package com.bakery.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bakery.global.GlobalData;
import com.bakery.model.Role;
import com.bakery.model.User;
import com.bakery.repositry.RoleRepositry;
import com.bakery.repositry.UserRepositry;

import lombok.Data;
@Data
@Controller
public class LoginController {

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	UserRepositry userRepositry;
	@Autowired
	RoleRepositry roleRepositry;
	
	@GetMapping("/login")
	public String login() {
		GlobalData.cart.clear();
		return "login";
	}
	
	@GetMapping("/register")
	public String getRegister() {
		return "register";
	}
	
	@PostMapping("/register")
	public String saveUser(@ModelAttribute("user")User user,HttpServletRequest request)throws ServletException {
		String password = user.getPassword();
		user.setPassword(bCryptPasswordEncoder.encode(password));
		List<Role> roles=new ArrayList<>();
		roles.add(roleRepositry.findById(2).get());
		user.setRoles(roles);
		userRepositry.save(user);
		request.login(user.getEmail(), password);
		return "redirect:/";
	}
}
