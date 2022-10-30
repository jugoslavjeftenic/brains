package s165_radno_okruzenje_i_api_prodavnica_prosireno;

public class SpisakKlijenata {

	private String[] ime;
	private int trenutniBrojKlijenata, maksBrojKlijenata;
	
	public SpisakKlijenata(int maksBrojKlijenata) {
		this.maksBrojKlijenata = maksBrojKlijenata;
		this.trenutniBrojKlijenata = 0;
		this.ime = new String[maksBrojKlijenata];
	}

	public String nadjiKlijenta(String ime) {
		for (int i = 0; i < trenutniBrojKlijenata; i++)
			if (this.ime[i].equals(ime))
				return ime;
		return "Klijent nije pronadjen!";
	}
	
	public void dodajKlijenta(String ime) {
		if (trenutniBrojKlijenata < maksBrojKlijenata)
			this.ime[trenutniBrojKlijenata++] = ime;
		else
			System.out.println("Nema vise mesta u spisku klijenata!");
	}
}
