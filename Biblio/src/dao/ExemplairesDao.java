package dao;


import java.util.Calendar;
import java.util.GregorianCalendar;

import metier.EnumStatusExemplaire;
import metier.Exemplaire;


//Cette classe permet l'accès aux données (dao)
//version "Mock Objet" : objet bouchon (pour les tests)
public class ExemplairesDao {
	// Penser à utiliser des LocalDate pour fiabliliser le rendu des date quelque soit le type de classe !!!!

	//Tableau utilisateurs 
	private Exemplaire [] ExemplairesDB =  {
		new Exemplaire(1,new GregorianCalendar(2015, Calendar.JANUARY,27).getTime(),EnumStatusExemplaire.DISPONIBLE,"EX000001"),
		new Exemplaire(1,new GregorianCalendar(2003, Calendar.SEPTEMBER,12).getTime(),EnumStatusExemplaire.DISPONIBLE,"EX000002"),
		new Exemplaire(2,new GregorianCalendar(2015, Calendar.JANUARY,05).getTime(),EnumStatusExemplaire.DISPONIBLE,"EX000003"),
		new Exemplaire(5,new GregorianCalendar(2017, Calendar.NOVEMBER,19).getTime(),EnumStatusExemplaire.DISPONIBLE,"EX000004"),
		new Exemplaire(6,new GregorianCalendar(1998, Calendar.AUGUST,31).getTime(),EnumStatusExemplaire.PRETE,"EX000005"),
		new Exemplaire(45,new GregorianCalendar(2018, Calendar.FEBRUARY,03).getTime(),EnumStatusExemplaire.PRETE,"EX000006"),
		new Exemplaire(38,new GregorianCalendar(2015, Calendar.JANUARY,05).getTime(),EnumStatusExemplaire.DISPONIBLE,"EX000007"),
		new Exemplaire(8,new GregorianCalendar(2010, Calendar.APRIL,18).getTime(),EnumStatusExemplaire.SUPPRIME,"EX000008")
		
	};			
	
	// méthode qui retourne l'exemplaire dont on fournit l'ISBN
		public Exemplaire findByIsbn (String isbn) {
			for (Exemplaire exemplaire : ExemplairesDB) {
				if (exemplaire.getIsbn().equals(isbn)) {
					return exemplaire;
				}
			}
			return null;
		}
	
	
	
	
}
