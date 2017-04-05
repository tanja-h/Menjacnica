package menjacnica.interfejs;

import java.util.GregorianCalendar;

import menjacnica.Kurs;
import menjacnica.Valuta;

public interface InterfejsMenjacnica {
	public void dodajKurs(Valuta valuta, GregorianCalendar datum, Kurs kurs);
	public void obrisiKurs(Valuta valuta, GregorianCalendar datum);
	public Kurs nadjiKurs(Valuta valuta, GregorianCalendar datum);
	
}
