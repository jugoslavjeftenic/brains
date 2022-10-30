package s999_zavrsni_test;

import java.util.ArrayList;

public class KriptoBerza extends Berza implements RadSaTransakcijama {

	/*
	 * (10 bd) Napisati klasu KriptoBerza koja nasledjuje apstraktnu klasu Berza i
	 * implementira interfejs RadSaTransakacijama.
	 * 
	 * Klasa ima atribute listaTrgovaca (tipa ArrayList<Trgovac>),
	 * listaKriptoValuta (tipa ArrayList<KriptoValuta>) i listaTransakcija (tipa ArrayList<Transakcija>),
	 * konstruktor (napomena: roditeljska klasa ima atribute:
	 * naziv, tipa String; grad, tipa String; nazivIndeksa tipa String; vrednostIndeksa, tipa double) i
	 * metode za pribavljanje i postavljanje atributa (getere i setere).
	 * 
	 * Interfejs RadSaTransakcijama ima samo metodu izvrsiTransakciju koja vlasnistvo nad kripto valutom
	 * iz niza listaKriptoValuta prenosi sa jednog na drugog trgovca iz niza listaTrgovaca.
	 * 
	 * Prepostaviti da je svaki element niza listaKriptoValuta kripto valuta koji kao svoje atribute
	 * sadrzi vlasnika, kolicinu i naziv valute.
	 * 
	 * Kod svih atributa i metoda navesti i odgovarajuce pristupne atribute.
	 */
	
	private ArrayList<Trgovac> listaTrgovaca;
	private ArrayList<KriptoValuta> listaKriptoValuta;
	private ArrayList<Transakcija> listaTransakcija;
	
	public KriptoBerza(String naziv, String grad, String nazivIndeksa, double vrednostIndeksa,
			ArrayList<Trgovac> listaTrgovaca, ArrayList<KriptoValuta> listaKriptoValuta,
			ArrayList<Transakcija> listaTransakcija) {
		super(naziv, grad, nazivIndeksa, vrednostIndeksa);
		this.listaTrgovaca = listaTrgovaca;
		this.listaKriptoValuta = listaKriptoValuta;
		this.listaTransakcija = listaTransakcija;
	}

	@Override
	public void izvrsiTransakciju() {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Trgovac> getListaTrgovaca() {
		return listaTrgovaca;
	}

	public void setListaTrgovaca(ArrayList<Trgovac> listaTrgovaca) {
		this.listaTrgovaca = listaTrgovaca;
	}

	public ArrayList<KriptoValuta> getListaKriptoValuta() {
		return listaKriptoValuta;
	}

	public void setListaKriptoValuta(ArrayList<KriptoValuta> listaKriptoValuta) {
		this.listaKriptoValuta = listaKriptoValuta;
	}

	public ArrayList<Transakcija> getListaTransakcija() {
		return listaTransakcija;
	}

	public void setListaTransakcija(ArrayList<Transakcija> listaTransakcija) {
		this.listaTransakcija = listaTransakcija;
	}
}
