package s169_upravljacke_strukture;

import alati.TextIO;

public class S190_KvadratnaJednacina_NijeDobroResen {

	public static void main(String[] args) {
		
        double a, b, c;
        double x1, x2;

        System.out.println("Unesite parametar jedna�ine A: ");
		a = TextIO.getlnDouble();
		System.out.println("Unesite parametar jedna�ine B: ");
		b = TextIO.getlnDouble();
		System.out.println("Unesite parametar jedna�ine C: ");
		c = TextIO.getlnDouble();
		System.out.println();

		if ((b * b) < (4 * a * c)) {
			System.out.println("Re�enje je kompleksno.");
		}
        else if (a == 0 && b == 0 && c == 0)
            System.out.println("Re�enje je svako x iz skupa realnih brojeva.");
        else if (a == 0) {
            x1 = -1 * (c / b);
            System.out.printf("Re�enje je linearno i iznosi: %f", x1);
        }
        else {
            x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            System.out.printf("Re�enje je: X1=%f, X2=%f", x1, x2);
        }

	}

}
