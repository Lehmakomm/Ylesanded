package praktikum2;

public class IksPluss {

	public static void main(String[] args) {

		int suurus = 11;
		String kriipsud = Jada.symboliJada('-', suurus * 2 + 3);

		// while (true) {
		// System.out.println("Sisesta paaritu arv");
		// suurus = TextIO.getlnInt();
		// if (suurus % 2 == 1) {
		// break;
		// }
		// }
		
		kriipsud = kriipsud + " " +kriipsud;
		System.out.println(kriipsud);
		
		for (int rida = 0; rida < suurus; rida++) {
			
			for (int veerg = 0; veerg < suurus; veerg++) {
				System.out.format("%2s", rida == veerg || rida + veerg == suurus - 1 ? "X" : ".");
			}
			for (int veerg = 0; veerg < suurus; veerg++) {
				System.out.format("%2s", rida == suurus / 2 || veerg == suurus / 2 ? "X" : ".");
			}
			System.out.println(" |");
		}

	}
}
