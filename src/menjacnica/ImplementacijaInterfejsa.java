package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.InterfejsMenjacnica;

public class ImplementacijaInterfejsa implements InterfejsMenjacnica {
	private LinkedList<Valuta> valute = new LinkedList<Valuta>(); 
	
	@Override
	public void dodajKurs(Valuta valuta, GregorianCalendar datum, Kurs kurs) {
		for(int i=0; i<valute.size(); i++){
			if(valute.get(i).equals(valuta)){
				LinkedList<Kurs> kursevi = valute.get(i).getKursNaDan();
				for(int j=0; j<kursevi.size(); j++){
					if(kursevi.get(j).getDatum().get(GregorianCalendar.DATE)
								== datum.get(GregorianCalendar.DATE)){
						valute.get(i).getKursNaDan().add(kurs);
					}
				}
			}
		}
	}

	@Override
	public void obrisiKurs(Valuta valuta, GregorianCalendar datum) {
		for(int i=0; i<valute.size(); i++){
			if(valute.get(i).equals(valuta)){
				LinkedList<Kurs> kursevi = valute.get(i).getKursNaDan();
				for(int j=0; j<kursevi.size(); j++){
					if(kursevi.get(j).getDatum().get(GregorianCalendar.DATE)
										== datum.get(GregorianCalendar.DATE)){ 
						valute.get(i).getKursNaDan().remove(j);
						return;		
					}
				}				
			}
		}
	}

	@Override
	public Kurs nadjiKurs(Valuta valuta, GregorianCalendar datum) {
		for(int i=0; i<valute.size(); i++){
			if(valute.get(i).equals(valuta)){
				LinkedList<Kurs> kursevi = valute.get(i).getKursNaDan();
				for(int j=0; j<kursevi.size(); j++){
					if(kursevi.get(j).getDatum().get(GregorianCalendar.DATE) 
							== datum.get(GregorianCalendar.DATE)){
						return valute.get(i).getKursNaDan().get(j);
					}
				}
			}
		}
		throw new RuntimeException("Nije pronadjeno!");
	}

}
