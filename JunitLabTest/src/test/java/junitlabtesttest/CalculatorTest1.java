package junitlabtesttest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import junitlabtestmain.Calculator1;

public class CalculatorTest1 {
	//first method testing for addition
	@Test
	public void addTest()
	{
		assertEquals(30,Calculator1.addition(10,20));
	}
	//second method testing for substraction
	@Test
	public void subTest()
	{
		assertEquals(10,Calculator1.substraction(30,20));
	}
}
