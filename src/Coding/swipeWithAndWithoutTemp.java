package Coding;

public class swipeWithAndWithoutTemp {

	public static void main(String[] args) {
		//Swiping two integer
		int x = 5;
		int y = 6;

		x = x + y; // 11
		y = x - y; // 11-6
		x = x - y; // 11-5

		System.out.println(x);
		System.out.println(y);

		
		//Swiping two String
		String x1 = "Arjun";
		String y1 = "Sanjay";

		x1 = x1 + y1; 
		y1 = x1.substring(0, x1.length() - y1.length());
		x1 = x1.substring(y1.length());

		System.out.println(y1);
		System.out.println(x1);

		
		//with int temp variable...
		int x2 = 7; 
		int y2 = 8;
		
		int temp = x2;
		x2 = y2;
		y2 = temp;
		System.out.println(x2);
		System.out.println(y2);
		
		//with String variable ...
		
		
		
		
				
		
		
		
	}
}
