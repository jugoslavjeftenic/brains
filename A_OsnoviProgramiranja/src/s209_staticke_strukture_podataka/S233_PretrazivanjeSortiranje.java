package s209_staticke_strukture_podataka;

public class S233_PretrazivanjeSortiranje {
	
	/*
	 * Sortiranje i pretra�ivanje � zadaci
	 * 1. suma elemenata niza
	 * 2. prose�na vrednost elemata niza
	 * 3. minimalni element niza
	 * 4. maksimalni element niz
	 * 5. pozicija minimalnog elementa niza
	 * 6. pozicija maksimalnog elementa niza
	 * 7. pronala�enje ta�ne pozicije neke zadate vrednosti unutar niza
	 * 8. pronala�enje vrednosti koje zadovoljavaju neki slo�eni kriterijum
	 *    (npr. sve vrednosti manje od nekog broja a ve�e od nekog drugog broja).
	 * 9. sortiranje elemenata niza po nekom kriterijumu
	 *    (od najve�eg ka najmanjem i od najmanjeg ka najve�em).
	 *    
	 * Varirati prethodne zadatke po tipovima podataka (brojevi su sli�ni, ali �ta je sa stringovima?).
	 * Za zadatke 5, 6, 7 implementirati i varijantu kada se �uva pozicija samo jednog elementa
	 * koji zadovljava kriterijum, ali i varijantu kada se �uvaju sve vrednosti koje zadovoljavaju kriterijum.
	 * Zadatke 3 i 5, odnosno 4 i 6 implementirati unutar jednog re�enja.
	 * Na�i optimalno re�enje po pitanju du�ine koda.
	 */
	
	public static void main(String[] args) {
		
		// generisanje niza
		int[] niz = new int[10];
		System.out.print("Generisani niz je: ");
		for(int i = 0; i < niz.length; i++) {
			niz[i] = (int) ((Math.random() * (100 - 1)) + 1);
			System.out.print(niz[i] + " ");
		}
		System.out.println();
		System.out.println();

		// 1. suma elemenata niza
		System.out.println("1. suma elemenata niza");
		int suma = 0;
		for (int i = 0; i < niz.length; i++)
			suma +=niz[i];
		System.out.print("Suma niza je: " + suma);
		System.out.println();
		System.out.println();

		// 2. prose�na vrednost elemata niza
		System.out.println("2. prose�na vrednost elemata niza");
		System.out.print("Prosecna vrednost elemenata niza je: " + (suma / niz.length));
		System.out.println();
		System.out.println();

		// 3. minimalni element niza
		System.out.println("3. minimalni element niza");
		int min = niz[0];
		for (int i = 1; i < niz.length; i++)
			if (min > niz[i])
				min = niz[i];
		System.out.print("Minimalni element niza je: " + min);
		System.out.println();
		System.out.println();
		
		// 4. maksimalni element niz
		System.out.println("4. maksimalni element niz");
		int max = niz[0];
		for (int i = 1; i < niz.length; i++)
			if (max < niz[i])
				max = niz[i];
		System.out.print("Maksimalni element niza je: " + max);
		System.out.println();
		System.out.println();
		
		// 5. pozicija minimalnog elementa niza
		System.out.println("5. pozicija minimalnog elementa niza");
		int idx = 0;
		min = niz[0];
		for (int i = 1; i < niz.length; i++)
			if (min > niz[i]) {
				min = niz[i];
				idx = i;
			}
		System.out.print("Pozicija minimalnog elementa niza je: " + idx);
		System.out.println();
		System.out.println();
		
		// 6. pozicija maksimalnog elementa niza
		System.out.println("6. pozicija maksimalnog elementa niza");
		idx = 0;
		max = niz[0];
		for (int i = 1; i < niz.length; i++)
			if (max < niz[i]) {
				max = niz[i];
				idx = i;
			}
		System.out.print("Pozicija maksimalnog elementa niza je: " + idx);
		System.out.println();
		System.out.println();
		
		// 7. pronala�enje ta�ne pozicije neke zadate vrednosti unutar niza
		System.out.println("7. pronala�enje ta�ne pozicije neke zadate vrednosti unutar niza");
		int trazi = (int) ((Math.random() * (100 - 1)) + 1);
		String pozicija = "";
		idx = 0;
		for (int i = 1; i < niz.length; i++)
			if (trazi == niz[i]) 
				pozicija += i + ", ";
		System.out.print((pozicija == "") ? "Trazena vrednost se ne nalazi unuar niza." :
			"Trazena pozicija zadate vrednosti unutar niza je/su: " + pozicija.substring(0, pozicija.length() - 2) + ".");
		System.out.println();
		System.out.println();
		
		// 8. pronala�enje vrednosti koje zadovoljavaju neki slo�eni kriterijum
		//    (npr. sve vrednosti manje od nekog broja a ve�e od nekog drugog broja).
		System.out.println("8. pronala�enje vrednosti koje zadovoljavaju slo�eni kriterijum");
		min = (int) ((Math.random() * (50 - 1)) + 1);
		max = (int) ((Math.random() * (100 - 50)) + 50);
		String vrednost = "";
		for (int i = 1; i < niz.length; i++)
			if (niz[i] > min && niz[i] < max) 
				vrednost += niz[i] + ", ";
		System.out.println("Vrednosti elemenata se traze u rasponu od " + min + " do " + max);
		System.out.print((vrednost == "") ? "U nizu nema vrednosti u zadatom rasponu." :
			"Trazena pozicija zadate vrednosti unutar niza je/su: " + vrednost.substring(0, vrednost.length() - 2) + ".");
		System.out.println();
		System.out.println();
		
		// 9. sortiranje elemenata niza po nekom kriterijumu
		//    (od najve�eg ka najmanjem i od najmanjeg ka najve�em).
		System.out.println("9. sortiranje elemenata niza po nekom kriterijumu (silazno/uzlazno)");
		int tmp;
		for (int i = 0; i < niz.length; i++) {
			for (int j = i + 1; j < niz.length; j++) {
				if (niz[j] > niz[i]) {
					tmp = niz[i];
					niz[i] = niz[j];
					niz[j] = tmp;
				}
			}
		}
		System.out.print("Sortirano silazno: ");
		for (int broj : niz)
			System.out.print(broj + " ");
		for (int i = 0; i < niz.length; i++) {
			for (int j = i + 1; j < niz.length; j++) {
				if (niz[j] < niz[i]) {
					tmp = niz[i];
					niz[i] = niz[j];
					niz[j] = tmp;
				}
			}
		}
		System.out.println();
		System.out.print("Sortirano uzlazno: ");
		for (int broj : niz)
			System.out.print(broj + " ");
		System.out.println();
		System.out.println();
	}
}
