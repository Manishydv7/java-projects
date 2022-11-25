package com.springbootorm.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//entity class
public class Product {
	
	//data members of the class
	@Id
	@GeneratedValue
	private int product_id;
	private String pname;
	private String pbrand;
	private double price;
}
