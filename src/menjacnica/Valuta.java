package menjacnica;

import java.util.LinkedList;

public class Valuta {
	private String naziv;
	private String oznaka;
	private LinkedList<Kurs> kursNaDan;

	public String getNaziv() {
		return naziv;
	}
	public String getOznaka() {
		return oznaka;
	}
	public LinkedList<Kurs> getKursNaDan() {
		return kursNaDan;
	}

	public void setKursNaDan(LinkedList<Kurs> kursNaDan) {
		this.kursNaDan = kursNaDan;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public void setOznaka(String oznaka) {
		this.oznaka = oznaka;
	}
}
