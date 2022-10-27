package s209_staticke_strukture_podataka;

import alati.TextIO;

public class S232_Z1_ParNepar {

	public static void main(String[] args) {
		
		/*
		 * ZADATAK 1, strana232.
		 * Dat je niz X od maksimalno 12 celobrojnih elemenata. U�itati n 
		 * elemenata u niz X i formirati nizove A i B, pri �emu su elementi niza A 
		 * parni elementi niza X, a elementi niza B su neparni elementi niza X. 
		 */
		
		/*
		 * RE�ENJE ZADATKA.
		 * Zadatak je retroaktivno ura�en sa upotrebom matrica i podprograma.
		 * Umesto niza X, A i B je upotrebljena matrica X.
		 * Umesto da korisnik unosi vrednosti niza koristi se funkcija za nasumi�no
		 * generisanje vrednosti elemenata.
		 */

		
		// Deklari�emo matricu X sa 3 vrste i pozivamo potprogram "duzinaNiza"
		// za odre�ivanje broja kolona matrice
		int[][] x = new int[3][duzinaNiza()];
		
		
		// Nakon dimenzionisanja matrice pozivamo potprogram za inicijalizaciju matrice.
		// Potprogramu prosle�ujemo kompletnu matricu.
		popuniMatricu(x);
		
		
		// Pozivamo potprogram za izdvajanje parnih i neparnih vrednosti iz prethodno
		// popunjenog niza.
		// Potprogramu prosle�ujemo kompletnu matricu X.
		// Potprogram referentno popunjava vrstu 1 i 2 matrice X sa odgovaraju�im vrednostima.
		// Potprogram vra�a celobrojni niz u koji upisuje najve�e indekse prve i druge vrste
		// koji sadr�e korisnu vrednost.
		// (https://www.geeksforgeeks.org/returning-multiple-values-in-java/)
		int[] parNepar = izdvojiParNepar(x);
		
		
		// Poziva se potprogram za ispis rezultata.
		// Potprogramu se prosle�uje kompletna matrica X i
		// najve�i indeksi prve i druge vrste matrice X.
		ispisiMatricu(x, parNepar[0], parNepar[1]);
		
		
		// Pozivamo potprogram za ipis poruke o zavr�etku programa.
		kraj();
		
	}
	
	
	// Potprogram (funkcija) koja korisnika pita koliko �eli da mu bude duga�ak
	// niz brojeva i vra�a celobrojnu vrednost. Potprogram vr�i proveru unosa vrednosti.
	static int duzinaNiza() {
		
		int duzina;
		
		System.out.println("Koliko celobrojnih vrednosti �elite da mrRobot generi�e (maks 12)?");
		System.out.println("(brojevi �e biti generisani u rasponu od -100 do 100)");
		
		do {
			duzina = TextIO.getlnInt();
			if (duzina < 1 || duzina > 12) {
				System.out.println("GRE�KA! Vrednost mora da bude u rasponu 1 - 12.");
			}
		} while (duzina < 1 || duzina > 12);
		
		return duzina;
	}
	
	
	// Potprogram (metoda) za popunu matrice.
	// U potprogram se iz roditeljske rutine prosle�uje dimenzionisana matrica.
	// Potprogram prilikom prolaska kroz svaki element poziva potprogram mrRobot
	// za nasumi�no generisanje celih brojeva.
	// Potprogram nema povratnu vrednost nego referentno popunjava matricu.
	static void popuniMatricu(int matrica[][]) {
		
		for(int i = 0; i < matrica[0].length; i++) {
			matrica[0][i] = mrRobot(-100, 100);
		}
	}
	

	// Potprogram za nasumi�no generisanje celih brojeva.
	// U potprogram se prosle�uju minimalna i maksimalna vrednost nasumi�nog broja.
	// Potprogram vra�a generisanu vrednost.
	// (https://www.baeldung.com/java-generating-random-numbers-in-range)
	static int mrRobot(int min, int max) {
		
		return (int) ((Math.random() * (max - min)) + min);
	}
	
	
	// Potprogram referentno popunjava drugu i tre�u vrstu matrice X sa filtriranim vrednostima.
	// Za filtriranje parnih i ne parnih vrednosti se koristi "Modulo operator" koji
	// proverava postojanje ostatka delenja celobrojne vrednosti sa 2.
	// (https://www.baeldung.com/modulo-java)
	// Potprogram vra�a niz u kojem �e se roditeljskoj rutini vratiti
	// najve�i indeksi prve i druge vrste matrice X koji sadr�e korisnu vrednost.
	static int[] izdvojiParNepar(int matrica[][]) {
		
		int brojac[] = {0, 0};
		
		for (int i = 0; i < matrica[0].length; i++) {
			if (matrica[0][i] % 2 == 0) {
				matrica[1][brojac[0]] = matrica[0][i];
				brojac[0]++;
			}
			else {
				matrica[2][brojac[1]] = matrica[0][i];
				brojac[1]++;
			}
		}

		return brojac;
	}
	
	
	// Potprogram za ispis matrice.
	// Potprogram prihvata popunjenu matricu i najve�e indekse prve i druge vrste
	// matrice X koji sadr�e korisnu vrednost.
	// Potprogram vr�i ispis na konzolu i nema povratnu vrednost.
	static void ispisiMatricu(int matrica[][], int par, int nepar) {
		
		for (int i = 0; i < matrica.length; i++) {

			switch (i) {
			case 0:
				System.out.print("        Generisani niz je: ");
				for (int j = 0; j < matrica[i].length; j++) {
					System.out.print(matrica[i][j] + " ");
				}
				break;
			case 1:
				System.out.print("  Parni brojevi u nizu su: ");
				for (int j = 0; j < par; j++) {
					System.out.print(matrica[i][j] + " ");
				}
				break;
			case 2:
				System.out.print("Neparni brojevi u nizu su: ");
				for (int j = 0; j < nepar; j++) {
					System.out.print(matrica[i][j] + " ");
				}
				break;
			}
			
			System.out.println();
		}
	}
	
	
	// Potprogram za ispis poruke o zavr�etku programa.
	static void kraj() {
		
		System.out.println("--------------");
		System.out.println("KRAJ programa.");
	}
}
