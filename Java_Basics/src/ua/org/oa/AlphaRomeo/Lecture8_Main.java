package ua.org.oa.AlphaRomeo;

public class Lecture8_Main {

	//* Objec class = class for all another classes
	
	public static void main(String[] args) {
		
		Lecture8_Inheritance test = new Lecture8_Inheritance();
		test.m(); // if to comment the function "m" in Lecture8 Class - it will take it from
				 // parent class Lecture7

		Lecture8_Inheritance test1 = new Lecture8_Inheritance();
		System.out.println(test.equals(test1));
	}

}
