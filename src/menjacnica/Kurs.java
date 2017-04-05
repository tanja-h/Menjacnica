package menjacnica;

import java.util.GregorianCalendar;

public class Kurs {
	private GregorianCalendar datumKursa;
	private double prodajniKurs;
	private double kupovniKurs;
	private double srednjiKurs;

	public GregorianCalendar getDatum() {
		return datumKursa;
	}
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	
	public void setDatum(GregorianCalendar datum) {
		this.datumKursa = datum;
	}
	public void setProdajniKurs(double prodajniKurs) {
		this.prodajniKurs = prodajniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		this.kupovniKurs = kupovniKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) {
		this.srednjiKurs = srednjiKurs;
	}
}
