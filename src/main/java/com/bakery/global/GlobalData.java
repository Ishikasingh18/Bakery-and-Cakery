package com.bakery.global;

import java.util.ArrayList;
import java.util.List;

import com.bakery.model.Product;

public class GlobalData {

	public static List<Product> cart;
	static {
		cart=new ArrayList<Product>();
	}
	
}
