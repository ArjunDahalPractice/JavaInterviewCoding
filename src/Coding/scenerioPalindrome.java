package Coding;

import java.util.regex.Pattern;

public class scenerioPalindrome {
//You need to write test cases and code for customer requirement

//Requirement:
//Design a method that takes input string and returns boolean
//for method to return true, following two conditions should match:
//1. string should be palindrome irrespective of spaces, for eg 'mom' is palindromic and so is 'mom hah mom'.
//2. parenthesis should be balance, i.e. every open parenthesis should be followed by a closed one
//Restriction:
//	we cannot modify input string
//Examples:
//	<mom hah mom> returns true
//	<mom returns false as parenthesis are not balanced
//	<mom had> returns false as string is non palindromic

	
	
	public static void main(String[] args) {
		System.out.println(palindrome("<mom hah mom>"));
	}

	public static boolean palindrome(String str) {
		
		char[] ch = str.toCharArray();
		String result = "" ;
		
		for (int i = ch.length-1; i >= 0; i--) {
			result += Character.toString(ch[i]);
		}
		
		System.out.println(result);
		return result.equals(str);
	}

}
