package s235_potprogrami;

import alati.TextIO;

public class S266_EvidencijaOsiguranja {
	
	/*
	 * Evidencija prodaje osiguranja orgranizovana je u 5 kategorija i bele�i se za
	 * svaki dan u mesecu (pretpostaviti da ih je 30).
	 * � Program treba da omogu�i:
	 * � Unos ostvarenog prihoda za zadatu kategoriju osiguranja i dan u mesecu.
	 * � Izmenu ostvarenog prihoda za zadatu kategoriju osiguranja i dan u mesecu.
	 * � Prikaz rezultata sortiran po kategorijama osiguranja za izabrani dan u mesecu.
	 * � Prikaz rezultata sortiran po danima u mesecu za izabranu kategoriju.
	 * � Izra�unavanje i prikaz dana kad je ostvaren najmanji prihod i koliko on iznosi.
	 * � Izra�unavanje i prikaz ukupnog mese�nog prihod za svaku kategoriju osiguranja.
	 * � Izra�unavanje i prikaz prose�nog mese�nog prihoda.
	 * � Meni iz kojeg se biraju ponu�ene funkcije.
	 * � Obavezno koristiti funkcije za implementaciju tra�enih funkcionalnosti.
	 * � Izabrati korektne tipove podataka i strukture podataka i
	 * ograni�iti unos tako da nije mogu�e uneti neispravne vrednosti.
	 */
	
	/*
	 * RE�ENJE
	 * - opcije menija se �uvaju u nizu
	 * - dodata opcija prikaza vrednosti svih elemenata u matrici
	 * - unos i izmena spojeni u jedan meni
	 * 
	 * - ve�ina ispisa se radi pomo�u printf metode
	 *   (https://www.baeldung.com/java-printstream-printf)
	 */
	
	public static void main(String[] args) {
		
		// Dimenzioni�e se matrica za �uvanje vrednosti.
		double[][] evidencija = new double[30][5];
		// Dimenzioni�e se i inicijalizuje niz za �uvanje opcija menija.
		String[] meni = new String[8];
		meni[0] = "KRAJ programa.";
		meni[1] = "Unos ili izmena ostvarenog prihoda za �eljenu kategoriju i �eljeni dan.";
		meni[2] = "Prikaz prihoda za sve kategorije i dane.";
		meni[3] = "Prikaz prihoda za izabrani dan.";
		meni[4] = "Prikaz prihoda za izabranu kategoriju.";
		meni[5] = "Prikaz dana sa najmanjim ostvarenim prihodom.";
		meni[6] = "Prikaz ukupnog mese�nog prihoda po kategorijama.";
		meni[7] = "Prikaz ukupnog i prose�nog mese�nog prihoda.";
		// Glavni meni se dr�i u beskona�noj petlji dokle god korisnik ne izabere
		// opciju za zavr�etak programa.
		do {
			// Ispituje se korisnikov izbor menija i poziva se odgovaraju�i potprogram.
			// Switch u izrazu poziva potprogram za izbor i proveru izbora menija.
			// Potprogramu za izbor menija se prosle�uje niz stringova sa opcijama menija i
			// minimalna i maksimalna vrednost menija.
			// (https://www.w3schools.com/java/java_switch.asp)
			switch (meniIzbor(meni, 0, meni.length - 1)) {
			case 0:
				// Poziva se potprogram za terminaciju programa.
				kraj();
			case 1:
				// Poziva se potprogram za unos/izmenu vrednosti elemenata.
				unos(evidencija);
				break;
			case 2:
				// Poziva se potprogram za prikaz vrednosti svih elemenata matrice.
				ispis(evidencija);
				break;
			case 3:
				// Poziva se potprogram za ispis svih kategorija za izabrani dan.
				ispisPrihodaPoDanu(evidencija);
				break;
			case 4:
				// Poziva se potprogram za ispis svih dana za izabranu kategoriju.
				ispisPrihodaPoKategoriji(evidencija);
				break;
			case 5:
				// Poziva se potprogram za ispis dana sa najmanjim ostvarenim prihodom.
				ispisNajmanjegPrihodaZaDan(evidencija);
				break;
			case 6:
				// Poziva se potprogram za prikaz ukupnog mese�nog prihoda po kategorijama.
				ispisUkupnoPoKategorijama(evidencija);
				break;
			case 7:
				// Poziva se potprogram za prikaz ukupnog i prose�nog mese�nog prihoda.
				ispisUkupanIProsecanPrihod(evidencija);
				break;
			}
		} while (true);
	}
	
