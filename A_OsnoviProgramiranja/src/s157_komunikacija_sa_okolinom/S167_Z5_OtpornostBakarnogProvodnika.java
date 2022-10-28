package s157_komunikacija_sa_okolinom;
import alati.TextIO;

public class S167_Z5_OtpornostBakarnogProvodnika {

	public static void main(String[] args) {
		
		final double RCU = 1.588e-8;
		double i, d;

		System.out.print("Unesite du�inu provodnika I: ");
		i = TextIO.getlnDouble();
		System.out.print("Unesite unesite pre�nik provodnika d: ");
		d = TextIO.getlnDouble();
		System.out.println();

		double r = RCU * 4.0 * i / (d * d * Math.PI);

		System.out.printf("Otpornost bakarnog provodnika du�ine %.2f i pre�nika %.2f je %f.", i, d, r);
	}
}
