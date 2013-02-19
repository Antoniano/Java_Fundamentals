package ua.org.oa.alpaharomeo;

public class MeanValue {


	public static void main(String[] args) {
		
		int a = 20; int b = 10; int range = a-b; double sum = 0;
		while (a >= b) {
			sum = sum + a; 
			a--;
		}
		sum = sum / range;
		System.out.println(sum);
		
	}

}