	// Potprogram za prikaz ukupnog i prose�nog mese�nog prihoda.
	static void ispisUkupanIProsecanPrihod(double[][] matrica) {
		double suma = 0;
		// Sabiramo vrednosti svih elemenata u matrici.
		for (int i = 0; i < matrica.length; i++)
			for (int j = 0; j < matrica[i].length; j++)
				suma += matrica[i][j];
		// Ispisujemo rezultat
		System.out.print(String.format("%65s\n", "-").replace(' ', '-'));
		System.out.println();
		System.out.printf("  Ukupan mese�ni prihod je: %.2f.\n", suma);
		System.out.printf("Prose�an mese�ni prihod je: %.2f.\n", suma / 150);
		System.out.print(String.format("%65s\n", "-").replace(' ', '-'));
	}
	
	// Potprogram za prikaz ukupnog mese�nog prihoda po kategorijama.
	static void ispisUkupnoPoKategorijama(double[][] matrica) {
		double[] sumaKategorija = new double[matrica[0].length];
		int sirinaKolone, sirinaKoloneMaks = 0;
		// Ra�unamo sumu prihoda po kategorijama i rezultate upisujemo u privremeni niz.
		for (int i = 0; i < matrica[0].length; i++) {
			for (int j = 0; j < matrica.length; j++) {
				sumaKategorija[i] += matrica[j][i];
			}
			// Ra�unamo maksimalnu �irinu kolone.
			sirinaKolone = Integer.toString((int) sumaKategorija[i]).length();
			if (sirinaKoloneMaks < sirinaKolone)
				sirinaKoloneMaks = sirinaKolone;
		}
		sirinaKolone = sirinaKoloneMaks + 3;
		// Formiramo ispis zaglavlja tabele sa potrebnim �irinama kolona.
		System.out.println();
		System.out.print(String.format("%" + ((sirinaKolone + 1) * 5) + "s\n", "-").replace(' ', '-'));
		System.out.println("Prikaz ukupnog mese�nog prihoda po kategorijama.");
		System.out.println();
		System.out.println(" Kategorije...");
		for (int i = 0; i < sumaKategorija.length; i++) {
			System.out.printf("%" + sirinaKolone + "s|", i + 1);
		}
		System.out.println();
		for (int i = 0; i < sumaKategorija.length; i++)
			System.out.printf("%" + sirinaKolone + ".2f|", sumaKategorija[i]);
		System.out.println();
		// Formiramo ispis futera.
		System.out.print(String.format("%" + ((sirinaKolone + 1) * 5) + "s\n", "-").replace(' ', '-'));
	}
	
