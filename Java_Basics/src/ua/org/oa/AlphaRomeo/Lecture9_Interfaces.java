package ua.org.oa.AlphaRomeo;

public class Lecture9_Interfaces {

		/*
		 * All variables are public and "final"
		 * The variables must be initialized because they are finalized
		 * All methods are "public abstract"
		 * Class must implement all the methods of Interface and the methods of all children of used Interface
		 * Interface can "extend" another interfaces
		 * Interfaces is the only variant to majority implementation
		 */
	
	public static void main(String[] args) {
			
	}

}

	interface Inable {
		// int i; - must be initialized
		int a = 6; // the same like "final a = 6;"
		// a = 7;  // can't do it because "a" is finilized
	    void test();
	}
	
	interface Anable {
	    void test();
	}
	
	class BBB { // It could be "abstract" to.
		
	}
	
	class ABC extends BBB implements Inable, Anable { // Class can have multiple interfaces
		public void test() { // Must have "public" access, cause of interface implementation
		}
	}