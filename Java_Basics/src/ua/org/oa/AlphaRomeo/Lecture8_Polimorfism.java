package ua.org.oa.AlphaRomeo;

public class Lecture8_Polimorfism {

	// Polimorfism - possibility of one specification objects to have diffrent realization.
	// You can's see the unique methods in child classes with downcasting
	// 
	
	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		C c = new C();
		
		a.polimorftest();
		b.polimorftest();
		c.polimorftest();
		
		
	}

}



class A {
	public void polimorftest () {
		System.out.println("A");
	}
}

class B extends A {
	public void polimorftest () {
		System.out.println("B");
	}
}

class C extends A {
	public void polimorftest () {
		System.out.println("C");
	}
}