package Coding;

public class fibonacciSeries {

	public static void main(String[] args) {
		
		// Write fibonacci Series upto 10

		int[] result = new int[10+1];
		
		
		for (int i = 1; i <=result.length-1; i++) {

			if (i <= 2) {
				result[i] = 1;
			}
			if (i > 2) {
				result[i] = result[i - 1] + result[i - 2];				
			}
			System.out.println(result[i]);
		}
	}

}
