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
		if(kursNaDan == null) throw new RuntimeException("Kurs na dan ne moze biti null!");
		this.kursNaDan = kursNaDan;
	}
	public void setNaziv(String naziv) {
		if(naziv == null || naziv.isEmpty()) throw new RuntimeException("Naziv ne sme biti prazan ili null");
		this.naziv = naziv;
	}
	public void setOznaka(String oznaka) {
		if(oznaka == null || naziv.isEmpty()) throw new RuntimeException("Oznaka ne sme biti prazna ili null");
		this.oznaka = oznaka;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kursNaDan == null) ? 0 : kursNaDan.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((oznaka == null) ? 0 : oznaka.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Valuta)){
			throw new RuntimeException("Objekat mora biti tipa Valuta!!!");
		}
		Valuta other = (Valuta) obj;
		if (naziv.equals(other.getNaziv()) && oznaka.equals(other.getOznaka()))
				return true;
		else return false;
	}
	
	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", oznaka=" + oznaka + ", kursNaDan=" + kursNaDan + "]";
	}
	
}
