package praktikum2;

public class Jada {

	public static String kriipsud(int mitu){
		return symboliJada('-',mitu);
	}
	
	public static String symboliJada(char taht, int mitu) {
		
		String tulemus = "";

		for (int i = 0; i < mitu; i++) {
			tulemus = tulemus + taht;
		}
		
		return tulemus;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(kriipsud(4));
		System.out.println(symboliJada('s', 4));
		System.out.println(symboliJada('t', 4));
		System.out.println(symboliJada('e', 4));
		System.out.println(symboliJada('n', 4));
		System.out.println(kriipsud(4));
		
	}

}
