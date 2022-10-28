package s169_upravljacke_strukture;

import alati.TextIO;

public class S207_Z3_NajmanjiBrojUSekvenci {

	public static void main(String[] args) {
		
		/*
		 * Napisati program koji odre�uje koji je broj najmanji u sekvenci 
		 * od N brojeva. Korisnik unosi N, a zatim brojeve (-10..100). 
		 */
		
		/*
		 * NAPOMENA. Po�to je ovaj zadatak postavljen pre lekcije o nizovima
		 * ili nisam shvatio zadatak ili ne znam da gi re�im bez niza.
		 */
		
		// Od korisnika tra�imo koliko brojeva ide u sekvencu.
		System.out.println("Upi�ite du�inu sekvence (preporu�ena du�ina do 10 brojeva): ");
		int n = TextIO.getlnInt();
		
		// Upisanu vrednost koristimo za dimenzionisanje niza.
		// Ako je korisnik upisao 10 onda je niz du�ine 10 "new int[10]".
		int[] sekvenca = new int[n];
		
		// Deklari�emo promenljivu za �uvanje najmanjeg broja i inicijalizujemo je.
		// U ovom slu�aju nije bitno sa kojim brojem je inicijalizujemo, bitno je da
		// dodelimo bilo koju int vrednost, ina�e nam kompajler prijavljuje gre�ku:
		// "The local variable min may not have been initialized".
		int min = 0;
		
		// Po�to unapred znamo koliko puta �e se vrteti petlja,
		// najjednostavnije je uraditi sa for petljom (ali mo�e i sa "while" i "do").
		// Po�to promenljivu "i" koristimo samo na nivou petlje a ne celog programa,
		// mo�emo je deklarisati u samoj for petlji i taj "i" se ne�e mo�i koristiti van petlje.
		System.out.println("Upi�ite �eljene vrednosti sekvence u rasponu od -10 do 100");
		for (int i = 0; i < sekvenca.length; i++) {
			// Unutar for pravimo "do" petlju gde tra�imo unos i ispitujemo
			// da li je uneti broj u okviru predefinisanih vrednosti.
			do {
				// Prilikom ispisa na "i" dodajemo 1 po�to nam indeks polazi od nule.
				System.out.print((i + 1) + ": ");
				sekvenca[i] = TextIO.getlnInt();
				
				// Sjebemo korisnika za pogre�nu vrednost.
				if (sekvenca[i] < -10 || sekvenca[i] > 100)
					System.out.println("\tPa�nja! Vrednost mora da bude -10 do 100.");
				
			} while (sekvenca[i] < -10 || sekvenca[i] > 100);
			
			// Po�to smo prilikom inicijalizacije "min" promenljive odvalili vrednost zbog
			// kompajlera, sada joj dodeljujemo korisnu vrednost, a to je prvi broj u
			// sekvenci (nizu).
			if (i == 0)
				min = sekvenca[i];
			
			// Potom ispitujemo da li je zapam�ena minimalna vrednost ve�a od vrednosti
			// na kojoj nam se nalazi sekvenca i ako jeste, dodeljujemo joj vrednost sekvence.
			else if (min > sekvenca[i])
				min = sekvenca[i];
		}
		
		// Po izlasku iz for petlje koja je protr�ala kroz sekvencu i na�la najmanji broj
		// pravimo novu for petlju koja ispisuje unetu sekvencu.
		System.out.print("Upisali ste sekvencu: ");
		for (int i = 0; i < sekvenca.length; i++) {
			System.out.print(sekvenca[i]);
			
			// Ispitujemo da li smo na kraju sekvence da vidimo da li da pi�emo zarez iza broja.
			// Pitamo da li NIJE("i" jednako du�ini sekvence od �ije du�ine oduzimamo 1).
			// 1 oduzimamo da bi vrednost du�ine sekvence uskladili sa indeksom sekvence koji
			// po�inje od nule.
			if (!(i == sekvenca.length - 1)) {
				System.out.print(", ");
			}
		}
		
		// Ispisujemo minimalnu vrednost
		System.out.println("\nNajmanji broj u upisanoj sekvenci je: " + min);
	}
}
