package s169_upravljacke_strukture;

import alati.TextIO;

public class S207_Z4_ProsecnaOcena {

	/*
	 * Napisati program koji odre�uje prose�nu ocena studenta u toku jedne godine. 
	 * Korisnik unosi ocene studenta (5..10) sve dok ne unese vrednost 0. 
	 */
	
	public static void main(String[] args) {
		
		// Deklari�emo globalne promenljive
		int predmet = 1, ocena, ocenaUkupno = 0;
		double ocenaProsek = 0;
		
		// Ceo program radi u beskona�noj petlji a unutra ispitujemo da li �e biti kraj programa.
		do {
			// Od korisnika tra�imo da upi�e ocenu za aktuelni predmet.
			// U prvoj iteraciji se odnosi na predmet 1 koji smo inicijalizovali na po�etku.
			System.out.println
				("Upi�ite ocenu za predmet broj " + predmet + " (ocena 5 - 10, izlaz 0): ");
			ocena = TextIO.getlnInt();
			
			// Ispitujemo uslov za prekid rada programa.
			if (ocena == 0) {
				System.out.println("Izabrali ste KRAJ programa. Dovi�enjce.");
				System.exit(0);
			}
			
			// Ispitujemo da li je ocena izme�u 5 i 10.
			else if (ocena > 4 && ocena < 11) {
				ocenaUkupno += ocena;
				predmet++;
			}
			
			// Ako nije ni�ta od prethodnih uslova onda je korisnik zeznuo ocenu.
			else {
				System.out.println("\tGre�ka! Ocena mora da bude 5 - 10.");
				System.out.println("------------------------------------");  
			}
			
			// Ra�unamo prose�nu ocenu.
			ocenaProsek = (double) ocenaUkupno / (predmet - 1);
			
			// Ukoliko je korisnik upisao pogre�nu ocenu kod prve iteracije, ukupna ocena
			// �e biti 0 i prilikom deljenja �emo dobiti vrednost NaN �to treba da ispravimo na 0.
			// (https://www.baeldung.com/java-not-a-number)
			if (ocenaProsek != ocenaProsek) {
				ocenaProsek = 0;
			}
			
			// Ispisujemo rezultat.
			System.out.println("      Ukupan broj predmeta: " + (predmet - 1));
			System.out.printf("Prose�na ocena po predmetu: %.2f\n\n", ocenaProsek);
		} while (true);
	}
}
