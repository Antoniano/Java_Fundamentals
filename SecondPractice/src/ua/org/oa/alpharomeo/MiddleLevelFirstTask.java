package ua.org.oa.alpharomeo;

public class MiddleLevelFirstTask {

	public static void main(String[] args) {
		
		String a = "Candy";
		String c = "";
		
		int length = a.length();
		for (int i = 0; i <= length-1; i++) {
			c = c.concat(a.substring(i, i+1)).concat(a.substring(i, i+1));
		}
		System.out.println(c);

	}

}
