package junitlabtesttest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import junitlabtestmain.Palindrome1;

//test class
public class PalindromeTest1 {

	//in this we are assigning many String values to check whether the string is palindrome or not
	@DisplayName(value="Checking String palindrome")
	@ParameterizedTest
	@ValueSource(strings  = {"abba","edde","zazazaz","tootootoot"})
	public void isPalindromeTest(String str)
	{
		assertTrue(Palindrome1.isPalindrome(str));
	}
}

