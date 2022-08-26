package com.springHibernate.SpringHibernateProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springHibernate.SpringHibernateProject.entity.Product;
import com.springHibernate.SpringHibernateProject.repository.ProductRepository;

@Service
public class ProductSercvice {
	@Autowired
	private ProductRepository prdRepository;
	
	public Product saveProduct(Product product)
	{
		return prdRepository.save(product);
	}
	public List<Product> saveProducts(List<Product>products)
	{
		return prdRepository.saveAll(products);
	}
	public Product getProduct(int id)
	{
		return prdRepository.findById( id).orElse(null);
	}
	public List<Product> getProducts()
	{
		return prdRepository.findAll();
	}
	public Product findByName(String name)
	{
		return prdRepository.findByName(name);
	}
	public String removeProduct(int id)
	{
		prdRepository.deleteById(id);
		return "product removed"+id;
	}
	public Product updateProduct(Product product)
	{
		Product existingProduct = prdRepository.findById(product.getId()).orElse(null);
		existingProduct.setName(product.getName());
		existingProduct.setQuantity(product.getQuantity());
		existingProduct.setPrice(product.getPrice());
		return prdRepository.save(existingProduct);
	}
}
