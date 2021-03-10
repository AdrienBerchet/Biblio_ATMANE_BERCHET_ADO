package test;

import java.text.ParseException;

import dao.ExemplairesDao;
import dao.UtilisateursDao;
import metier.BiblioException;
import metier.Employe;
import metier.EmpruntEnCours;
import metier.Exemplaire;

public class TestEmployeEnRetard {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws ParseException, BiblioException {
		ExemplairesDao edao = new ExemplairesDao();
		UtilisateursDao udao = new UtilisateursDao();
		System.out.println("\n\nAjout livre en retard pour employé");
		Employe e1 = (Employe) udao.findById(104);
		System.out.println(" Adhérent instancié via classe Dao " + e1);
		Exemplaire ex3 = edao.findById(3);
		EmpruntEnCours ep3 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/02/2021"),e1,ex3);
		System.out.println(e1);
		System.out.println("Nombre d'emprunts : " + e1.getNbEmpruntsEnCours());
		
		System.out.println("\n\n Test emprunt livre quand employé a un retard");
		Exemplaire ex4 = edao.findById(4);
		EmpruntEnCours ep4 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),e1,ex4);
		System.out.println(e1);
		System.out.println("Nombre d'emprunts : " + e1.getNbEmpruntsEnCours());
		
	}

}
