package s200_matematika;

public class Main {

	/*
	 * Napraviti paket matematika i u okviru njega implementirati:
	 * 
	 * 1. Interfejs Tacka koji sadr�i slede�ih 5 metoda:
	 * a) u�itavanje koordinata iz tekstualne datoteke - ucitajKoordinate,
	 * b) izra�unavanje razdaljine od koordinatnog po�etka - izracunajUdaljenostOdNule,
	 * c) provera da li ta�ka mo�e biti vrh jedini�nog vektora (vektor du�ine jedan) - daLiSamOrt,
	 * d) provera da li je ta�ka na nekoj od koordinatnih osa - daLiSamNaKoordinatnojOsi,
	 * e) ispis koordinata u datoteku u formatu "(x, y, ...)" - sacuvajTacku
	 * 
	 * 2. Klasu Tacka2D (ima x i y koordinate) koja implementira interfejs Tacka
	 * 
	 * 3. Klasu Tacka3D (ima x, y i z koordinate) koja implementira interfejs Tacka
	 * 
	 * U test klasi definisati 2 promenljive tipa Tacka.
	 * Jednu referencirati na objekat klase Tacka2D a drugu na objekat klase Tacka3D.
	 * Koordinate ta�aka treba u�itati iz datoteka 2d.txt i 3d.txt gde su zapisane odgovaraju�e
	 * koordinate odvojene razmacima. Ispisati na standardnom izlazu za svaku ta�ku
	 * da li je vrh jedini�nog vektora i da li se nalazi na nekoj od koordinatnih osa.
	 * Ispisati metodom sa�uvaj ta�ku obe ta�ke u izlazne datoteke 2dtacka.txt i 3dtacka.txt, respektivno.
	 */

	public static void main(String[] args) {
		
		String inputFilePath = "src/s200_matematika/2d.txt";
		String outputFilePath = "src/s200_matematika/2dtacka.txt";
		
		Tacka t2d = new Tacka2D();
		t2d.ucitajKoordinate(inputFilePath);
		System.out.println("2D tacka " + ((t2d.daLiSamOrt()) ? "jeste" : "nije") + " vrh jedinicnog vektora.");
		System.out.println("2D tacka " + ((t2d.daLiSamNaKoordinatnojOsi()) ? "jeste" : "nije") + " na koordinantnoj osi.");
		t2d.sacuvajTacku(outputFilePath);
		
		System.out.println();
		
		inputFilePath = "src/s200_matematika/3d.txt";
		outputFilePath = "src/s200_matematika/3dtacka.txt";
		
		Tacka t3d = new Tacka3D();
		t3d.ucitajKoordinate(inputFilePath);
		System.out.println("3D tacka " + ((t3d.daLiSamOrt()) ? "jeste" : "nije") + " vrh jedinicnog vektora.");
		System.out.println("3D tacka " + ((t3d.daLiSamNaKoordinatnojOsi()) ? "jeste" : "nije") + " na koordinantnoj osi.");
		t3d.sacuvajTacku(outputFilePath);
	}
}
