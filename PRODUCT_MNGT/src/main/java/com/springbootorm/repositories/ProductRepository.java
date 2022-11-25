package com.springbootorm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.springbootorm.entities.Product;

//methods of interface ProductRepository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	//methods of Product Repository interface
	public Product findById(int id);
	@Transactional
	int removeByPname(String pname);
	@Transactional
	Product findByPrice(Double price);
	@Transactional
	public Product findByPname(String pname);
}
