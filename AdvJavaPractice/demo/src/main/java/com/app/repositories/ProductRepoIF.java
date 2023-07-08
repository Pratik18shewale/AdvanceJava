package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Product;

public interface ProductRepoIF extends JpaRepository<Product, Integer> {

}
