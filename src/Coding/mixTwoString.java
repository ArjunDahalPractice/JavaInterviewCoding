package Coding;

public class mixTwoString {

	public static void main(String[] args) {
		String firstString = "abc";
		String secondString = "def";
		
		char[] firstChar = firstString.toCharArray();
		char[] lastChar = secondString.toCharArray();
		
		String result = "";
		
		for (int i = 0; i < Math.max(firstChar.length,lastChar.length); i++) {
			if(i<firstChar.length) {
				result = result+firstChar[i];
			}
			if(i<lastChar.length) {
				result = result+lastChar[i];
			}	
		}
		System.out.println(result);		
	}

}
