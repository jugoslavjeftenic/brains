package s095_promenljive;

public class S111_Z3_PovrsinaObimKruga {

	public static void main(String[] args) {
		
		double r = 20;
		double povrsina = r * r * Math.PI;
		double obim = 2 * r * Math.PI;
		
		System.out.println("Povr�ina kruga polupre�nika " + (int) r + " je " + povrsina + ".");
		System.out.println("Obim kruga polupre�nika " + (int) r + " je " + obim + ".");

	}

}
