package com.hibernate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value = "Shape")
@Table(name="Shape_hibernate2")
//mainclass and Entity Shape
public class Shape {

	@Id
	@GeneratedValue
	@Column(name="shape_id",nullable = true)
	//single data member shape_Id
	private int shape_Id;
	//no-arg constructor
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	//parameterized constructor
	public Shape(int shape_Id) {
		super();
		this.shape_Id = shape_Id;
	}

	//getter-setter methods
	public int getShape_Id() {
		return shape_Id;
	}

	public void setShape_Id(int shape_Id) {
		this.shape_Id = shape_Id;
	}
	//toString method
	@Override
	public String toString() {
		return "Shape [shape_Id=" + shape_Id + "]";
	}

}
