package menjacnica;

import java.util.GregorianCalendar;

import menjacnica.interfejs.InterfejsMenjacnica;

public class ImplementacijaInterfejsa implements InterfejsMenjacnica {

	@Override
	public void dodajKurs(Valuta valuta, GregorianCalendar datum, Kurs kurs) {
		// TODO Auto-generated method stub

	}

	@Override
	public void obrisiKurs(Valuta valuta, GregorianCalendar datum) {
		// TODO Auto-generated method stub

	}

	@Override
	public Kurs nadjiKurs(Valuta valuta, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
