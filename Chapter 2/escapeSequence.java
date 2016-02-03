/*****************************************************
 * P2.18 Write the word hello in large letters using
 * asterisks. Such as 
 * final string LETTER_H = "*   *\n*   *\n*****\n*   *\n*   *\n".
 ****************************************************/
public class escapeSequence {

	public static void main(String[] args) {
		final String LETTER_H = "*   *\n*   *\n*****\n*   *\n*   *\n";
		final String LETTER_E = "*****\n*    \n*****\n*    \n*****\n";
		final String LETTER_L = "*    \n*    \n*    \n*    \n*****\n";
		final String LETTER_O = "*****\n*   *\n*   *\n*   *\n*****\n";
		
		System.out.print(LETTER_H + LETTER_E + LETTER_L + 
				LETTER_L + LETTER_O);

	}

}
