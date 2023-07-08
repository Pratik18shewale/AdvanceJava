package com.app.services;

import java.util.List;

import com.app.entities.Product;

public interface ProductServiceIF {
	
	Product addNewProduct(Product newProduct);
	
	List<Product> getAllProducts();
	
	String deleteProduct(Integer productID);
	
	Product updateProductCategory(Product prod);

}
