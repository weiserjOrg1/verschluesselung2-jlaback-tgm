
public class ShiftCipher extends MonoAlphabeticCipher{
	
	//Attribute
	private int verschiebung;
	
	
	/**
	 * Konstruktor für die Klasse ShiftCipher	
	 * @param verschiebung übernimmt, um wie viele Stellen die Buchstaben verschoben werden sollen
	 */
	public ShiftCipher(int verschiebung) {
		this.verschiebung = verschiebung;
	}
	
	public void setShiftValue(int verschiebung) {
		if (verschiebung != 0) {
			shift(verschiebung);
		}else {
			//Exception
		}
	}
	
	/** 
  	 * Methode verschiebt alphabet um gewünschten Wert
  	
  	*/
	
	public int shift(int verschiebung) {
		  char[] alphabet  = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
		            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
		            'w', 'x', 'y', 'z', 'ä', 'ö', 'ü', 'ß' };
		  
		  	char verschAlphabet[];
		  	verschAlphabet = new char[alphabet.length]; //verschobenes Alphabet Array
		  	
		  	for (int i = 0; i < alphabet.length; i++) {
		  		char buchstabe = (char) (alphabet[i] + verschiebung);
		  		verschAlphabet[i] = buchstabe;
		  	}
		  	
		  	for (int i = 0; i < verschAlphabet.length; i++) { //Testausgabe
		  		System.out.println(verschAlphabet);
		  	}
		  		
		  	
		    public static char verschAlphabet[] = { 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 
		            'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Z', 'X', 'C',
		            'V', 'B', 'N', 'M' };
		 
		    public static String doEncryption(String s) {
		        char c[] = new char[(s.length())];
		        for (int i = 0; i < s.length(); i++)
		        {
		            for (int j = 0; j < 26; j++)
		            {
		                if (p[j] == s.charAt(i))
		                {
		                    c[i] = ch[j];
		                    break;
		                }
		            }
		        }
		        return (new String(c));
		    }
		 
		    public static String doDecryption(String s) {
		        char p1[] = new char[(s.length())];
		        for (int i = 0; i < s.length(); i++)
		        {
		            for (int j = 0; j < 26; j++)
		            {
		                if (ch[j] == s.charAt(i))
		                {
		                    p1[i] = p[j];
		                    break;
		                }
		            }
		        }
		        return (new String(p1));
		    }
	}
	
	
}
