package s121_polimorfizam_osoba;

public class Zena extends Osoba {
	
	/*
	 * Realizovati klasu Zena, izvedenu iz klase Osoba, koja ima i atribut
	 * devojackoPrezime. Objekti klase Zena treba da odgovaraju na poruku
	 * predstaviSe, ali dame skoro nikada ne otkrivaju svoje godine. Zato objekat
	 * klase Zena treba da ima funkciju predstaviSe, samo �to �e ona izgledati ne�to
	 * druga�ije, svojstveno izvedenoj klasi Zena � bez saop�tavanja podataka o
	 * starosti, ali sa devoja�kim prezimenom.
	 * 
	 * � Klase testirati kreiranjem vi�e objekata u glavnom programu i pozivanjem metoda za predstavljanje.
	 */
	
	private String devojackoPrezime;
	
	public Zena() {}

	public Zena(String ime, String prezime, int starost, String devojackoPrezime) {
		super(ime, prezime, starost);
		this.devojackoPrezime = devojackoPrezime;
	}

	public void predstaviSe() {
		System.out.printf("%s, %s, %s", getIme(), getDevojackoPrezime(), getPrezime());
	}

	public String getDevojackoPrezime() {
		return devojackoPrezime;
	}

	public void setDevojackoPrezime(String devojackoPrezime) {
		this.devojackoPrezime = devojackoPrezime;
	}
}
