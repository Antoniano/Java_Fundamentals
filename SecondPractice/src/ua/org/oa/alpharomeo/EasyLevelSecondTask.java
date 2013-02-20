package ua.org.oa.alpharomeo;

public class EasyLevelSecondTask {

	public static void main(String[] args) {
		
		String a = "Candy";
		
		int length = a.length(); int middle = (length - 3) / 2;
		String c = a.substring(middle, length-middle);
		System.out.println(c);
		
	}

}
