package ua.org.oa.AlphaRomeo;

public class Lecture8_casting {

	// Casting is available from child --> to parent. Child has all methods of parent + its own. Parent hasn't. 
	
	public static void main(String[] args) {
		
		Lecture8_Inheritance test = new Lecture8_Inheritance(); // Child of Lecture7
		Lecture7_Inheritance myTest = test; // Parent for Lecture8
		Lecture8_Inheritance yourTest = (Lecture8_Inheritance) test; // Use Downcasting from Parent --> to Child 
		
		Lecture7_Inheritance parent = new Lecture8_Inheritance(); // From Child --> to Parent. This variant is possible.
		

	}

}
