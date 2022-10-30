package s165_radno_okruzenje_i_api_prodavnica_prosireno;

public class Restoran extends Prodavnica implements Imenovanje {

	private String imeKompanije, imeMenadzera;
	private String[] jelovnik = {"Becka snicla", "Karadjordjeva snicla", "Hosenfefer sos", "Pomfriti", "Salata"};
	private boolean otvoren, pospremljen;
	
	@Override
	public String getIme() {
		return imeKompanije;
	}

	@Override
	public void setIme(String ime) {
		imeKompanije = ime;
	}
	
	@Override
	public String getMenadzer() {
		return imeMenadzera;
	}

	@Override
	public void setMenadzer(String ime) {
		imeMenadzera = ime;
	}

	@Override
	public String[] uzmiInventar() {
		return jelovnik;
	}
	
	@Override
	public void kupiInventar(String artikal) {
		System.out.println("\nUpravo ste narucili artikal: " + artikal + ".");
	}
	
	@Override
	public void otvoriLokal() {
		if (!otvoren) {
			otvoren = true;
			System.out.println("Lokal je otvoren.");
		}
	}

	@Override
	public void pospremiLokal() {
		if (!pospremljen) {
			pospremljen = true;
			System.out.println("Lokal je pospremljen.");
		}
	}
}
