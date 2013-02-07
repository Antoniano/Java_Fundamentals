package ua.org.oa.AlphaRomeo;
import java.util.*;

public class Lecture6 {

	public static void main(String[] args) {
	Lecture5 massiv = new Lecture5();
	int[] massiv_copy = new int[10];
	System.arraycopy(massiv.a, 0, massiv_copy, 0, massiv.a.length);
	System.out.println(massiv_copy[0]);

	ArrayList<Integer> arrlst = new ArrayList<>(); // initialize ArrayList of the needed type
	arrlst.add (1); // add element in the end of the ArrayList
	arrlst.add (11);
	arrlst.add (1221);
	arrlst.set(0, 22); // the element of index 0 will be replaced with number 22 
	arrlst.add(0, 30); //all the elements after index 0 will be moved toward
	
	int x = arrlst.get(0) + arrlst.get(1); // "get" is used to get the elements of ArrayList
	System.out.println(x);
	
	// "For each" cycle for ArrayList 
	for (Integer t : arrlst){
		x = x + t;
		}
	System.out.println(x);
	
	arrlst.remove(0); // remove the cell of index 0
	//arrlst.clear(); // clear all ArrayList values
	int size = arrlst.size();
	System.out.println(size);
	
	
	
	}

}
