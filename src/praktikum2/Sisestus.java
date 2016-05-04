package praktikum2;

import lib.TextIO;

public class Sisestus {

//	public static int kasutajaSisestus(int min, int max) {
//		String kysimus = String.format("Sisesta arv vahemikus %d..%d\n", min, max);
//		return kasutajaSisestus(kysimus, min, max);
//	}
//
//	public static int kasutajaSisestus(String kysimus, int min, int max) {
//		while (true) {
//			System.out.println(kysimus);
//			int sisestus = TextIO.getlnInt();
//			if (sisestus >= min && sisestus <= max) {
//				return sisestus;
//			}
//			System.out.format("Arv %d pole sobilikus vahemikus ju!\n", sisestus);
//		}
//	}
	
	public static int kasutajaSisestus(int min, int max){
		
		while (true) {			
			System.out.format("Sisesta arv vahemikus %d..%d:\n", min, max);
			int sisestus =  TextIO.getlnInt();
			if (sisestus >= min && sisestus <= max){
				return sisestus;			
			}
		}
	
	}
	
	public static void main(String[] args) {
		int arv = kasutajaSisestus(0, 10);
		System.out.println("Sisestasid: " + arv);
	}
}
