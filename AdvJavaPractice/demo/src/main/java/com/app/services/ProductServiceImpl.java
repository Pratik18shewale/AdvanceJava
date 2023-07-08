package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entities.Product;
import com.app.repositories.ProductRepoIF;

@Service
@Transactional
public class ProductServiceImpl implements ProductServiceIF {
	
	@Autowired
	private ProductRepoIF productRepoInstance;

	@Override
	public Product addNewProduct(Product newProduct) {
		Product addedproduct = productRepoInstance.save(newProduct);
		return addedproduct;
	}//addNewProduct
	

	@Override
	public List<Product> getAllProducts() {
		
		List<Product> productlist = productRepoInstance.findAll();
		return productlist;
	}//getAllProducts


	@Override
	public String deleteProduct(Integer productID) {
	
		String msg = "Product deletion Failed !!! Try Again !!!";
		
		if(productRepoInstance.existsById(productID)) {
			
			productRepoInstance.deleteById(productID);
			
			msg = "Product is Deleted Successfully";
		}//if
		return msg;
	}


	@Override
	public Product updateProductCategory(Product prod) {
	     
		return productRepoInstance.save(prod);
	}

	
	
}
