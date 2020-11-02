package Coding;

public class reverseString {
	
	public static void main(String[] args) {
		String name = "Arjun";
		char[] ch1 = name.toCharArray();
		for (int i = ch1.length - 1; i >= 0; i--) {
			// System.out.println(ch[i]);
			System.out.println(name.substring(i, i + 1));
		}
		StringBuffer str = new StringBuffer(name);
		System.out.println(str.reverse());
	}
}
