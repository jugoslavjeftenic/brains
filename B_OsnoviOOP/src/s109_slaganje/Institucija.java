package s109_slaganje;

public class Institucija {
	
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
	
	private int brojUcionica, brojZaposlenih;
	private Ucionica[] ucionice = new Ucionica[brojUcionica];
	private Zaposlenik[] zaposleni = new Zaposlenik[brojZaposlenih];
	
	public Institucija() {}
	
	public Institucija(int brojUcionica, int brojZaposlenih) {
		this.brojUcionica = brojUcionica;
		this.brojZaposlenih = brojZaposlenih;
	}

	public Institucija(int brojUcionica, int brojZaposlenih, Ucionica[] ucionice, Zaposlenik[] zaposleni) {
		this.brojUcionica = brojUcionica;
		this.brojZaposlenih = brojZaposlenih;
		this.ucionice = ucionice;
		this.zaposleni = zaposleni;
	}

	public int getBrojUcionica() {
		return brojUcionica;
	}

	public void setBrojUcionica(int brojUcionica) {
		this.brojUcionica = brojUcionica;
	}

	public int getBrojZaposlenih() {
		return brojZaposlenih;
	}

	public void setBrojZaposlenih(int brojZaposlenih) {
		this.brojZaposlenih = brojZaposlenih;
	}

	public Ucionica[] getUcionice() {
		return ucionice;
	}

	public void setUcionice(Ucionica[] ucionice) {
		this.ucionice = ucionice;
	}

	public Zaposlenik[] getZaposleni() {
		return zaposleni;
	}

	public void setZaposleni(Zaposlenik[] zaposleni) {
		this.zaposleni = zaposleni;
	}
}
