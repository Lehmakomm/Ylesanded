package praktikum1;

import lib.TextIO;

public class tehisintellekt {

	public static void main(String[] args) {
//		Kirjutada programm, mis küsib kasutajalt kaks vanust.
//
//		Kui vanuste vahe jääb alla viie aasta, ütleb "sobib";
//		kui vanuste vahe on rohkem kui viis aastat, ütleb midagi krõbedat;
//		kui vanuste vahe on rohkem kui kümme aastat, ütleb midagi veel krõbedamat.
//		Programmi toimimine ei tohi sõltuda vanuste sisestamise järjekorrast!
		
		System.out.println("Sisesta kaks vanust:");
		int vanus1 = TextIO.getlnInt();
		int vanus2 = TextIO.getlnInt();
		
		int vahe = Math.abs(vanus1 - vanus2);
		
		if (vahe < 5) {
		    System.out.println("Sobib");
		}
		else if (vahe > 5) {
			System.out.println("Olgu");
		}
		else{
			System.out.println("Halb");
		}
	}
}
