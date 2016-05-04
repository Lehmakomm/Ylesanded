package praktikum2;

public class Tabel {

	public static void main(String[] args) {
		
		int suurus = 7;
		
		for (int rida = 0; rida < suurus; rida++) {
		    for (int veerg = 0; veerg < suurus; veerg++) {
		    	
		    	if (String.valueOf(rida) == String.valueOf(veerg)){
		    		System.out.print("1 ");
		    	}
		    	else {
		        System.out.print("0 ");
		    	}
		    }
		    System.out.println();
		}
	}
}
