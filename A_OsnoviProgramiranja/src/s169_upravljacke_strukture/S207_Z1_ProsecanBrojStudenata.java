package s169_upravljacke_strukture;

import alati.TextIO;

public class S207_Z1_ProsecanBrojStudenata {

	public static void main(String[] args) {
		
		/*
		 * ZADATAK:
		 * Napisati program koji odre�uje prose�an broj studenata na godini. 
		 * Korisnik unosi studente po smerovima sve dok ne unese vrednost 0. 
		 * Broj studenata na smeru je u intervalu 1..160. 
		 */
		
		/*
		 * RE�ENJE:
		 * Prose�an broj studenata na svim smerovima dobijamo tako �to saberemo
		 * ukupan broj studenata na svim smerovima i podelimo sa brojem smerova
		 */
		
		
		// Deklari�emo promenljivu za brojanje smerova i dodeljujemo vrednost 1
		// po�to mora da bude najmanje jedan smer da bi se mogao uneti broj studenata
		int brojSmerova = 1;
		
		
		// Deklari�emo promenljivu za broj studenata po smeru i za ukupan broj studenata
		int brojStudenata, ukupnoStudenata = 0;
		
		
		// Deklari�emo promenljivu za prose�an broj studenata
		double prosecanBroj = 0;

		
		// Glavna petlja radi dokle god korisnik za broj studenata unosi vrednost ve�u od 0
		// Uslov se proverava na kraju petlje (linija 84)
		do {
			
			// Korisnik unosi broj studenata po smeru
			System.out.println
				("Unestite broj studenata za smer " + brojSmerova + " (min.1 - max.160, izlaz: 0)?");
			brojStudenata = TextIO.getlnInt();
			
			
			// Ukoliko korisnik upi�e vi�e od 160 studenata preska�emo unos i sabiranje
			if (brojStudenata > 160) {
				System.out.println("Maksimalan br. studenata po smeru mo�e biti 160.");
			}
			
			
			// U prethodnom koraku smo eliminisali prevelik broj a sada proveravamo
			// da li je upisao vi�e od 0 studenata, i ako jeste, sabiramo studente
			// sada�njeg smera sa ukupnim brojem kromp... pardon, studenata.
			else if (brojStudenata > 0) {
				ukupnoStudenata += brojStudenata;
				brojSmerova++;
			}
			
			
			// Zadatak ka�e da bi trebalo ispitati da li je korisnik upisao 0 za izlaz
			// �to ovde nije ura�eno nego izlazimo ako je 0 ili manje. Za ispitivanje
			// ispravnih vrednosti upisa bi od linije 38 pa do ovde trebalo ubaciti
			// u do while petlju i u njoj vrteti korisnika dok ne unese ispravne
			// vrednosti ili 0 �to u ovom slu�aju nije ura�eno zbog lenjosti programera.
			
			
			// Prose�an broj ra�unamo tako �to ukupno studente podelimo sa smerovima
			// U prethodnom koraku smo broj smerova pove�ali za jedan po�to o�ekujemo
			// novi unos a sada mu oduzimamo tu kredu jer je korisnik upisao 0.
			// Rezultat mno�imo sa 1.0 da nam ne odse�e decimale.
			prosecanBroj = 1.0 * ukupnoStudenata / (brojSmerova - 1);
			
			// Alternativno:
			// Problem sa odsecanjem decimala mo�emo re�iti i "kastovanjem"
			// jednog primitivnog tipa (int) u drugi (double).
			// (https://www.w3schools.com/java/java_type_casting.asp)
			// npr. u ovom slu�aju:
			// prosecanBroj = (double) ukupnoStudenata / (brojSmerova - 1);
			
			
			// Ispisujemo rezultate
			System.out.println("             Ukupan broj smerova je: " + (brojSmerova - 1));
			System.out.println("           Ukupan broj studenata je: " + ukupnoStudenata);
			System.out.printf("Prose�an broj studenata po smeru je: %.2f\n", prosecanBroj);

		} while (brojStudenata > 0);
		// Ispitujemo da li je une�eni broj studenata ve�i od 0 i ako jeste
		// petlja dubija "true" vrednost i idemo Jovo nanovo (https://vukajlija.com/jovo-nanovo).
		
		System.out.println();
		System.out.println("KRAJ");

	}

}
