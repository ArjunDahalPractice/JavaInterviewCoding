package Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class vowelConsonant {

	public static void main(String[] args) {
		count("Arjun Dahal");
		lamdaExpression("Arjun Dahal");
	}

	public static void count(String str) {
		if (str == null) {
			throw new NullPointerException("Input string can't be null");
		}
		List<Character> list = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		String name = str.replaceAll("\\s+", "");
		char[] ch = name.toLowerCase().toCharArray();
		int vowels = 0;
		int consonant = 0;
		for (int i = 0; i < ch.length; i++) {
			if (list.contains(ch[i])) {
				vowels++;
			} else {
				consonant++;
			}
		}
		System.out.println("Vowels-> " + vowels);
		System.out.println("Consonant-> " + consonant);
	}
	
	public static void lamdaExpression(String str) {
		if (str == null) {
			throw new NullPointerException("Input string can't be null");
		}
		
		List<Character> list = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		String name = str.replaceAll("\\s+", "");
		
		long vowels = name.toLowerCase().chars().filter(d-> list.contains((char) d)).count();
		long consonant = name.toLowerCase().chars().filter(e-> !list.contains((char) e)).count();
		
		System.out.println("Vowels count-> "+vowels);
		System.out.println("Consonant count-> "+consonant);
		
		
		
	
		
	}
}
