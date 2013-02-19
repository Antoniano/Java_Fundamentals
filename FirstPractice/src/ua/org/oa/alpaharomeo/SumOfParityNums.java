package ua.org.oa.alpaharomeo;

public class SumOfParityNums {


	public static void main(String[] args) {

		int sum1 = 0; int sum2 = 0;
		for (int i = 0; i <= 20; i++){
			if (i%2==0) sum1=sum1+i;
			else sum2=sum2+i;
		}
		
		IntSum.main();
		System.out.println("Parity numbers sum: " + sum1);
		System.out.println("Non parity numbers sum: " + sum2);
	}

}
