package ua.org.oa.AlphaRomeo;

public class Lecture8_Inheritance extends Lecture7_Inheritance {

	public int i;
	
	@Override // means that the method "m" of Cecture8 class override the method "m"  of Lecture7 class
	public void m () {
		System.out.println("Lecture8");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lecture8_Inheritance other = (Lecture8_Inheritance) obj;
		if (i != other.i)
			return false;
		return true;
	}


}
