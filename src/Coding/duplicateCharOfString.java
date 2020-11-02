package Coding;

import java.util.HashMap;
import java.util.Map;

public class duplicateCharOfString {
	public static void main(String[] args) {

		String name1 = "hello";

		char[] ch = name1.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int count = 1;
		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i])) {
				count++;
				map.put(ch[i], count);
			} else {
				map.put(ch[i], 1);
			}

		}
		System.out.println(map);
	}
}
