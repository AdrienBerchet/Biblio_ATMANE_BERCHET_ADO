package test;

import java.text.ParseException;

import dao.ExemplairesDao;
import dao.UtilisateursDao;
import metier.Adherent;
import metier.BiblioException;
import metier.EmpruntEnCours;
import metier.Exemplaire;


public class TestAdherentTroisEmprunt {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws ParseException, BiblioException {
		ExemplairesDao edao = new ExemplairesDao();
		UtilisateursDao udao = new UtilisateursDao();
		System.out.println("\n\nTest emprunt 3 livres pour adhérent");
		Adherent a1 = (Adherent) udao.findById(101);
		System.out.println(" Adhérent instancié via classe Dao " + a1);
		Exemplaire ex3 = edao.findById(3);
		Exemplaire ex4 = edao.findById(4);
		Exemplaire ex5 = edao.findById(5);
		EmpruntEnCours ep3 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),a1,ex3);
		EmpruntEnCours ep4 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),a1,ex4);
		EmpruntEnCours ep5 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),a1,ex5);
		System.out.println(a1);
		System.out.println("Nombre d'emprunts : " + a1.getNbEmpruntsEnCours());
		System.out.println("Conditions de prêts acceptables : " + a1.isConditionsPretAcceptees());
		
		System.out.println("\n\nAjout 4ème livre pour adhérent");
		Exemplaire ex6 = edao.findById(6);
		EmpruntEnCours ep6 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),a1,ex6);
		System.out.println(a1);
		System.out.println("Nombre d'emprunts : " + a1.getNbEmpruntsEnCours());
		System.out.println("Conditions de prêts acceptables : " + a1.isConditionsPretAcceptees());
		
		
	}

}
