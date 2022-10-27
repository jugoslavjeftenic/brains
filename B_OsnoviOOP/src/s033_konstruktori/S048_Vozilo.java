package s033_konstruktori;

class Vozilo {
	
<<<<<<< HEAD
	static int godina = 2022;
	
	String marka, tip, registracija;
	int godiste, maksBrzina, snaga;

	Vozilo() {
		marka = "";
		tip = "";
		registracija = "";
		godiste = 0;
		maksBrzina = 0;
		snaga = 0;
	}
	
	Vozilo(String marka, String tip, int godiste, String registracija, int maksBrzina, int snaga) {
		this.marka = marka;
		this.tip = tip;
		this.godiste = godiste;
		this.registracija = registracija;
		this.maksBrzina = maksBrzina;
		this.snaga = snaga;
	}

	void stampajPodatke() {
		System.out.println("Podaci o vozilu " + marka + " " + tip + ":");
		System.out.println("-godiste:           " + godiste);
		System.out.println("-registracija:      " + registracija);
		System.out.println("-maksimalna brzina: " + maksBrzina);
		System.out.println("-snaga vozila:      " + snaga);
		System.out.println();
	}
	
	int izracunajCenu() {
		return this.maksBrzina * this.snaga / (godina - this.godiste);
	}
	
	boolean uporediCenu(int cenaDrugogVozila) {
		return (this.izracunajCenu() < cenaDrugogVozila) ? false : true;
	}
}

public class S048_Vozilo {

	/*
	 * Zadatak: Realizovati klasu Vozilo sa atributima marka (String), tip (String),
	 * godiste (int), registracija (String), maksBrzina (int), snaga (int),
	 * standardnim konstruktorom i konstruktorom koji postavlja inicijalne vrednosti,
	 * metodom za ra�unanje vrednosti automobila na osnovu formule:
	 * cena = maksBrzina * snaga / (2021 � godiste), kao i metodama za �tampanje podataka o vozilu i
	 * pore�enje cene dva vozila.
	 * 
	 * Klasu testirati kreiranjem vi�e objekata u glavnom programu i pozivanjem
	 * odgovaraju�ih metoda. Nacrtati i dijagram klasa za klasu Vozilo.
	 */
	
	public static void main(String[] args) {
		
=======
	/*
	 * Zadatak: Realizovati klasu Vozilo sa atributima marka (String), tip (String),
	 * godiste (int), registracija (String), maksBrzina (int), snaga (int),
	 * standardnim konstruktorom i konstruktorom koji postavlja inicijalne vrednosti,
	 * metodom za ra�unanje vrednosti automobila na osnovu formule: cena = maksBrzina * snaga / (2021 � godiste),
	 * kao i metodama za �tampanje podataka o vozilu i pore�enje cene dva vozila.
	 * Klasu testirati kreiranjem vi�e objekata u glavnom programu i pozivanjem
	 * odgovaraju�ih metoda. Nacrtati i dijagram klasa za klasu Vozilo.
	 */
	
	/*
	 *  *-------------------*
	 *  |Vozilo             |
	 *  *-------------------*
	 *  |marka:String       |
	 *  |tip:String         |
	 *  |registracija:String|
	 *  |godiste:int        |
	 *  |maksBrzina:int     |
	 *  |snaga:int          |
	 *  *-------------------*
	 *  |Vozilo:            |
	 *  |stampajPodatke:void|
	 *  |izracunajCenu:int  |
	 *  |uporediCenu:boolean|
	 *  *-------------------*
	 */
	
	static int godina = 2022;
	
	String marka, tip, registracija;
	int godiste, maksBrzina, snaga;

	Vozilo() {
		marka = "";
		tip = "";
		registracija = "";
		godiste = 0;
		maksBrzina = 0;
		snaga = 0;
	}
	
	Vozilo(String marka, String tip, int godiste, String registracija, int maksBrzina, int snaga) {
		this.marka = marka;
		this.tip = tip;
		this.godiste = godiste;
		this.registracija = registracija;
		this.maksBrzina = maksBrzina;
		this.snaga = snaga;
	}

	void stampajPodatke() {
		System.out.println("Podaci o vozilu " + marka + " " + tip + ":");
		System.out.println("-godiste:           " + godiste);
		System.out.println("-registracija:      " + registracija);
		System.out.println("-maksimalna brzina: " + maksBrzina);
		System.out.println("-snaga vozila:      " + snaga);
		System.out.println();
	}
	
	int izracunajCenu() {
		return this.maksBrzina * this.snaga / (godina - this.godiste);
	}
	
	boolean uporediCenu(int cenaDrugogVozila) {
		return (this.izracunajCenu() < cenaDrugogVozila) ? false : true;
	}
}

public class S048_Vozilo {

	public static void main(String[] args) {
		
//		String marka, String tip, int godiste, String registracija, int maksBrzina, int snaga
>>>>>>> branch 'master' of https://github.com/jugoslavjeftenic/brains.git
		Vozilo fica = new Vozilo("Zastava", "750", 1972, "SU-001", 80, 25);
		Vozilo stojadin = new Vozilo("Zastava", "101", 1982, "SU-101", 130, 55);
		Vozilo lada = new Vozilo("Lada", "750", 1972, "SU-USSR", 150, 70);

		fica.stampajPodatke();
		System.out.println("Cena vozila je: " + fica.izracunajCenu());
		System.out.println("------------------------------------");
		
		stojadin.stampajPodatke();
		System.out.println("Cena vozila je: " + stojadin.izracunajCenu());
		System.out.println("------------------------------------");

		lada.stampajPodatke();
		System.out.println("Cena vozila je: " + lada.izracunajCenu());
		System.out.println("------------------------------------");
		
		System.out.println("Poredjenje cena vozila:");
		System.out.printf
			("Vozilo %s %s je %s od vozila %s %s.\n",
			 fica.marka, fica.tip, (fica.uporediCenu(stojadin.izracunajCenu())) ? "skuplje" : "jeftinije",
			 stojadin.marka, stojadin.tip);
		System.out.printf
			("Vozilo %s %s je %s od vozila %s %s.\n",
			 fica.marka, fica.tip, (fica.uporediCenu(lada.izracunajCenu())) ? "skuplje" : "jeftinije",
			 lada.marka, lada.tip);
		System.out.printf
			("Vozilo %s %s je %s od vozila %s %s.\n",
			 lada.marka, lada.tip, (lada.uporediCenu(stojadin.izracunajCenu())) ? "skuplje" : "jeftinije",
			 stojadin.marka, stojadin.tip);
	}
}
