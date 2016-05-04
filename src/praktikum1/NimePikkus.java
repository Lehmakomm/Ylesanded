package praktikum1;

import lib.TextIO;

public class NimePikkus {

	public static void main(String[] args) {
		//Kirjutada programm, mis küsib kasutajalt nime ning annab teada, mitu tähte nimes on. String-i pikkuse saab Javas järgmiselt:
		
        System.out.println("Sisesta oma nimi:");
        String nimi = TextIO.getlnString();
		
		System.out.println("Su nime pikkus on: " + nimi.length());

	}
}
