package s129_apstraktne_klase_i_interfejsi_oblik;

public class Kvadrat extends Oblik {

	/*
	 * Realizovati klasu Oblik sa atributima boja (String), tip (String), brojStrana
	 * (int), standardnim konstruktorom i konstruktorom koji postavlja inicijalne
	 * vrednosti, kao i metodama za promenu boje oblika i �tampanje podataka o
	 * obliku. � Realizovati klase Kvadrat (dodatni atribut duzinaStranice tipa
	 * double) i Krug (dodatni atribut poluprecnik tipa double) koje nasle�uju klasu
	 * Oblik i implementiraju metode za ra�unanje povr�ine i obima.
	 * 
	 * � Klase testirati kreiranjem vi�e objekata u glavnom programu i pozivanjem metoda za
	 * ra�unanje povr�ine i obima i �tampu podataka.
	 */
	
	private double duzinaStranice;
	
	public Kvadrat() {}

	public Kvadrat(String boja, double duzinaStranice) {
		super(boja, "kvadrat", 4);
		this.duzinaStranice = duzinaStranice;
	}
	
	public double izracunajPovrsinu() {
		return brojStrana * duzinaStranice;
	}
	
	public double izracunajObim() {
		return duzinaStranice * duzinaStranice;
	}
	
	public void ispisiPodatke() {
		super.ispisiPodatke();
		System.out.printf(" duzina stranice[%.2f] povrsina[%.2f] obim[%.2f]",
				duzinaStranice, izracunajPovrsinu(), izracunajObim());
	}

	public double getDuzinaStranice() {
		return duzinaStranice;
	}

	public void setDuzinaStranice(double duzinaStranice) {
		this.duzinaStranice = duzinaStranice;
	}
}
