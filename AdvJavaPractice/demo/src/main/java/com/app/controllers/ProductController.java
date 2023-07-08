package com.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Product;
import com.app.services.ProductServiceIF;

@RestController
@RequestMapping
@CrossOrigin(origins = "http://localhost:3000")
public class ProductController {
	
@Autowired
private ProductServiceIF productServiceInstance;

@PostMapping("/newproduct")
public String insertNewProduct(@RequestBody Product newProduct) {
	Product insertedProduct = productServiceInstance.addNewProduct(newProduct);
	
	String status = insertedProduct.getPname() + " is added Successfully";
	return status;
	
}//addNewProduct

@GetMapping
public List<Product> getProductList(){
	List<Product> productlist = productServiceInstance.getAllProducts();
	return productlist;
	
}//getProductList

@DeleteMapping("/deleteproduct/{productID}")
public String deleteProductById(@PathVariable Integer productID) {
	
	String deletedproduct = productServiceInstance.deleteProduct(productID);
	return deletedproduct;
	
}//deleteProductById


@PutMapping("/updateproduct")
public Product updateProdByCateg(@RequestBody Product prod) {
	return productServiceInstance.updateProductCategory(prod);
	
	
}//updateProdByCateg

}//ProductController
