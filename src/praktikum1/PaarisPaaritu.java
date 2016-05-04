package praktikum1;

import lib.TextIO;

public class PaarisPaaritu {

	public static void main(String[] args) {
		
		//Kirjutada programm, mis küsib kasutajalt arvu ning trükib ekraanile, vastavalt kas arv on paaris või paaritu. 
		//Paaris arvu kahega jagamise jääk (arv % 2) on 0.
		
		System.out.println("Sisesta üks arv");
		int arv = TextIO.getlnInt();

		if (0 == arv % 2) {
		    System.out.println("Sisestatud arv paaris");
		}
		else {
		    System.out.println("Sisestatud arv on paaritu");
		}
	}
}
