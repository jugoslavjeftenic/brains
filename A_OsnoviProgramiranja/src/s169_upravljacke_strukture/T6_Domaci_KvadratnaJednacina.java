package s169_upravljacke_strukture;

import alati.TextIO;

public class T6_Domaci_KvadratnaJednacina {

	public static void main(String[] args) {
		
		/*
		 * Implementirati program za ra�unanje re�enje (korena) kvadratne jedna�ine.
		 * Obezbediti sve obavezne provere ulaznih vrednosti.
		 * Izra�unati sva mogu�a re�enja u zavisnosti od ulaznih vrednosti koeficijenata a, b i c.
		 * Nakon �to se izra�una i prika�e re�enje kvadratne jedna�ine,
		 * korisnika treba pitati da li �eli da unese novu kvadratnu jedna�inu.
		 */
		    
		boolean noviZadatak = false;
		double a, b, c, d, sqrtD, x1, x2, y1, y2;
		
		do {
			
			do {
				System.out.println("Upi�ite A: ");
				a = TextIO.getlnDouble();
				if (a == 0) {
					System.out.println("Promenljiva A ne mo�e da ima vrednost 0.");
				}
			} while (a == 0);
			
			System.out.println("Upi�ite B: ");
			b = TextIO.getlnDouble();
			System.out.println("Upi�ite C: ");
			c = TextIO.getlnDouble();
			System.out.println();
			
			d = (b * b) - (4 * a * c);
			
			if (d > 0) {

//				x1 = (-b + Math.sqrt(d)) / (2 * a);
//				x2 = (-b - Math.sqrt(d)) / (2 * a);
				
				sqrtD = Math.sqrt(d);
				x1 = (-b + sqrtD) / (2 * a);
				x2 = (-b - sqrtD) / (2 * a);
				System.out.printf
					("Diskriminanta je veca od 0. Rezultat x1=%.2f x2=%.2f %n", x1, x2);
				
			}
			else if (d == 0) {
				
				x1 = -(b / (2 * a));
				System.out.printf("Diskriminanta je jednaka 0. Rezultat x1=%.2f %n", x1);
				
			} else {

				x1 = -b / (2 * a);
				d = Math.abs(d);
//				y1 = (Math.sqrt(d)) / (2 * a);
//				y2 = (-(Math.sqrt(d)) / (2 * a));

				sqrtD = Math.sqrt(d);
				y1 = sqrtD / (2 * a);
				y2 = (-(sqrtD) / (2 * a));
				System.out.printf
					("Diskriminanta je manja od 0. Rezultat x1=%.2f, y1=%.2fi, y2=%.2fi. %n",
					x1, y1, y2);
				
			}
			
			System.out.println("Da li �elite da unesete novu kvadratnu jedna�inu (Y/N)?");
			noviZadatak = TextIO.getlnBoolean();
			
		} while (noviZadatak == true);

	}

}
