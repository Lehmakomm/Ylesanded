package praktikum2;

public class Arvutabel {

	public static void main(String[] args) {
		
		int suurus = 10;
		
		for (int rida = 0; rida < suurus; rida++) {
		    for (int veerg = 0; veerg < suurus; veerg++) {
		    	int arv = rida + veerg;
		    	if (arv >= suurus){
		    		arv = arv - 10;
		    	}
			    	System.out.format("%2d", arv);
		   }
		    System.out.println();
		}
	}
}
