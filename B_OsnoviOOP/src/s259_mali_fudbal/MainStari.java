package s259_mali_fudbal;

public class MainStari {

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
	
	/*
	 * https://www.igremladih.co.rs/bs/sportovi/mali-nogomet-fudbal
	 */
	
	public static void main(String[] args) {

		String filePath = "src/s259_mali_fudbal/";

		System.out.println("PAZNJA! Zadatak nije kompletno uradjen. Pokretati na sopstvenu odgovornost.");
		System.out.println("---------------------------------------------------");
		
		ListaTimova timovi = new ListaTimova();
//		timovi.listaGenerisi(filePath);
		timovi.ucitaj(filePath);
		timovi.dodaj("Klosari", "Subotica", 8);
		timovi.dodaj("Vetrovi", "Vrbas", 6);
		timovi.dodaj("Oliva", "Malta", 6);
		timovi.stampaj();
		System.out.println("---------------------------------------------------");
		timovi.brisi("Klosari");
		timovi.stampaj();
		System.out.println("---------------------------------------------------");
		System.out.println((timovi.trazi("Vetrovi") != null) ? "Tim Vetrovi je pronadjen." : "Tim Vetrovi nije pronadjen.");
		System.out.println((timovi.trazi("Jebivetrovi") != null) ? "Tim Jebivetrovi je pronadjen." : "Tim Jebivetrovi nije pronadjen.");
		System.out.println("---------------------------------------------------");
		
		ListaIgraca igraci = new ListaIgraca(timovi.getListaTimova());
//		igraci.listaGenerisi(filePath);
		igraci.ucitaj(filePath);
		igraci.dodaj("Pera", "Zdera", "1234567890123", "Oliva");
		igraci.dodaj("Zdera", "Bandera", "1234567890123", "Oliva");
//		igraci.stampajIgrace();
//		System.out.println("---------------------------------------------------");
		igraci.brisi("Zdera");
		igraci.stampaj();
		System.out.println("---------------------------------------------------");
		System.out.println((igraci.trazi("Pera") != null) ? "Igrac Pera je pronadjen." : "Igrac Pera nije pronadjen.");
		System.out.println("---------------------------------------------------");
		
		ListaUtakmica utakmice = new ListaUtakmica(20, timovi.getListaTimova());
//		utakmice.listaGenerisi(filePath);
		utakmice.ucitaj(filePath);
		utakmice.stampaj();
		System.out.println("---------------------------------------------------");
		utakmice.dodaj("Vetrovi", "Jebivetrovi");
		utakmice.dodaj("Oliva", "Vetrovi", "neki pogresan rezultat posto nema kontrole");
		utakmice.stampaj();
		System.out.println(utakmice.trazi("Vetrovi", "Jebivetrovi"));
		System.out.println("---------------------------------------------------");
		utakmice.brisi("Oliva", "Vetrovi");
		utakmice.stampaj();
		System.out.println("---------------------------------------------------");
		System.out.println("PAZNJA! Zadatak nije kompletno uradjen. Pokretati na sopstvenu odgovornost.");
	}
}
