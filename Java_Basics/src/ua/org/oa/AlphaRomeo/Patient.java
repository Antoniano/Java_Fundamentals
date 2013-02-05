package ua.org.oa.AlphaRomeo;

public class Patient {

	public static void initializeDatabase (int id) {
		int i= 0;
		int[] cardId = new int[3];
		String[] ilness = new String [3];
		String[] name = new String[3];
		String[] surname = new String[3];
		boolean[] healthInsurance = new boolean[3];
		
		//initialization of the first patient data
		i = 1;
		cardId[i] = 1;
		ilness[i]="Flue";
		name[i]="Kate";
		surname[i]="Kader";
		healthInsurance[i]=true;
		
		//initialization of the second patient data
		i = 2;
		cardId[i] = 2;
		ilness[i]="Broken leg";
		name[i]="Jane";
		surname[i]="Osvald";
		healthInsurance[i]=false;
		
		showPatientStatus(cardId[id], ilness[id], name[id], surname[id], healthInsurance[id]);
	}

	public static void showPatientStatus(int patientId, String patientIlness, String patientName, String patientSurname, boolean patientHealthInsurance) {
		System.out.println ("Id: " + patientId); 
		System.out.println ("Name: " + patientSurname + " " + patientName); 
		System.out.println ("Ilness: " + patientIlness);
		System.out.println ("Health Insurance: " + patientHealthInsurance);
	}

	public static void main(String[] args) {
		int searchId = 1; //Which patient do You looking for?
		initializeDatabase(searchId);
	}

}