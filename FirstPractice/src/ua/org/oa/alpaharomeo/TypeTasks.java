package ua.org.oa.alpaharomeo;

public class TypeTasks {

	static int a;
	static float b;
	static char c;
	static boolean d;
	static double e;

	public static void main(String[] args) {

		// Local variables couldn't be used without initialization

		System.out.println("1) " + a);
		System.out.println("2) " + b);
		System.out.println("3) " + c);
		System.out.println("4) " + d);
		System.out.println("5) " + e);

		System.out.println();

		/* float floattest1 = 1.; Couldn't be used */
		float floattest2 = 1;
		float floattest3 = 0x1;
		float floattest4 = 0b1;
		/* float floattest5 = 1.0e1; Couldn't be used */
		float floattest6 = 01;

		System.out.println("1) " + floattest2);
		System.out.println("2) " + floattest3);
		System.out.println("3) " + floattest4);
		System.out.println("4) " + floattest6);

		short shorttest;
		shorttest = 1 + 1;
		System.out.println("1) " + shorttest);
		
		/*
		 * shorttest = 1 + 0.1; 
		 * shorttest = 1 + floattest2; 
		 * byte btest = 20;
		 * short stest = 20; 
		 * shorttest = btest + stest; 
		 * double dtest = 0.1;
		 * shorttest = dtest + floattest2;
		 * Couldn't be used cause of type mismatch 
		 */

	}

}