package s169_upravljacke_strukture;

import alati.TextIO;

public class S207_Z5_ProcenatBrojevaDeljivihSa3 {

	/*
	 * Napisati program koji odre�uje procenat brojeva deljivih sa 3 
	 * od N brojeva. Korisnik unosi N, a zatim same brojeve (15-62). 
	 */

	/*
	 * NAPOMENA. Re�enje tre�eg zadatak nisam dobro osmislio. Ipak mo�e bez niza. 
	 */
	
	public static void main(String[] args) {
		
		// Deklari�emo globalne promenljive.
		int n, broj, brojac = 0;
		boolean siguran = true;
		
		// Od korisnika tra�imo da upi�e du�inu sekvence.
		do {
			System.out.println("Upi�ite du�inu sekvence (preporu�ena du�ina do 10 brojeva): ");
			n = TextIO.getlnInt();
			
			// Ukoliko je korisnik upisao sekvencu du�u od 10 brojeva pitamo ga da li
			// je siguran da �eli da se pati sa unosom. Ako nije siguran (false)
			// do while petlja ga vra�a na ponovni unos du�ine sekvence.
			if (n > 10) {
				System.out.println
					("Da li ste sigurni da �elite da upisujete vi�e od 10 brojeva (y/n)?");
				siguran = TextIO.getlnBoolean();
			}
		} while (!siguran);

		// Po�to su korisnici uglavnom lenji, pitamo ga da li �eli da program generi�e
		// vrednosti umesto njega. Za odgovor recikliramo promenljivu "siguran".
		System.out.println("Da li �elite da vrednosti generi�em umesto Vas (y/n)?");
		siguran = TextIO.getlnBoolean();

		// Ako korisnik nije lenj ispisujemo mu poruku �ta dalje da radi.
		if (!siguran) {
			System.out.println("Upi�ite vrednost u rasponu 15-62");
		}

		// Po�to je du�ina sekvence poznata, koristimo for petlju za unos vrednosti.
		// Indeks "i" �ivi samo u for petlji pa ga deklari�emo unutar petlje.
		for (int i = 1; i <= n; i++) {
			// Ako se korisnik odlu�io za generisanje brojeva koristimo Math.random() metodu.
			// (https://www.baeldung.com/java-generating-random-numbers-in-range)
			if (siguran) {
				broj = (int) ((Math.random() * (62 - 15)) + 15);
				System.out.println("sekvenca " + i + " od " + n + ": " + broj);
			}
			
			// U drugom slu�aju vrednosti unosi ru�no.
			else {
				// Nije poznato koliko puta �e korisnik zeznuti vrednost pa
				// koristimo do while petlju
				do {
					System.out.println("sekvenca " + i + " od " + n + ": ");
					broj = TextIO.getlnInt();
					
					if (broj < 15 || broj > 62) {
						System.out.println("\tGRE�KA! Upisali ste pogre�nu vrednost (15-62)");
					}
				} while (broj < 15 || broj > 62);
			}
			
			// Ispitujemo da li je deljivo sa 3 i uve�avamo broja� za 1 ako jeste.
			if (broj % 3 == 0) {
				brojac++;
			}
		}
		
		// Ispis rezultata
		System.out.println
			("Od ukupno " + n + " upisanih brojeva, sa 3 je deljivo " + brojac + ".");
		
		// Zezamo (L)user-a ako nije ni�ta pogodio.
		if (brojac == 0) {
			System.out.println("Na�alost, NISTE pogodili ni jedan broj deljiv sa 3.");
		}
		System.out.println("KRAJ programa.");
	}
}
