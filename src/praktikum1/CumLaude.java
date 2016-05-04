package praktikum1;

import lib.TextIO;

public class CumLaude {

	public static void main(String[] args) {
		//Kirjutada cum laude detektor.
		//Programm küsib kaalutud keskhinde ja lõputöö hinde.
		//Kui keskhinne on suurem kui 4.5 ja lõputöö hinne on 5 siis ütleb "Jah saad Cum Laude!" Muul juhul ütleb "Ei saa!"
		//Täiendus: programm ei tohi aktsepteerida vigaseid hindeid (üle 5-e, negatiivseid jne). Vigase hinde puhul tuleb anda veateade.
		
		System.out.println("Sisesta keskmine hinne");
		int arv = TextIO.getlnInt();

		System.out.println("Sisesta lõputöö hinne");
		int arv = TextIO.getlnInt();
		
		if (0 == arv % 2) {
		    System.out.println("Sisestatud arv Paaris");
		}
		else {
		    System.out.println("Sisestatud arv on paaritu");
		}
		
	}
}
