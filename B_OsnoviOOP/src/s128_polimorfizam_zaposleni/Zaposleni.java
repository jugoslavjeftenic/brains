package s128_polimorfizam_zaposleni;

class Zaposleni extends Osoba {
	
<<<<<<< HEAD
	protected double qRM;
	
	public Zaposleni() {}
	
	public Zaposleni(String ime, String prezime, double qRM) {
		super(ime, prezime, 0);
		this.qRM = qRM;
	}
	
	public double racunajPlatu(int brojDana) {
		return 100 * qRM * brojDana;
	}
	
	public void stampajPlatu(int brojDana) {
		System.out.printf("%s %s na radnom mestu sa koeficijentom %.2f ima platu %.2f.",
=======
	/*
	 * Zadatak: Realizovati klasu Zaposleni sa atributima ime, prezime,
	 * koefRadnogMesta, plata, standardnim konstruktorom i konstruktorom koji
	 * postavlja inicijalne vrednosti atributa, metodom za ra�unanje plate na osnovu
	 * broja radnih dana u mesecu i radnog mesta, kao i metodom za �tampanje
	 * podataka o zaposlenom i njegovoj plati
	 * Formula za ra�unanje plate: plata = koefRadnogMesta * brojRadnihDana * 100
	 */
	
	protected double qRM;
	
	public Zaposleni() {}
	
	public Zaposleni(String ime, String prezime, double qRM) {
		super(ime, prezime, 0);
		this.qRM = qRM;
	}
	
	public double racunajPlatu(int brojDana) {
		return 100 * qRM * brojDana;
	}
	
	public void stampajPlatu(int brojDana) {
		System.out.printf
			("%s %s na radnom mestu sa koeficijentom %.2f ima platu %.2f.",
>>>>>>> branch 'master' of https://github.com/jugoslavjeftenic/brains.git
			 ime, prezime, qRM, racunajPlatu(brojDana));
	}

	public double getqRM() {
		return qRM;
	}

	public void setqRM(double qRM) {
		this.qRM = qRM;
	}
}
