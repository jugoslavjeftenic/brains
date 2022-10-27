package s260_banka;

public class Main {
	
	/*
	 * Program za podr�ku poslovanju banaka.
	 * Banke u svom poslovanju vode evidenciju o klijentima i realizovanim transakcijama.
	 * 
	 * Realizovati slede�e funkcionalnosti:
	 * - U�itavanje podataka o klijentima iz datoteke, kao i upis podataka o klijentima u datoteku.
	 * - Dodavanje, brisanje i tra�enje klijenta.
	 * - Realizacija internih transakcija izme�u klijenata banke.
	 * - Upis podataka o svim transakcijama u datoteku.
	 * 
	 * U test klasi kreirati banku, u�itati podatke o klijentima i izvr�iti transakcije.
	 * Podatke o izvr�enim transakcijama upisati u datoteku.
	 * PRO�IRENJE 1: Dodati i funkcionalnosti za rad sa zaposlenima.
	 * PRO�IRENJE 2: Podr�ati realizaciju eksternih transakcija u platnom prometu prema
	 * klijentima iz drugih banaka.
	 */
	
	public static void main(String[] args) {
		
		String filePath = "src/s260_banka/";

		Banka b = new Banka();
		b.ucitajKlijente(filePath + "klijenti.txt");
		b.stampaKlijenata();
	}
}
