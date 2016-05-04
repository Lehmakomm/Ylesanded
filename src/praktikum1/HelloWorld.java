package praktikum1;

import lib.TextIO;

public class HelloWorld {
    public static void main(String[] kasurida) {
        System.out.println("Tere");
        System.out.println("maailm");
        System.out.println("!");
        System.out.println("tere"); // Äärmuslik kommentaar
        
        int arv = TextIO.getlnInt();
     
        System.out.println();
        System.out.println(arv);
    }
}
