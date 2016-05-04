package praktikum1;
import lib.TextIO;

public class Korrutis {
    public static void main(String[] args) {
    	
        System.out.println("Sisesta esimene arv");
        int arv1 = TextIO.getlnInt();
        
        System.out.println("Sisesta teine arv");
        int arv2 = TextIO.getlnInt();
        
        int ruut = arv1 * arv2;
        
        System.out.println("Nende arvu korrutis on " + ruut + ".");
    }
}