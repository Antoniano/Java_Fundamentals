package ua.org.oa.alpharomeo;

public class MiddleLevelThirdTask {

	/*
	 * The program should contain 2 exceptions for 0 and very the last delimiter signs
	 */

	public static void main(String[] args) {

		String test = "Thi*s i*s hor*osho!";
		String delimiter = "*";
		String result = "";
		int length = test.length();
		int count = 0;
		
		for (int i=0; i < length; i++) {
			if (test.charAt(i) == delimiter.charAt(0)) {count++;}
		}
		
		int start = 0; int end = 1;
		for (int i=0; i < count; i++)  {
			end = test.indexOf(delimiter, start);
			result = result.concat(test.substring(start, end-1)); 
			start = end+2;
			System.out.println(length+ " " +end + " " + start);
		}
		result = result.concat(test.substring(start, test.length()));
		System.out.println(result);
		
		
	}

}
