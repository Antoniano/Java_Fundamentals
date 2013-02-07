package ua.org.oa.AlphaRomeo;

public class Lecture5 {

int[] a = {7, 13, 5, 3, 96};
String[] b = new String[10];
{b[0]="A"; b[1]="20"; b[3]="30";}

	public static void main(String[] args) {
	
	Lecture5 arr = new Lecture5();
	
	int parsnum = Integer.parseInt(arr.b[3]);
	System.out.println(parsnum);
	System.out.println(arr.b.length);
		
		int sum = 0;
		for (int i : arr.a)
		{sum = sum + i; }
		System.out.print(sum);
	}

}
