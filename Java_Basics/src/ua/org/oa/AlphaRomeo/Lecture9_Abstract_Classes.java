package ua.org.oa.AlphaRomeo;

public class Lecture9_Abstract_Classes {

	/* 
	 * abstract class A { ... } - abstract class - couldn't be created like an object
	 * abstract void Method(); - abstract method - could be contained in abstract class. 
	 * Do not have "{}" --> must be realized in child. 
	 * Child will have all methods excluding abstract methods. Child must have all abstract methods pereopredelennimi,
	 * and  have the realization of parent's abstract classes.
	*/ 
	
	public static void main(String[] args) {

		BB b = new BB();
		// AA a = new AA(); - cannot be created cause of "abstractness"
	}

}


abstract class AA {
	public AA() {
		System.out.println("Class A");
	}
	abstract void m(); // the realization must be implemented in the child BB
}

class BB extends AA {
	public BB() {
		System.out.println("Class B");
	}
	
	// the realization of abstract method of parent
	void m() {
		
	}
}