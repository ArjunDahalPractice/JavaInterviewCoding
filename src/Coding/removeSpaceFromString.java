package Coding;

public class removeSpaceFromString {
	public static void main(String[] args) {
		String spaceString = " Ar  jun ";
		System.out.println(spaceString.trim().replaceAll("\\s+", ""));
		System.out.println(spaceString.trim().replaceAll("\\s{2}", ""));
	}
}
