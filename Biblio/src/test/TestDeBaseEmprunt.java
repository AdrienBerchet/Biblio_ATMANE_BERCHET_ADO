package test;

import java.text.ParseException;

import dao.ExemplairesDao;
import dao.UtilisateursDao;
import metier.BiblioException;
import metier.EmpruntEnCours;
import metier.Exemplaire;
import metier.Utilisateur;

public class TestDeBaseEmprunt {

	public static void main(String[] args) throws ParseException {
		System.out.println("Test de base : emprunt adhérent et employé");
		UtilisateursDao udao = new UtilisateursDao();
		Utilisateur u1 = udao.findById(100);
		System.out.println(" Adhérent instancié via classe Dao " + u1);
		
		Utilisateur u2 = udao.findById(103);
		System.out.println(" Adhérent instancié via classe Dao " + u2);
		
		ExemplairesDao edao = new ExemplairesDao();
		Exemplaire ex1 = edao.findById(1);
		System.out.println(" Exemplaire instancié via classe Dao " + ex1);
		
		Exemplaire ex2 = edao.findById(2);
		System.out.println(" Exemplaire instancié via classe Dao " + ex2);
		
		System.out.println(" \n Emprunt ex1 pour Adhérent u1");
		EmpruntEnCours ep1 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex1);
		try {
			u1.addEmpruntEnCours(ep1);
			} catch (BiblioException e) {
				System.out.println(e);
			}
			System.out.println(u1);
			
			System.out.println(" \n Emprunt ex2 pour Adhérent u2");	
		EmpruntEnCours ep2 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex2);	
		try {
			u2.addEmpruntEnCours(ep2);
			} catch (BiblioException e) {
				System.out.println(e);
			}
			System.out.println(u2);
			System.out.println("emprunt en cours pour adhérent a0 : " + u1.getNbEmpruntsEnCours());
			System.out.println("emprunt en cours pour employe e0 : " + u2.getNbEmpruntsEnCours());

	}

}
