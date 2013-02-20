package ua.org.oa.alpharomeo;

public class MiddleLevelSecondTask {


	public static void main(String[] args) {
		
		String a = "bob is bib and bab so he is blobub";
		String c = "b";	
		
		int position, count = 0;
		for (position = 0; position <= a.length()-2; position++) {
			if 	((a.charAt(position) == c.charAt(0)) && (a.charAt(position+2) == c.charAt(0))) {count++;}
		}
		
		System.out.println("count = " + count);
		
	}

}
