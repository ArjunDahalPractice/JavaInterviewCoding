package Coding;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateCharFromString {
	
	public static void main(String[] args) {
		String str = "java";
		char[] firstChar = str.toCharArray();
		Set<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < firstChar.length; i++) {
			set.add(firstChar[i]);
		}
		for (Character character : set) {
			System.out.println(character);
		}
	}
}
