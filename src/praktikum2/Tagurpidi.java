package praktikum2;


import java.util.ArrayList;
import java.util.Collections;

import lib.TextIO;

public class Tagurpidi {

	public static void main(String[] args) {

		int mitu = 3;
		ArrayList<Integer> arvud = new ArrayList<Integer>();

		System.out.format("Sisesta %d arvu\n", mitu);
		for (int i = 0; i < mitu; i++) {
			System.out.print(i + 1 + ". ");
			
			int arv = TextIO.getlnInt();
			arvud.add(arv);
		}
		Collections.reverse(arvud);
		
		for (Integer arv : arvud) {
			
			System.out.print(arv + " ");
			
		}
	}
}
