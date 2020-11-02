package Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TwoMaxNumberArray {

	public static void main(String[] args) {
		
		//max two numbers..
		int[] n = {18, 3, 2, 20, 5, 15, 16, 1};
		int maxOne = n[0];
		int maxTwo = n[0];
		for (int i = 0; i < n.length; i++) {
			if(n[i]>maxOne) {
				maxOne = n[i];
			} else if (maxOne>maxTwo & n[i]>maxTwo) {
				maxTwo = n[i];
			}
			
		}
		System.out.println(maxOne);
		System.out.println(maxTwo);
		
		
		//min two numbers
		int[] n1 = {9, 3, 6,7,5,0};
		
		int minOne = 0;
		int minTwo = 0;
		
		for (int i = 0; i < n1.length; i++) {
			if(n1[i]<minOne) {
				minOne = n1[i];
			} else if (minTwo>minOne & n1[i]<minTwo) {
				minTwo = n1[i];
			}
		}
		System.out.println("min one "+minOne);
		System.out.println("min two "+minTwo);
		
		
		//minimum most repeated number in array		
		
		int[] arr = {1, 1, 1, 4, 3, 3, 5, 9, 7, 7, 0, 0, 0};
		//step 1 = find repeated number first...
		Map<Integer, Integer> list2 = new HashMap<Integer, Integer>();
		for (int integer : arr) {
			if(list2.get(integer)==null) {
				list2.put(integer, 1);
			} else {
				list2.put(integer, list2.get(integer)+1);
			}	
		}
		//step 2 = find minium number which is repeated maximum times
		int minKey = Integer.MIN_VALUE; //using Integer min_value because array could have number less than and equal 0
		int maxValue = 1; 
		for (Entry<Integer, Integer> integer : list2.entrySet()) {	
			if(minKey<integer.getKey() & integer.getValue()>maxValue) {
				minKey = integer.getKey();
				maxValue = integer.getValue();
			}			
		}
		System.out.println(minKey + " minimum number repeated maximum times");
	}
}