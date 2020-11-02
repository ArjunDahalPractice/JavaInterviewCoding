package Coding;

import java.util.HashMap;
import java.util.Map;

public class anagram {

	public static void main(String[] args) {

		System.out.println(anagramCoding("the Army", "Mary"));

	}

	public static boolean anagramCoding (String firstStr, String secondStr) {

		String str = firstStr + secondStr;

		char[] ch = str.toUpperCase().toCharArray();

		Map<Character, Integer> map = new HashMap<>();

		int count = 0;

		
		for (int i = 0; i < ch.length; i++) {

			if (map.containsKey(ch[i])) {
				count++;
			} else {
				map.put(ch[i], 0);
			}
		}

		if (count == firstStr.length() || count == secondStr.length()) {
			return true;
		} else {
			return false;
		}
	}
}
