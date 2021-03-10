package test;

import java.text.ParseException;

import dao.ExemplairesDao;
import dao.UtilisateursDao;
import metier.BiblioException;
import metier.EmpruntEnCours;
import metier.Exemplaire;
import metier.Utilisateur;

public class TestDeBaseEmprunt {

	public static void main(String[] args) throws ParseException, BiblioException {
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
		
		EmpruntEnCours ep1 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),u1,ex1);
			
		EmpruntEnCours ep2 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),u2,ex2);	
			
		System.out.println("\n\n Bilan");
		System.out.println("\n Emprunt en cours pour adhérent u1 : " + u1.getNbEmpruntsEnCours());
		System.out.println("\n Utilisateur pour emprunt en cours ep1 : " + ep1.getU());
		System.out.println("\n Emprunt en cours pour employe u2 : " + u2.getNbEmpruntsEnCours());
		System.out.println("\n Utilisateur pour emprunt en cours ep2 : " + ep2.getU());
			

	}

}
