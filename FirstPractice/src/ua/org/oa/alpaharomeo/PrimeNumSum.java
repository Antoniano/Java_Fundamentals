package ua.org.oa.alpaharomeo;

public class PrimeNumSum {

	public static void main(String[] args) {
		
		int primesum = 0; int i; int j;
		for (i = 2; i <= 20; i++) {
			for (j = 2; j < i; j++) {
				if (i%j == 0) {break;}
			}
			if (j==(i)){primesum = primesum + i;}
		}
		System.out.println("Sum of primenums in range [" + 0 + "; " + i + "] is: " + primesum);
		
	}

}