	// Potprogram za ispis dana sa najmanjim prihodom.
	static void ispisNajmanjegPrihodaZaDan(double[][] matrica) {
		// Inicijalizujemo promenljive potrebne za nala�enje najmanje sume po danu.
		// sumaDan pamti ukupan dnevni iznos.
		// sumaMin pamti minimalni mese�ni iznos i poredi da li je manja od sumaDan.
		// indxMinDan pamti indeks vrste za minimalni mese�ni iznos.
		double sumaDan = 0, sumaMin = 0;
		int indxMinDan = 0;
		// Sabiramo prihode za prvi dan i upisujemo ih kao minimalne.
		for (int i = 0; i < matrica[0].length; i++) {
			sumaMin += matrica[0][i];
		}
		// Sabiramo prihode za sve dane po danu i poredimo sa ve� upisanim minimalnim prihodom.
		for (int i = 1; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				sumaDan += matrica[i][j];
			}
			// Ukoliko je dnevni prihod manji od zapam�enog minimalnog prihoda,
			// dnevni prihod postaje minimalni prihod i pamtimo indeks dana.
			if (sumaMin > sumaDan) {
				sumaMin = sumaDan;
				indxMinDan = i;
			}
			// Nuliramo dnevnu sumu.
			sumaDan = 0;
		}
		// Ispisujemo rezultat
		System.out.print(String.format("%65s\n", "-").replace(' ', '-'));
		System.out.println();
		System.out.printf("Najmanji prihod (%.2f) je ostvaren na dan: %d.\n", sumaMin, indxMinDan + 1);
		System.out.print(String.format("%65s\n", "-").replace(' ', '-'));
	}
	
	// Potprogram za ispis svih dana za izabranu kategoriju.
	static void ispisPrihodaPoKategoriji(double[][] matrica) {
		int kategorija = 0;
		// Korisnik upisuje kolonu matrice.
		do {
			System.out.println();
			System.out.println("Za koju kategoriju �elite da izlistate prihode (1 - 5)?");
			kategorija = TextIO.getlnInt();
			if (kategorija < 1 || kategorija > 5)
				System.out.println("Izabrali ste pogre�nu kategoriju!");
		} while (kategorija < 1 || kategorija > 5);
		// Pozivamo potprogram za proveru maksimalne �irine kolone i pamtimo vrednost.
		int sirinaKolone = maksSirinaKolone(matrica);
		// Formiramo ispis zaglavlja tabele sa potrebnim �irinama kolona.
		System.out.println();
		System.out.print(String.format("%65s\n", "-").replace(' ', '-'));
		System.out.println("Prikaz prihoda po danima za kategoriju " + kategorija + ".\n");
		System.out.println("Dani| Prihodi");
		// Formiramo ispis vrednosti svih dana za izabranu kategoriju.
		for (int i = 0; i < matrica.length; i++) {
			System.out.printf("  %2d| ", i + 1);
			System.out.printf("%" + sirinaKolone + ".2f\n", matrica[i][kategorija - 1]);
		}
		// Formiramo ispis futera.
		System.out.print(String.format("%65s\n", "-").replace(' ', '-'));
	}
	
	// Potprogram za ispis svih kategorija za izabrani dan.
	static void ispisPrihodaPoDanu(double[][] matrica) {
		int dan = 0;
		// Korisnik upisuje vrstu matrice.
		do {
			System.out.println();
			System.out.println("Za koji dan �elite da ispi�ete prihode (1 - 30)?");
			dan = TextIO.getlnInt();
			if (dan < 1 || dan > 30)
				System.out.println("Izabrali ste pogre�an dan!\n");
		} while (dan < 1 || dan > 30);
		// Pozivamo potprogram za proveru maksimalne �irine kolone i pamtimo vrednost.
		int sirinaKolone = maksSirinaKolone(matrica);
		// Formiramo ispis zaglavlja tabele sa potrebnim �irinama kolona.
		System.out.println();
		System.out.print(String.format("%" + (6 + ((sirinaKolone + 1) * 5)) + "s\n", "-").replace(' ', '-'));
		System.out.println("Prikaz prihoda po kategorijama za dan " + dan + ".\n");
		System.out.println(" Dan  Kategorije...");
		System.out.print("      ");
		for (int i = 0; i < matrica[0].length; i++) {
			System.out.printf("%" + sirinaKolone + "s|", i + 1);
		}
		System.out.println();
		// Formiramo izabrane vrste svih kategorija matrice sa zaglavljem vrste
		System.out.printf("  %2d| ", dan);
		for (int i = 0; i < matrica[dan - 1].length; i++)
			System.out.printf("%" + sirinaKolone + ".2f|", matrica[dan - 1][i]);
		System.out.printf("\n");
		// Formiramo ispis futera.
		System.out.print(String.format("%" + (6 + ((sirinaKolone + 1) * 5)) + "s\n", "-").replace(' ', '-'));
	}
	
	// Potprogram za ispis svih elemenata matrice.
	static void ispis(double[][] matrica) {
		// Pozivamo potprogram za proveru maksimalne �irine kolone i pamtimo vrednost.
		int sirinaKolone = maksSirinaKolone(matrica);
		// Formiramo ispis zaglavlja tabele sa potrebnim �irinama kolona.
		System.out.println();
		System.out.print(String.format("%" + (6 + ((sirinaKolone + 1) * 5)) + "s\n", "-").replace(' ', '-'));
		System.out.println("Prikaz prihoda za sve kategorije i dane.");
		System.out.println();
		System.out.println("Dani  Kategorije...");
		System.out.print("      ");
		for (int i = 0; i < matrica[0].length; i++) {
			System.out.printf("%" + sirinaKolone + "s|", i + 1);
		}
		System.out.println();
		// Formiramo ispis vrednosti svih elemenata matrice sa zaglavljem vrste
		for (int i = 0; i < matrica.length; i++) {
			System.out.printf("  %2d| ", i + 1);
			for (int j = 0; j < matrica[i].length; j++)
				System.out.printf("%" + sirinaKolone + ".2f|", matrica[i][j]);
			System.out.printf("\n");
		}
		// Formiramo ispis futera.
		System.out.print(String.format("%" + (6 + ((sirinaKolone + 1) * 5)) + "s\n", "-").replace(' ', '-'));
	}

	// Potprogram za proveru maksimalne �irine kolone.
	static int maksSirinaKolone(double[][] matrica) {
		// Vrednost elementa matrice "prelivamo" u ceo broj da bi izgubili decimalu.
		// Ceo broj konvertujemo u string i du�inu stringa zapisujemo kao celobrojnu
		// vrednost koju �emo u petlji porediti sa stringnim du�inama svih elemenata
		// matrice i najve�u vrednost pamtiti u promenljivoj sirina.
		// Na povratnu vrednost dodajemo 3 za ta�ku i dve decimale.
		int sirina = Integer.toString((int) matrica[0][0]).length();
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				if (sirina < Integer.toString((int) matrica[i][j]).length())
					sirina = Integer.toString((int) matrica[i][j]).length();
			}
		}
		return sirina + 3;
	}
	
	// Potprogram za unos/izmenu vrednosti elemenata.
	static void unos(double[][] matrica) {
		// Pitamo korisnika da li �eli da program popuni kompletnu matricu.
		System.out.print(String.format("%65s\n", "-").replace(' ', '-'));
		System.out.println("Da li �elite da mrRobot popuni kompletnu tabelu umesto Vas (y/n)?");
		System.out.println("Svi elementi �e biti popunjeni sa vrednostima od 0 do 10.000.");
		System.out.println("PA�NJA! Prethodno unete vrednosti �e biti prepisane. PA�NJA!");
		boolean generisi = TextIO.getlnBoolean();
		// Ukoliko korisnik �eli da program popuni matricu prolazimo kroz celu matricu i
		// za svaki element pozivamo potprogram za generisanje slu�ajnih projeva kome
		// prosle�ujemo parametre minimalne i maksimalne vrednosti slu�ajnog broja.
		if (generisi) {
			for (int i =0; i < matrica.length; i++)
				for (int j = 0; j < matrica[i].length; j++)
					matrica[i][j] = mrRobot(0, 10000);
			System.out.println("mrRobot je popunio kompletnu tabelu.");
		}
		// U drugom slu�aju ulazimo u seriju pitanja i provera za unos nove vrednosti
		// pojedina�nih elementa matrice.
		else {
			boolean izlaz = false;
			do {
				int dan = 0, kategorija = 0;
				// Korisnik upisuje kolonu matrice.
				do {
					System.out.println("Za koju kategoriju �elite da upi�ete/izmenite vrednost (1 - 5)?");
					kategorija = TextIO.getlnInt();
					if (kategorija < 1 || kategorija > 5)
						System.out.println("Izabrali ste pogre�nu kategoriju!\n");
				} while (kategorija < 1 || kategorija > 5);
				// Korisnik upisuje vrstu matrice.
				do {
					System.out.println("Za koji dan kategorije " + kategorija + " �elite da upi�ete/izmenite vrednost (1 - 30)?");
					dan = TextIO.getlnInt();
					if (dan < 1 || dan > 30)
						System.out.println("Izabrali ste pogre�an dan!\n");
				} while (dan < 1 || dan > 30);
				// Ispisujemo sada�nju vrednost elementa i tra�imo unos nove vrednosti.
				System.out.printf("Sada�nja vrednost kategorije %s na dan %s je: %.2f\n", kategorija, dan, matrica[dan - 1][kategorija - 1]);
				System.out.println("Upi�ite novu vrednost:");
				matrica[dan - 1][kategorija - 1] = TextIO.getlnDouble();
				// Pitamo korisnika da li je zavr�io sa unosom i izlazimo iz petlje ukoliko jeste.
				System.out.println("Da li ste zavr�ili sa unosom/izmenom (y/n)?");
				izlaz = TextIO.getlnBoolean();
			} while (!izlaz);
		}
		System.out.print(String.format("%65s\n", "-").replace(' ', '-'));
	}

	// Potprogram za generisanje brojeva.
	static double mrRobot(double min, double max) {
		// U potprogram se prosle�uju minimalna i maksimalna vrednost nasumi�nog broja.
		// Potprogram vra�a generisanu vrednost.
		// (https://www.baeldung.com/java-generating-random-numbers-in-range)
		return ((Math.random() * (max - min)) + min);
	}
	
	// Potprogram za unos i proveru vrednosti izbora menija.
	static int meniIzbor(String[] meni, int donja, int gornja) {
		// Poziva se potprogram za ispis menija.
		// Kao parametar se prosle�uje niz stringova sa opcijama menija.
		meniPrikaz(meni);
		int izbor = 0;
		do {
			System.out.printf("\nIzaberite opciju (%s - %s):", donja, gornja);
			izbor = TextIO.getlnInt();
			if ((izbor < donja) || (izbor > gornja)) {
				System.out.println("Pa�nja! Izabrali ste pogre�nu opciju.");
			}
		} while ((izbor < donja) || (izbor > gornja));
		return izbor;
	}
	
	// Potprogram za ispis menija.
	static void meniPrikaz(String[] meni) {
		System.out.println();
		System.out.println("Dobrodo�li u program za vo�enje evidencije prihoda osiguranja.");
		System.out.println("Molim Vas da izaberete jednu od ponu�enih opcija:");
		System.out.println();
		// Petlja ispisuje niz sa stringovima opcija menija od indeksa 1 do kraja niza.
		// String na indeksnoj poziciji 0 je rezervisan za opciju KRAj i prikazuje se poslednji.
		for (int i = 1; i < meni.length; i++)
			System.out.printf("\t%d: %s\n", i, meni[i]);
		System.out.printf("\t0: %s\n", meni[0]);
	}
	
	// Potprogram za terminaciju programa i ispis poruke o zavr�etku programa.
	static void kraj() {
		// Za ispis linije formiramo string sa potrebnim brojem praznih karaktera i
		// prazne karaktere zamenjujemo karakterima za ispis linije.
		// (https://stackoverflow.com/questions/9997767/change-the-default-padding-character-in-java-printf)
		System.out.print(String.format("%65s\n", "-").replace(' ', '-'));
		System.out.println("KRAJ programa.");
		System.exit(0);
	}
}
