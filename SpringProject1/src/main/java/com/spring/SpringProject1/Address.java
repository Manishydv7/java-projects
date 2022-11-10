package com.spring.SpringProject1;
//class Address
public class Address {
	//class properties
	private int hno;
	private String area;
	private String city;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	//parameterized constructor
	public Address(int hno, String area, String city) {
		super();
		this.hno = hno;
		this.area = area;
		this.city = city;
	}
	//getter setter method
	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	//toString method
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", area=" + area + ", city=" + city + "]";
	}

}
