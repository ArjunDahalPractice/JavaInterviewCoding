package Coding;

public class maxAndminNumberInArray {

	public static void main(String[] args) {
		
		int[] number = {10, 1, 7, 3, 16};
		
		int maxNumber = number[0];
		int minNumber = number[0];
	
		
		for (int i = 0; i < number.length; i++) {
			
			if(number[i]>maxNumber) {
				maxNumber = number[i];
			} else if (number[i]<minNumber) {
				minNumber = number[i];
			}	
		}
		
		System.out.println("Max Number "+maxNumber);
		System.out.println("min Number "+minNumber);

	}

}
