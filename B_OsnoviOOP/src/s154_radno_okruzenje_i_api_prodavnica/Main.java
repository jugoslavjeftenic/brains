package s154_radno_okruzenje_i_api_prodavnica;

public class Main {

	/*
	 * Napravi�emo apstraktnu klasu koja izdvaja odre�enu realizaciju i interfejs koji modeluje neka pona�anja
	 * Cilj � radno okru�enje kojim vi�ekratno koristimo kod.
	 * Svaka specifi�na aplikacija bi�e vezana samo ugovorom,
	 * nema njenog strogog vezivanja za prilago�ene klase.
	 * 
	 * Sastoji se od:
	 * - Interfejsa Imenovanje, modeluje pona�anja, deo ugovora,
	 * - Apstraktne klase Prodavnica, izdvaja implementaciju, deo ugovora,
	 * - Klase SpisakKlijenata, koju koristimo kroz spajanje i
	 * - Nove realizacije klase Prodavnica za svakog klijenta kroz klase potomke koji je nasle�uju.
	 */
	
	public static void main(String[] args) {

		Poslasticarnica slasticarnica = new Poslasticarnica();
		Picerija picerija = new Picerija();
		
		slasticarnica.postaviIme("Jugoslavija");
		picerija.postaviIme("Bella");
		
		slasticarnica.kupiInventar("Sladoljed");
		picerija.kupiInventar("Pica");
	}
}
