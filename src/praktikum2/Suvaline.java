package praktikum2;

public class Suvaline {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println((int)(Math.random() * 10 ) +1);
			
		}
	}
	
	public static int suvaline(int min, int max) {
		return (int)(Math.random() * (max - min + 1)) + min;
	}
}
