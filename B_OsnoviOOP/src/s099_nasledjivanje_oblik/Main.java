package s099_nasledjivanje_oblik;

import alati.RADE;

public class Main {

<<<<<<< HEAD
	/*
	 * Realizovati klasu Oblik sa atributima:
	 * boja (String), tip (String), brojStrana (int), povrsina (double),
	 * standardnim konstruktorom i konstruktorom koji postavlja inicijalne vrednosti,
	 * metodama za postavljanje i pribavljanje atributa,
	 * kao i metodama za promenu boje oblika i �tampanje podataka o obliku.
	 * 
	 * Realizovati klase Kvadrat (dodatni atribut duzinaStranice tipa double) i
	 * Krug (dodatni atribut poluprecnik tipa double) koje nasle�uju klasu Oblik i
	 * implementiraju metode za ra�unanje povr�ine.
	 * 
	 * Klasu testirati kreiranjem vi�e objekata u glavnom programu i
	 * pozivanjem odgovaraju�ih metoda. Nacrtati i dijagram klasa.
	 */

	public static void main(String[] args) {
		
=======
	public static void main(String[] args) {
		
		/*
		 * Klasu testirati kreiranjem vi�e objekata u glavnom programu i
		 * pozivanjem odgovaraju�ih metoda. Nacrtati i dijagram klasa.
		 */

>>>>>>> branch 'master' of https://github.com/jugoslavjeftenic/brains.git
		Oblik kv = new Kvadrat(RADE.generisiBoju(), RADE.mrRobot(1.0, 10.0));
		Oblik kr = new Krug(RADE.generisiBoju(), RADE.mrRobot(1.0, 10.0));
		
		kv.ispisiPodatke();
		System.out.println();
		kr.ispisiPodatke();
		System.out.println();
	}
}
