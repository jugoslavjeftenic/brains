package s121_operatori;

public class S127_AritmetickiOperatori_SlobodniPad {

	public static void main(String[] args) {
		
		/* Deklaracija promenljivih. */
		double gravitacija = -9.81;
		double inicijalnoUbrzanje = 0.0;
		double vremePadanja = 10.0;
		double inicijalnaPozicija = 0.0;
		double finalnaPozicija = 0.5 * gravitacija * vremePadanja *vremePadanja;
		
		/* Izracunavanje. */
		finalnaPozicija = finalnaPozicija + inicijalnoUbrzanje * vremePadanja;
		finalnaPozicija = finalnaPozicija + inicijalnaPozicija;

		/* Ispisivanje rezultata. */
		System.out.print("Pozicija objekta nakon ");
		System.out.print(vremePadanja);
		System.out.print(" sekundi je ");
		System.out.print(finalnaPozicija);
		System.out.print("m.");
	}
}
