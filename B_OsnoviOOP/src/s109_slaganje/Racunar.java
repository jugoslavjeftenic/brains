package s109_slaganje;

public class Racunar {

	/*
	 * Osmisliti, nacrtati dijagrame klasa i realizovati u Javi klase
	 * Institucija, Ucionica, Zaposleni (koja nasle�uje klasu Osoba) i Racunar koje
	 * bi se mogle koristiti u programu za evidenciju zaposlenih i inventara neke
	 * obrazovne institucije.
	 * Spiskove u�ionica, zaposlenih i ra�unara po u�ionicama �uvati u
	 * odgovaraju�im nizovima (svaki sa najvi�e 20 �lanova).
	 * U kojim me�usobnim odnosima se nalaze pomenute klase
	 * (nasle�ivanje, asocijacija, agregacija, kompozicija)?
	 * � Klase testirati kreiranjem objekata u glavnom programu i pozivanjem izabranih metoda.
	 *   Nacrtati UML dijagram klasa re�enja.
	 */

	private String imeRacunara, oznakaProcesora;
	private double radniTakt;
	private int kapacitetMemorije;
	
	public Racunar() {}

	public Racunar(String imeRacunara, String oznakaProcesora, double radniTakt, int kapacitetMemorije) {
		this.imeRacunara = imeRacunara;
		this.oznakaProcesora = oznakaProcesora;
		this.radniTakt = radniTakt;
		this.kapacitetMemorije = kapacitetMemorije;
	}
	
	public void postaviAtribute(String imeRacunara, String oznakaProcesora, double radniTakt, int kapacitetMemorije) {
		this.imeRacunara = imeRacunara;
		this.oznakaProcesora = oznakaProcesora;
		this.radniTakt = radniTakt;
		this.kapacitetMemorije = kapacitetMemorije;
	}

	public double indeksPerformansi() {
		return 100 * radniTakt + kapacitetMemorije;
	}
	
	public void stampajIndeksPerformansi() {
		System.out.printf
			("%s sa procesorom %s-%.2f MHz i memorijom kapaciteta %d KiB ima indeks performansi %.2f.\n",
			 getImeRacunara(), getOznakaProcesora(), getRadniTakt(), getKapacitetMemorije(), indeksPerformansi());
	}
	
	public String getImeRacunara() {
		return imeRacunara;
	}
	
	public void setImeRacunara(String imeRacunara) {
		this.imeRacunara = imeRacunara;
	}
	
	public String getOznakaProcesora() {
		return oznakaProcesora;
	}

	public void setOznakaProcesora(String oznakaProcesora) {
		this.oznakaProcesora = oznakaProcesora;
	}

	public double getRadniTakt() {
		return radniTakt;
	}

	public void setRadniTakt(double radniTakt) {
		this.radniTakt = radniTakt;
	}

	public int getKapacitetMemorije() {
		return kapacitetMemorije;
	}

	public void setKapacitetMemorije(int kapacitetMemorije) {
		this.kapacitetMemorije = kapacitetMemorije;
	}
}
