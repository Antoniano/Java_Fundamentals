package ua.org.oa.AlphaRomeo;

public class Lecture6_Boxing {

	public static void main(String[] args) {
		Integer k, j;
		k=6; j=6;
		System.out.println(k==j);
		
		k=500; j=500;
		System.out.println(k==j);
		
		System.out.println(Integer.valueOf(10)==Integer.valueOf(10));
		
	}
}
