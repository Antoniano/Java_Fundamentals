package ua.org.oa.AlphaRomeo;

public class Lecture6_Strings {

	public static void main(String[] args) {
		char[] helloArray = {'h', 'e', 'l', 'l', 'o'};
		String helloString = new String (helloArray);
		System.out.print(helloString + "	");
		System.out.print(helloString.length() + "	");
		System.out.print(helloString.charAt(1) + "	");
		
		System.out.println();
				
		String substr1 = helloString.substring(1);//copy Substring from index 2
		String substr2 = helloString.substring(2, 4); // copy Substring of index 2 and 3
		System.out.print(substr1 + "	");
		System.out.print(substr2 + "	");
		
		System.out.println();
		
		String strcon = substr1.concat(substr2);
		System.out.println(strcon + "	");
		
	}

}
