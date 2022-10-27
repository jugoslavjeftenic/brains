package s109_slaganje;

public class Ucionica {

	/*
	 * Osmisliti, nacrtati dijagrame klasa i realizovati u Javi klase
	 * Institucija, Ucionica, Zaposleni (koja nasle�uje klasu Osoba) i Racunar
	 * koje bi se mogle koristiti u programu za evidenciju zaposlenih i inventara neke obrazovne institucije.
	 * Spiskove u�ionica, zaposlenih i ra�unara po u�ionicama �uvati u odgovaraju�im nizovima
	 * (svaki sa najvi�e 20 �lanova).
	 * 
	 * U kojim me�usobnim odnosima se nalaze pomenute klase (nasle�ivanje, asocijacija, agregacija, kompozicija)?
	 * 
	 * Klase testirati kreiranjem objekata u glavnom programu i pozivanjem izabranih metoda.
	 * Nacrtati UML dijagram klasa re�enja.
	 */

	private int brojRacunara;
	
	public Ucionica() {}

	public Ucionica(int brojRacunara) {
		this.brojRacunara = brojRacunara;
	}

	public int getBrojRacunara() {
		return brojRacunara;
	}

	public void setBrojRacunara(int brojRacunara) {
		this.brojRacunara = brojRacunara;
	}
}
