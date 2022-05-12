package com.bakery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bakery.global.GlobalData;
import com.bakery.service.CategoryService;
import com.bakery.service.ProductService;

@Controller
public class HomeController {

	@Autowired
	CategoryService categoryService;
	@Autowired
	ProductService productService;
	
	@GetMapping({"/"})
	public String index(Model model) {
		model.addAttribute("cartCount", GlobalData.cart.size());
		return "index";
	}
	@GetMapping({"/home"})
	public String home(Model model) {
		model.addAttribute("cartCount", GlobalData.cart.size());
		return "home";
	}
	@GetMapping({"/shop"})
	public String shop(Model model) {
		model.addAttribute("categories", categoryService.getAllCategory());
		model.addAttribute("products", productService.getAllProducts());
		model.addAttribute("cartCount", GlobalData.cart.size());
		return "shop";
	}
	@GetMapping({"/shop/category/{id}"})
	public String shopByCategory(Model model,@PathVariable int id) {
		model.addAttribute("categories", categoryService.getAllCategory());
		model.addAttribute("products", productService.getAllProductsByCategoryId(id));
		model.addAttribute("cartCount", GlobalData.cart.size());
		return "shop";
	}
	@GetMapping({"/shop/viewproduct/{id}"})
	public String viewProduct(Model model,@PathVariable int id) {
		model.addAttribute("product",productService.getProductById(id).get());
		model.addAttribute("cartCount", GlobalData.cart.size());
		return "viewProduct";
	}
	
	
	@GetMapping("/contact")
	public String contactUs() {
		return "contactus";
	}
	
	@GetMapping("/aboutus")
	public String aboutus() {
		return "aboutus";
	}
}
