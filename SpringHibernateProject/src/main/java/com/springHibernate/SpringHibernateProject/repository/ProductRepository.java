package com.springHibernate.SpringHibernateProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springHibernate.SpringHibernateProject.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>
{
	Product findByName(String name);
}
 