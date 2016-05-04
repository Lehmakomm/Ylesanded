package praktikum1;

import lib.TextIO;

public class Grupid{

	public static void main(String[] args) {
	
        System.out.println("inimeste arv");
        int inimesed = TextIO.getlnInt();
        
        System.out.println("grupi suurus");
        int grupp = TextIO.getlnInt();
		
        
		int jaak = inimesed % grupp;
		
		System.out.println("Saab moodustada" + inimesed / grupp + "ja üle jääb:" + jaak );
				
	}
}
