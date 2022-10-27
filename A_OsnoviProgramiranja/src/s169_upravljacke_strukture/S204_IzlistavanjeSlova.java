package s169_upravljacke_strukture;

import alati.TextIO;

public class S204_IzlistavanjeSlova {

	public static void main(String[] args) {

		/*
		 * Primer programa koji preuzima jednu liniju teksta od korisnika i 
		 * ispisuje koja se sve slova nalaze u tom tekstu i koliko ima ukupno razli�itih slova.
		 */
		
		String tekst;
		int ukupnoSlova = 0;
		
		System.out.println("Upi�ite tekst");
		tekst = TextIO.getlnString();
		tekst = tekst.toUpperCase();
		
		System.out.print("Upisani tekst sadr�i slede�a slova: ");
		
		for (char a = 'A'; a <= 'Z'; a++) {
			
			for (int i = 0; i < tekst.length(); i++) {
				
				if (a == tekst.charAt(i)) {
					System.out.print(a);
					System.out.print(' ');
					ukupnoSlova++;
					break;
				}
			}
		}

		System.out.println();
		System.out.println("Va� tekst sadr�i ukupno " + ukupnoSlova + " razli�itih slova.");

	}

}
