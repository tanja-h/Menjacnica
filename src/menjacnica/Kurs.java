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
		if(datum == null) throw new RuntimeException("Datum ne sme biti null");
		this.datumKursa = datum;
	}
	public void setProdajniKurs(double prodajniKurs) {
		if(prodajniKurs <= 0) throw new RuntimeException("Kurs mora biti veci od 0");
		this.prodajniKurs = prodajniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		if(kupovniKurs <= 0) throw new RuntimeException("Kurs mora biti veci od 0");
		this.kupovniKurs = kupovniKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) {
		if(srednjiKurs <= 0) throw new RuntimeException("Kurs mora biti veci od 0");
		this.srednjiKurs = srednjiKurs;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datumKursa == null) ? 0 : datumKursa.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Kurs)) {
			return false;
		}
		Kurs other = (Kurs) obj;
		if (datumKursa == null) {
			if (other.datumKursa != null) {
				return false;
			}
		} else if (!datumKursa.equals(other.datumKursa)) {
			return false;
		}
		if (Double.doubleToLongBits(kupovniKurs) != Double.doubleToLongBits(other.kupovniKurs)) {
			return false;
		}
		if (Double.doubleToLongBits(prodajniKurs) != Double.doubleToLongBits(other.prodajniKurs)) {
			return false;
		}
		if (Double.doubleToLongBits(srednjiKurs) != Double.doubleToLongBits(other.srednjiKurs)) {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		return "Kurs [datumKursa: " + datumKursa + ", prodajniKurs: " + prodajniKurs + ", kupovniKurs: " + kupovniKurs
				+ ", srednjiKurs: " + srednjiKurs + "]";
	}
	
}
