package Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class comparingTwoArray {

	public static void main(String[] args) {
		// compare with same length and contents
		int[] array1 = { 1, 2, 5, 6, 7 };
		int[] array2 = { 1, 2, 5, 6, 7 };

		if (Arrays.equals(array1, array2)) {
			System.out.println("It is same");
		} else {
			System.out.println("It is not same");
		}

		// store common element in new array;
		int[] array3 = { 1, 2, 5, 8, 9, 11 };
		int[] array4 = { 2, 5, 6, 7, 9, 10, 11, 12, 13 };
		
		HashSet<Integer> hashSet = new HashSet<>();

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < array3.length; i++)
			hashSet.add(array3[i]);

		for (int i = 0; i < array4.length; i++) {
			if (hashSet.contains(array4[i])) {
				list.add(array4[i]);
			}
		}
		System.out.println(list);

		//delete common element from array;
		int[] array5 = { 1, 2, 5, 8, 9, 11 };
		int[] array6 = { 2, 5, 6, 7, 9, 10, 11, 12, 13 };

		HashSet<Integer> hashSet1 = new HashSet<Integer>();

		List<Integer> list1 = new ArrayList<Integer>();

		for (int j = 0; j < array5.length; j++) {
			hashSet1.add(array5[j]);
		}
		for (int k = 0; k < array6.length; k++) {
			if (!hashSet1.contains(array6[k])) {
				list1.add(array6[k]);
			}
		}
		System.out.println(list1);
	}
}
