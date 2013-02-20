package ua.org.oa.alpharomeo;

public class EasyLevelThirdTask {


	public static void main(String[] args) {
		
		String a = "Candy";
		
		int length = a.length();
		String c = a.substring(length-2, length);
		c = c.concat(a.substring(0, length-2));
		System.out.println(c);
		
	}

}
