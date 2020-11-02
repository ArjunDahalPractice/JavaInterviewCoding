package Coding;

public class stringPalindrome {
	public static void main(String[] args) {
		String palin = "madam";
		String result = "";
		char[] ch5 = palin.toCharArray();
		for (int i = ch5.length - 1; i >= 0; i--) {
			result = result + Character.toString(ch5[i]);
		}
		System.out.println(result);
		if (palin.equals(result)) {
			System.out.println("It is palindrom string");
		} else {
			System.out.println("It is not palindrom string");
		}

	}
}
