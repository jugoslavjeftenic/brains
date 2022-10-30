package s209_staticke_strukture_podataka;

public class S232_Z5_ApsolutniNiz {

	/*
	 * Dat je niz A od maksimalno 40 celobrojnih elemenata. U�itati n elemenata u
	 * niz A i formirati niz X pri �emu su elementi niza X apsolutne vrednosti
	 * negativnih elemenata niza A. Koristiti abs funkciju.
	 */
	
	public static void main(String[] args) {
		
		int[] a = new int[40], x = new int[40];
		for(int i = 0; i < a.length; i++)
			a[i] = (int) ((Math.random() * (100 - -100)) + -100);

		for(int i = 0; i < 2; i++) {
			switch (i) {
			case 0:
				System.out.println("Generisani niz je:");
				for (int j = 0; j < a.length; j++) {
					System.out.print(a[j] + " ");
					x[j] = (int) Math.abs(a[j]);
				}
				break;
			case 1:
				System.out.println("Apsolutne vrednosti generisanog niza su:");
				for (int j = 0; j < x.length; j++) {
					System.out.print(x[j] + " ");
				}
			}
			System.out.println();
			System.out.println();
		}
	}
}
