package com.hibernate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.hibernate.Shape;

@Entity
@DiscriminatorValue("Rectangle")
//Entity and subclass Rectangle of mainclass Shape
public class Rectangle extends Shape{

	//data members length 
	@Column(nullable = true)
	private int length;
	//data member breadth
	@Column(nullable = true)
	private int breadth;
	//no-arg constructor
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	//parameterized constructor
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	//getter-setter methods
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	//toString method
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}

}
