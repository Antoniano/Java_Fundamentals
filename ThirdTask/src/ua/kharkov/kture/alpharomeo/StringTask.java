package ua.kharkov.kture.alpharomeo;

public class StringTask {

	static String text = "aZazksdjl akjdakjdlka jdlajsdljasd. " +
			"vnlslUI ncwowne c usc UHyouacsdcbBCKSD BICBsbcksdbcjk!" +
			"UN DBI jsb, dicbsu vus CVC ISDCBI? Bksbcis, dH BcHVcjsdcksdbcj!";
	static StringBuilder vowels = new StringBuilder();
	{
		vowels.append("a");
		vowels.append("e");
		vowels.append("i");
		vowels.append("u");
		vowels.append("y");
		vowels.append("o");
	}
	
	public static void main(String[] args) {
		
		StringTask createAnObj = new StringTask();
		String worktext = text.toLowerCase(); 
		int counter = 0;
		
		for (int i=0; i<worktext.length(); i++) {
			if ((worktext.charAt(i) >= 97) && (worktext.charAt(i) <= 122)) {
				for (int k=0; k<vowels.length(); k++) {
					if (worktext.charAt(i)==vowels.charAt(k)) {counter++; break;}
				}		
			}
		if (counter > (worktext.length() / 2)) {System.out.println("There are more vowels in the text: "); break;}
		if ((i-counter) > (worktext.length() / 2)) {System.out.println("There are more consonants in the text: "); break;} 
		}
		
		System.out.println(counter);
		
	}

}
