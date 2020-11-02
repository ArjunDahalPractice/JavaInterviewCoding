package Coding;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpression {

	public static void main(String[] args) {
		String regex = "\\d";
		String inputText = "arjun123";

		System.out.println(digitFromString(regex, inputText));
	}

	public static int digitFromString(String regex, String inputText) {
		Pattern pt = Pattern.compile(regex);
		Matcher mt = pt.matcher(inputText);
		String result = "";
		for (int i = 0; i < inputText.length(); i++) {
			if (mt.find()) {
				result += mt.group();
			}
		}
		int digit = Integer.parseInt(result);

		return digit;

	}
}
