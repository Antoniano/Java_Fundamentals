package ua.org.oa.kate;

public class FirstProg {
	
	byte cc;	
	static int a = 0;
	float b;
	double c;
	char t;
	boolean f;
	byte dd;
	
	public static void main(String[] args) {
		int i = 0;
		
		FirstProg test = new FirstProg();
		
		for (i=0; i < 20; i++) {
			test.a = test.a + i;
		}
		
		System.out.println(a);
		
		test.a = 0;
		while (i <= 20) {
			test.a = test.a + i;
			i++;
		}
		
		

	}
	
	public void checksum() {
		
	}

}
