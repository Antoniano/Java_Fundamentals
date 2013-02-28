package ua.kharkov.kture.alpharomeo;

public class VowelsConsonants {

	static String text = "Written languages change more slowly than corresponding spoken languages. " +
			"When one or more registers of a language come to be strongly divergent from spoken language, the resulting situation is called diglossia. " +
			"However, such diglossia is often considered as one language, between literary language and other registers, especially if the writing system reflects its pronunciation." +
			"Native readers and writers of English are often unaware that the complexities of English spelling make written English a somewhat artificial construct. The traditional spelling of English, at least for inherited words, preserves a late Middle English phonology that is no one's speech dialect. " +
			"The artificial preservation of this much earlier form of the language in writing might make much of what we write intelligible to Chaucer (1343–1400), even if we could not understand his speech." +
			"This text is taken from Wikipedia - the free encyclopedia.";

	static StringBuilder vowels = new StringBuilder();
	{
		vowels.append("a");
		vowels.append("e");
		vowels.append("i");
		vowels.append("u");
		vowels.append("y");
		vowels.append("o");
	}

	static String sentenceEnd = ".!?";

	public static void main(String[] args) {

		VowelsConsonants createAnObj = new VowelsConsonants();
		String worktext = text.toLowerCase(); // Take a text to lower case for easy testing
		int vCount = 0; // vowels count
		int cCount = 0; // consonants count

		for (int i = 0; i < worktext.length(); i++) { // read all the text
			if ((worktext.charAt(i) >= 97) && (worktext.charAt(i) <= 122)) { // if the letter is in range from [a; z]
				for (int k = 0; k < vowels.length(); k++) { // compare the letter with vowels
					if (worktext.charAt(i) == vowels.charAt(k)) {
						vCount++;
						break;
					} else if (k == (vowels.length() - 1)
							&& worktext.charAt(i) != vowels.charAt(k)) { // check if it's consonant
						cCount++;
					}
				}
				
			} else if ((worktext.charAt(i) == sentenceEnd.charAt(0))
					|| (worktext.charAt(i) == sentenceEnd.charAt(1))
					|| (worktext.charAt(i) == sentenceEnd.charAt(2))) { // if the sentence finished - print and restart the counters
				System.out.println("Vowels: " + vCount);
				System.out.println("Contanents: " + cCount);
				System.out.println("----------------");
				vCount = 0;
				cCount = 0;
			}

		}

	}

}