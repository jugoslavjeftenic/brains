package s099_nasledjivanje_oblik;

public class Krug extends Oblik {

	/*
	 * Realizovati klase Kvadrat (dodatni atribut duzinaStranice tipa double) i
	 * Krug (dodatni atribut poluprecnik tipa double) koje nasle�uju klasu Oblik i
	 * implementiraju metode za ra�unanje povr�ine.
	 */

	private double r;
	
	public Krug() {}

	public Krug(String boja, double r) {
		super(boja, "krug", 0);
		this.r = r;
	}

	public double racunajPovrsinu() {
		return r * r * Math.PI;
	}
	
	public double racunajObim() {
		return 2 * r * Math.PI;
	}
	
	public void ispisiPodatke() {
		super.ispisiPodatke();
		System.out.printf("Povrsina %.2f, obim %.2f, poluprecnik %.2f.\n",
			racunajPovrsinu(), racunajObim(), getR());
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
}
