package test;

import java.text.ParseException;

import dao.ExemplairesDao;
import dao.UtilisateursDao;
import metier.Adherent;
import metier.BiblioException;
import metier.EmpruntEnCours;
import metier.Exemplaire;

public class TestAdherentEnRetard {

	public static void main(String[] args) throws ParseException, BiblioException {
		ExemplairesDao edao = new ExemplairesDao();
		UtilisateursDao udao = new UtilisateursDao();
		System.out.println("\n\nAjout livre en retard pour adhérent");
		Adherent a1 = (Adherent) udao.findById(100);
		System.out.println(" Adhérent instancié via classe Dao " + a1);
		Exemplaire ex3 = edao.findById(3);
		EmpruntEnCours ep3 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/02/2021"),ex3);
		try {
		a1.addEmpruntEnCours(ep3);
		} catch (BiblioException e) {
			System.out.println(e);
		}
		System.out.println(a1);
		System.out.println("Nombre d'emprunts : " + a1.getNbEmpruntsEnCours());
		System.out.println("Conditions de prêts acceptables : " + a1.isConditionsPretAcceptees());
		System.out.println("Prêt en retard : " + a1.isPretEnRetard(ep3));
		
		System.out.println("\n\n Test emprunt livre quand adhérent a un retard");
		Exemplaire ex4 = edao.findById(4);
		EmpruntEnCours ep4 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex4);
		try {
		a1.addEmpruntEnCours(ep4);
		} catch (BiblioException e) {
			System.out.println(e);
		}
		System.out.println(a1);
		System.out.println("Nombre d'emprunts : " + a1.getNbEmpruntsEnCours());
		System.out.println("Conditions de prêts acceptables : " + a1.isConditionsPretAcceptees());
		System.out.println("Prêt en retard : " + a1.isPretEnRetard(ep3));		
		
		
		
		
		
		
		/*
		
		
		System.out.println("\n\nTest emprunt quand adhérent a un retard");
		Adherent a4 = new Adherent("Nom4", "Prénom4", 104 , "mdp4", "pseudo4","00.00.00.00.04");
		Exemplaire ex7 = new Exemplaire(1,Exemplaire.sdf.parse("01/02/2021"),EnumStatusExemplaire.DISPONIBLE, "EX0000007");
		EmpruntEnCours ep7 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/02/2021"),ex7);
		a4.addEmpruntEnCours(ep7);
		System.out.println(a4);
		System.out.println("Nombre d'emprunts : " + a4.getNbEmpruntsEnCours());
		System.out.println("Conditions de prêts acceptables : " + a4.isConditionsPretAcceptees());
		System.out.println("Prêt en retard : " + a4.isPretEnRetard(ep7));
		Exemplaire ex8 = new Exemplaire(1,Exemplaire.sdf.parse("01/03/2021"),EnumStatusExemplaire.DISPONIBLE, "EX0000008");
		EmpruntEnCours ep8 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex8);
		try {
		a4.addEmpruntEnCours(ep8);
		} catch (BiblioException e) {
			System.out.println(e);
		}
		System.out.println(a4);
		System.out.println("Nombre d'emprunts : " + a4.getNbEmpruntsEnCours());
		System.out.println("Conditions de prêts acceptables : " + a4.isConditionsPretAcceptees());
*/
	}

}
