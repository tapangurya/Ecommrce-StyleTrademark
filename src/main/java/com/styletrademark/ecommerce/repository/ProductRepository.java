package com.styletrademark.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.styletrademark.ecommerce.dto.Product;
import com.styletrademark.ecommerce.dto.Seller;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	List<Product> findBySeller(Seller seller);
	Product findByNameAndBrandAndPrice(String name, String brand, double price);
	List<Product> findByType(String type);
	

}
