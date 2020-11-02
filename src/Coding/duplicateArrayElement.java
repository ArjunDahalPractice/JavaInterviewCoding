package Coding;

import java.util.HashMap;
import java.util.Map.Entry;

public class duplicateArrayElement {

	public static void main(String[] args) {
	
	//Duplicate String in Array...	
	
		String[] str = {"Arjun", "Arjun", "Sanjay", "Sanjay", "Sanjay", "Jyoti", "Sunita", "Sanjay", "Arjun"};
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (String string : str) {
			if(map.get(string)== null) {
				map.put(string, 1);
			} else {
				map.put(string,map.get(string)+1);
			}
		}
		System.out.println(map);
		
		for (Entry<String, Integer> string : map.entrySet()) {
			System.out.println(string);
		}
		
		
	//Duplicate Integer in Array .... 
		
		Integer[] str1 = {5,6,7,10,11,6,10,10};
		
		HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		
		for (Integer number : str1) {
			if(map1.get(number)== null) {
				map1.put(number, 1);
			} else {
				map1.put(number,map1.get(number)+1);
			}
		}
		for (Entry<Integer, Integer> numbers: map1.entrySet()) {
			System.out.println(numbers);
		}
		
	}
}
