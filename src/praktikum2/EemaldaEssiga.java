package praktikum2;

import lib.TextIO;

public class EemaldaEssiga {

	public static void main(String[] args) {

		System.out.println("Sisesta string:");
		
		String text = TextIO.getlnString();
		
		String [] sonad = text.split(" ");
	
		for (String sona : sonad) {
			if (!sona.toLowerCase().contains("s"))
			System.out.print(sona + " ");
			
		}
	
	}
}
