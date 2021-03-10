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
		EmpruntEnCours ep3 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/02/2021"),a1,ex3);
		
		System.out.println(a1);
		System.out.println("Nombre d'emprunts : " + a1.getNbEmpruntsEnCours());
		System.out.println("Conditions de prêts acceptables : " + a1.isConditionsPretAcceptees());
		System.out.println("Prêt en retard : " + a1.isPretEnRetard(ep3));
		
		System.out.println("\n\n Test emprunt livre quand adhérent a un retard");
		Exemplaire ex4 = edao.findById(4);
		EmpruntEnCours ep4 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),a1,ex4);
		
		System.out.println(a1);
		System.out.println("Nombre d'emprunts : " + a1.getNbEmpruntsEnCours());
		System.out.println("Conditions de prêts acceptables : " + a1.isConditionsPretAcceptees());
		System.out.println("Prêt en retard : " + a1.isPretEnRetard(ep4));		
		
	}

}
