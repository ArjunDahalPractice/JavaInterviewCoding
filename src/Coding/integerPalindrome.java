package Coding;

public class integerPalindrome {

	public static void main(String[] args) {
		int number = 353;
		int sum = 0;
		int remainder = 0;
		int temp = number;

		while (number > 0) {
			remainder = number % 10;
			sum = (sum * 10) + remainder;
			number = number / 10;
		}
		if (sum == temp) {
			System.out.println("Palindrome");
		} else {
			System.out.println("not Palindrome");
		}

	}
}
