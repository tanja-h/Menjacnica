package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.InterfejsMenjacnica;

public class ImplementacijaInterfejsa implements InterfejsMenjacnica {
	LinkedList<Valuta> valute = new LinkedList<Valuta>(); 

	
	@Override
	public void dodajKurs(Valuta valuta, GregorianCalendar datum, Kurs kurs) {
		// TODO Auto-generated method stub

	}

	@Override
	public void obrisiKurs(Valuta valuta, GregorianCalendar datum) {
		for (int i = 0; i < valute.size(); i++) { 
			if( valute.get(i).equals(valuta)){ 
				LinkedList<Kurs> kursevi = valute.get(i).getKursNaDan(); 
				for (int j = 0; j < kursevi.size(); j++) { 
					if(kursevi.get(j).getDatum().get(GregorianCalendar.DATE) 
							== datum.get(GregorianCalendar.DATE)){ 
						valute.get(i).getKursNaDan().remove(kursevi.get(j)); 
						return; 
					} 
				} 
			} 
		}
	}

	@Override
	public Kurs nadjiKurs(Valuta valuta, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
