package com.hibernate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.hibernate.Shape;

@Entity
@DiscriminatorValue(value = "Circle")
//Entity and subclass Circle of mainclass Shape
public class Circle extends Shape{

	@Column(name="radius",nullable=true)
	private int radius;

	//no-arg constructor
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	//field constructor
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	//getter and setter methods
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	//toString() method
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}
