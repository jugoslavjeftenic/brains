package s099_nasledjivanje_oblik;

import alati.RADE;

public class Main {

	/*
	 * Realizovati klasu Oblik sa atributima:
	 * boja (String), tip (String), brojStrana (int), povrsina (double),
	 * standardnim konstruktorom i konstruktorom koji postavlja inicijalne vrednosti,
	 * metodama za postavljanje i pribavljanje atributa,
	 * kao i metodama za promenu boje oblika i stampanje podataka o obliku.
	 * 
	 * Realizovati klase Kvadrat (dodatni atribut duzinaStranice tipa double) i
	 * Krug (dodatni atribut poluprecnik tipa double) koje nasledjuju klasu Oblik i
	 * implementiraju metode za racunanje povrsine.
	 * 
	 * Klasu testirati kreiranjem vise objekata u glavnom programu i pozivanjem odgovarajucih metoda.
	 * Nacrtati i dijagram klasa.
	 */

	public static void main(String[] args) {
		
		Oblik kv = new Kvadrat(RADE.generisiBoju(), RADE.mrRobot(1.0, 10.0));
		Oblik kr = new Krug(RADE.generisiBoju(), RADE.mrRobot(1.0, 10.0));
		
		kv.ispisiPodatke();
		System.out.println();
		kr.ispisiPodatke();
		System.out.println();
	}
}
