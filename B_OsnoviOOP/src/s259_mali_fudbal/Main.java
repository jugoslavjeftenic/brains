package s259_mali_fudbal;

import alati.RADE;

public class Main {

	/*
	 * Program za podr�ku vo�enju evidencije turnira u malom fudbalu.
	 * 
	 * Kada se organizuju amaterski turniri u malom fudbalu, vodi se minimalna
	 * evidencija o igra�ima, timovima i utakmicama. Za timove se bele�e ime tima,
	 * grad odakle dolaze i broj igra�a u timu. Za igra�e se bele�e ime, prezime,
	 * jmbg, ime tima za koji igraju. Za utakmice se bele�e ime prvog tima, ime
	 * drugog tima i rezultata (neodigrana, prviPobedio, drugiPobedio, nere�eno).
	 * 
	 * Realizovati slede�e funkcionalnosti: - u�itavanje podataka o timovima i
	 * igra�ima iz datoteka (timovi.txt, igraci.txt) - dodavanje, brisanje i
	 * pretraga timova (pretraga po imenu) - dodavanje, brisanje i pretraga igra�a
	 * (pretraga po imenu) - dodavanje, brisanje i pretraga utakmica (pretraga po
	 * imenima oba tima) - izra�unavanje i ispis ukupnog fonda takmi�enja i iznosa
	 * nagrada: - ukupan fond takmi�enja je zbir kotizacija timova i igra�a (timovi
	 * 500 dinara, igra�i 100) - 1. nagrada 50% fonda - 2. nagrada 30% fonda - 3.
	 * nagrada 10% fonda - upis podataka o odigranim utakmicama u datoteku
	 * (utakmice.txt)
	 * 
	 * Rad sa spiskovima organizovati u odgovaraju�e klase (ListaTimova, ListaIgraca
	 * i ListaUtakmica). U test klasi stvoriti turnir, u�itati podatke o timovima i
	 * igra�ima i dodati nekoliko odigranih i neodigranih utakmica. Podatke o fondu
	 * i nagradama ispisati na konzoli a podatke o utakmicama u izlaznu datoteku
	 * utakmice.txt.
	 */
	
	// NAPOMENA:
	// Aplikacija je usled priblizavanja roka predaje i nedostatka
	// vremena zbrzana i nije kompletno testirana i napravljena robusno i bez bagova.
	// Izvin'te.
	// Ako cenjenom klijentu bude cesto padao program, dacemo mu popust na sledecu aplikaciju.
	
	public static void main(String[] args) {
		
		String filePath = "src/s259_mali_fudbal/";

		ListaTimova timovi = new ListaTimova(10, 6, 10);
		timovi.generisi();
		timovi.upisi(filePath);
		timovi.ucitaj(filePath);

		ListaIgraca igraci = new ListaIgraca(timovi.getListaTimova());
		igraci.generisi();
		igraci.upisi(filePath);
		igraci.ucitaj(filePath);

		ListaUtakmica utakmice = new ListaUtakmica(timovi.getListaTimova());
		utakmice.setBrojUtakmica(10);
		utakmice.generisi();
		utakmice.upisi(filePath);
		
		Turnir turnir = new Turnir(timovi, igraci, utakmice);
		
		timovi.dodaj("Vetrovi", "Vrbas", 6);
		igraci.generisiPoTimu(timovi.trazi("Vetrovi"));
		timovi.dodaj("Jebivetrovi", "Kula", 7);
		igraci.generisiPoTimu(timovi.trazi("Jebivetrovi"));
		timovi.dodaj("Palalici", "Novi Sad", 3);
		igraci.dodaj("Princeza", "Palalic", RADE.generisiJMBG(), timovi.trazi("Palalici").getImeTima());
		igraci.dodaj("Marina", "Palalic", RADE.generisiJMBG(), timovi.trazi("Palalici").getImeTima());
		igraci.dodaj("Milan", "Palalic", RADE.generisiJMBG(), timovi.trazi("Palalici").getImeTima());
		turnir.izracunajFond();
		
		utakmice.dodaj("Vetrovi", "Jebivetrovi", "neodigrana");
		utakmice.dodaj("Vetrovi", "Palalici");
		utakmice.dodaj("Jebivetrovi", "Palalici", "drugiPobedio");
		utakmice.upisi(filePath);
		
		System.out.println("BRAINS turnir u malom fudbalu");
		System.out.println("  Ukupan fond: " + turnir.getFond());
		System.out.println(" Prva nagrada: " + turnir.getNagrada1());
		System.out.println("Druga nagrada: " + turnir.getNagrada2());
		System.out.println("Treca nagrada: " + turnir.getNagrada3());
		
		System.out.println("\nTimovi:");
		timovi.stampaj();
		System.out.println("\nIgraci:");
		igraci.stampaj();
		System.out.println("\nOdigrane utakmice:");
		utakmice.stampaj();
	}
}
