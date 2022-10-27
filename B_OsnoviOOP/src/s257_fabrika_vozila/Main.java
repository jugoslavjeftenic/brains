package s257_fabrika_vozila;

public class Main {

	/*
	 * Kori��enjem projektnog obrasca Factory napraviti �fabriku vozila�.
	 * Treba kreirati interfejs Proizvod i konkretne klase koje implementiraju ovaj
	 * interfejs. Potrebno je i definisati klasu �fabriku� - FabrikaVozila.
	 * 
	 * Treba kreirati i test klasu ObrazacFabrikaTest koja �e koristiti klasu
	 * FabrikaVozila kako bi pribavila odgovaraju�i objekat nekog tipa vozila.
	 * Test klasa �e samo prosle�ivati informaciju fabrici vozila da li je u pitanju
	 * automobil, kamion ili motocikl, a klasa FabrikaVozila �e potom �isporu�ivati�
	 * tra�eno vozilo test klasi.
	 */
	
	public static void main(String[] args) {

		Proizvod proizvod = FabrikaVozila.pokreniProizvodnju("automobil");
		proizvod.proizvediVozilo();
		
		proizvod = FabrikaVozila.pokreniProizvodnju("kamion");
		proizvod.proizvediVozilo();
		
		proizvod = FabrikaVozila.pokreniProizvodnju("motocikl");
		proizvod.proizvediVozilo();
	}
}
