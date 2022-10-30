package s154_radno_okruzenje_i_api_prodavnica;

public class Poslasticarnica extends Prodavnica implements Imenovanje {

	private String imeKompanije;
	private String[] stavkeMenija = {"Sladoljed", "Koljac", "Krofna", "Kafa", "Caj", "Ljimunada"};
	
	@Override
	public String getIme() {
		return imeKompanije;
	}

	@Override
	public void setIme(String ime) {
		imeKompanije = ime;
	}
	
	@Override
	public String[] uzmiInventar() {
		return stavkeMenija;
	}
	
	@Override
	public void kupiInventar(String artikal) {
		System.out.println("\nUpravo ste narucili artikal: " + artikal + ".");
	}
}
