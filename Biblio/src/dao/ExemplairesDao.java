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
		new Exemplaire(2,new GregorianCalendar(2003, Calendar.SEPTEMBER,12).getTime(),EnumStatusExemplaire.DISPONIBLE,"EX000002"),
		new Exemplaire(3,new GregorianCalendar(2015, Calendar.JANUARY,05).getTime(),EnumStatusExemplaire.DISPONIBLE,"EX000003"),
		new Exemplaire(4,new GregorianCalendar(2017, Calendar.NOVEMBER,19).getTime(),EnumStatusExemplaire.DISPONIBLE,"EX000004"),
		new Exemplaire(5,new GregorianCalendar(1998, Calendar.AUGUST,31).getTime(),EnumStatusExemplaire.DISPONIBLE,"EX000005"),
		new Exemplaire(6,new GregorianCalendar(2018, Calendar.FEBRUARY,03).getTime(),EnumStatusExemplaire.DISPONIBLE,"EX000006"),
		new Exemplaire(7,new GregorianCalendar(2015, Calendar.JANUARY,05).getTime(),EnumStatusExemplaire.DISPONIBLE,"EX000007"),
		new Exemplaire(8,new GregorianCalendar(2010, Calendar.APRIL,18).getTime(),EnumStatusExemplaire.DISPONIBLE,"EX000008"),
		new Exemplaire(9,new GregorianCalendar(2001, Calendar.MAY,25).getTime(),EnumStatusExemplaire.DISPONIBLE,"EX000009"),
		new Exemplaire(10,new GregorianCalendar(2019, Calendar.DECEMBER,11).getTime(),EnumStatusExemplaire.DISPONIBLE,"EX000010"),
		new Exemplaire(11,new GregorianCalendar(1997, Calendar.MAY,02).getTime(),EnumStatusExemplaire.DISPONIBLE,"EX000011"),
		new Exemplaire(12,new GregorianCalendar(2020, Calendar.JULY,17).getTime(),EnumStatusExemplaire.DISPONIBLE,"EX000012")
		
	};			
	
	// méthode qui retourne l'exemplaire dont on fournit l'Id
		public Exemplaire findById (Integer idExemplaire) {
			for (Exemplaire exemplaire : ExemplairesDB) {
				if (exemplaire.getIdExemplaire().equals(idExemplaire)) {
					return exemplaire;
				}
			}
			return null;
		}
	
	
	
	
}
