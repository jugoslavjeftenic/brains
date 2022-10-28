package s169_upravljacke_strukture;

import alati.TextIO;

public class S207_Z2_DeljivoSa7 {

	public static void main(String[] args) {
		
		/*
		 * Napisati program koji odre�uje ukupan broj brojeva deljivih sa 7. 
		 * Korisnik unosi brojeve sve dok ne unese vrednost -1. 
		 * Uneti broj mora biti u intervalu od 6..142.  
		 */
		
		// Na po�etku deklari�emo promenljivu koja �e nam trebati kroz ceo program.
		int broj;
		
		// Zadatak ka�e da program treba da radi sve dok se ne upi�e vrednost -1
		// pa u ovoj petlji vrtimo sve dok je petlja "true", odnosno beskona�no.
		// Unutar petlje �emo ispitati da li je vrednost -1 i iza�i iz programa.
		do {
			// Unutar glavne petlje pravimo novu petlju koja �e korisnika vrteti u unosu
			// sve dok ne upi�e uslov za zavr�etak programa, "-1"
			do {
				// Korisnik upisuje vrednost.
				System.out.println("Unestite ceo broj u intervalu 6 - 142 (izlaz: -1)");
				broj = TextIO.getlnInt();
				
				// Ispitujemo da li je upisao "-1" i ako jeste prekidamo program televizije
				// sa odgovaraju�om porukom.
				if (broj == -1) {
					System.out.println("Upisali ste vrednost za KRAJ programa.");
					System.exit(0);
				}
				
				// Ispitujemo da li je korisnikov broj manji od 6 ILI ve�i od 142
				// i na fin na�in mu ka�emo da nije bistar.
				//
				// Ovo radimo nakon ispitivanja da li je korisnik upisao -1 iz razloga
				// ako bi smo prvo ispitivali da li je broj manji od 6 onda ne bismo nikada
				// do�li do ispitivanja da li je broj jednak -1 �to nam je uslov za kraj.
				else if (broj < 6 || broj > 142) {
					System.out.println("Broj je van intervala. Poku�ajte ponovo.\n");
				}
				
			} while (broj < 6 || broj > 142);
			// U while-u ponavljamo ispitivanje opsega i korisnika dr�imo u petlji sve dok
			// ne ubode broj koji smo mu lepo napisali.
			// Kod pisanja programa se �esto polazi od pretpostavke da korisnik nije
			// najintiligentnija osoba na svetu.
			
			// Ispitujemo da li upisani broj ima ostatak pri delenju sa 7
			// (https://www.baeldung.com/modulo-java)
			if (broj % 7 == 0) {
				System.out.printf("Broj %d je deljiv sa 7 i sa 7 je podeljen ukupno %d puta.\n\n",
					broj, broj / 7);
			}
			
			// a ako ima ostatak, deklari�emo privremenu promenljivu "ostatak" za ispis
			// koja �e �iveti kratko (poput leptira) i postojati samo dok smo u else delu.
			// (https://toplickevesti.com/leptiri-imaju-kratak-zivot-ali-i-krila.html)
			// Za�to ubacujem linkove koji nemaju veze sa programom?
			// Zato �to treba non-stop guglati ono �to se nezna.
			// (https://kakosepise.com/rec/neznam-ili-ne-znam/)
			else {
				int ostatak = broj % 7;
				System.out.printf("Broj %d ima ostatak pri delenju sa 7. "
					+ "Broj %d je sa 7 podeljen %d puta, a ostatak deljenja je: %d\n\n",
					broj, broj, broj / 7, ostatak);
			}
			
		} while (true);
		// while ispituje da li je ne�to ta�no i u ovom slu�aju smo mu rekli:
		// "Jeste, ta�no je", bez da mu ka�emo �TA treba da je ta�no.
		// Po�to je while tupav i bitno mu je samo da dobije boolean vrednost
		// on �e ovo raditi beskona�no.
		//
		// Ukoliko �elimo kona�nu vrednost pa mu napi�emo "while (A > B)" onda se prvo
		// ispituje da li A jeste ve�e od B, i to ta�no ili neta�no se prenosi u while
		// koji zatim ponavlja petlju u slu�aju ta�nog ili izlazi iz petlje i nastavlja
		// program u slu�aju neta�nog.
	}
}
