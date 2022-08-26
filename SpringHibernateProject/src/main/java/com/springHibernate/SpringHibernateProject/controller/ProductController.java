package com.springHibernate.SpringHibernateProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springHibernate.SpringHibernateProject.entity.Product;
import com.springHibernate.SpringHibernateProject.service.ProductSercvice;

@RestController
public class ProductController {
	@Autowired
	ProductSercvice service;
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product)
	{
		return service.saveProduct(product);
		
	}
	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> products)
	{
		return service.saveProducts(products);
		
	}
	@GetMapping("/product/{id}")
	public Product findProductById(@RequestBody int id)
	{
		return service.getProduct(id);
		
	}
	@GetMapping("/product/{name}")
	public Product findProductByName(@RequestBody String name)
	{
		return service.findByName(name);
		
	}
	@GetMapping("/products")
	public List<Product> findAllProduct()
	{
		return service.getProducts();	
	}
	
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product)
	{
		return service.updateProduct(product);	
	}

	@DeleteMapping("/delete/{id}")
	public String updateProducts(@RequestBody int id)
	{
		return service.removeProduct(id);
		
	}
}
