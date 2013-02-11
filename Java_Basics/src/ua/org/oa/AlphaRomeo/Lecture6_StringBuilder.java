package ua.org.oa.AlphaRomeo;

public class Lecture6_StringBuilder {
	
	
	
	public static void main(String[] args) {
	
	StringBuilder sb1 = new StringBuilder(); //make a String of size 16, autoappendable
	sb1.append("Greetings!!!"); // add an element at the end of the line
	System.out.println(sb1 + " capacity = " + sb1.capacity()); //length = full cells; capacity = number of cells. 
	
	String greetings = "Greetings!!!";
	StringBuilder sb2 = new StringBuilder(greetings); //16 cells + length of String
	System.out.println (sb2 + " capacity = " + sb2.capacity());
	
	sb1.insert(3, "1");
	System.out.println(sb1 + " capacity = " + sb1.capacity());
	sb1.deleteCharAt(2); // work as with the native line without inserted elements
	sb1.deleteCharAt(3);
	System.out.println(sb1 + " capacity = " + sb1.capacity());
		
	}

}
