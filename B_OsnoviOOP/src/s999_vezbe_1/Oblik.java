package s999_vezbe_1;

public abstract class Oblik {

	/*
	 * Napisati apstraktnu klasu Oblik koja ima atribute: boja (tipa String), tip
	 * (tipa String) i brojStrana (tipa int); metode za pribavljanje i postavljanje
	 * svih atributa (getere i setere), konstruktor kojim se postavljajuju vrednosti
	 * svih atributa i apstraktne metode za ra�unanje povr�ine i obima. Kod svih
	 * atributa i metoda navesti i odgovaraju�e pristupne atribute.
	 */
	
	private String boja;
	private String tip;
	private int brojStrana;
	
	public abstract void racunajPovrsinu();
	
	public abstract void racunajObim();

	public String getBoja() {
		return boja;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public int getBrojStrana() {
		return brojStrana;
	}
	public void setBrojStrana(int brojStrana) {
		this.brojStrana = brojStrana;
	}
	public Oblik(String boja, String tip, int brojStrana) {
		this.boja = boja;
		this.tip = tip;
		this.brojStrana = brojStrana;
	}
}
