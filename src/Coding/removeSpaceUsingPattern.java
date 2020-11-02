package Coding;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class removeSpaceUsingPattern {

	public static void main(String[] args) {
		//for string use [a-z] 
		//for number use "\\d" 
		//for all symbol "\\W"
		//for all whitespace in String--"\\S";
		
		/*
		 * abc… Letters 123… 					Digits \d Any Digit 
		 * \D Any Non-digit character 			. Any Character 
		 * \. Period 							[abc] Only a, b, or c 
		 * [^abc] Not a, b, nor c 				[a-z] Characters a to z 
		 * [0-9] Numbers 0 to 9 				\w Any Alphanumeric character 
		 * \W Any Non-alphanumeric character 	{m} m Repetitions 
		 * {m,n} m to n Repetitions 			"*" Zero or more repetitions 
		 * + One or more repetitions 			? Optional character 
		 * \s Any Whitespace 					\S Any Non-whitespace character 
		 * ^…$ Starts and ends 					(…) Capture Group 
		 * (a(bc)) Capture Sub-group 			(.*) Capture all 
		 * (abc|def) Matches abc or def
		 */
		
		
		String str = "ar   j    u   kl   ljl lkjlj";
		String regex = "\\S";
		
		System.out.println(str.replaceAll("\\s+", ""));

		Pattern pt = Pattern.compile(regex);
		Matcher mt = pt.matcher(str);
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if(mt.find()) {
				result+=mt.group();
			}
		}
		System.out.println(result);
		
	}
}
