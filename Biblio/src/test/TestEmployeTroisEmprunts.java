package test;

import java.text.ParseException;

import dao.ExemplairesDao;
import dao.UtilisateursDao;
import metier.BiblioException;
import metier.Employe;
import metier.EmpruntEnCours;
import metier.Exemplaire;

public class TestEmployeTroisEmprunts {

	public static void main(String[] args) throws ParseException, BiblioException {
		ExemplairesDao edao = new ExemplairesDao();
		UtilisateursDao udao = new UtilisateursDao();
		System.out.println("\n\nTest emprunt 3 livres pour employé");
		Employe e1 = (Employe) udao.findById(104);
		System.out.println(" Employé instancié via classe Dao " + e1);
		Exemplaire ex9 = edao.findById(7);
		Exemplaire ex10 = edao.findById(8);
		Exemplaire ex11 = edao.findById(9);
		EmpruntEnCours ep9 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex9);
		EmpruntEnCours ep10 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex10);
		EmpruntEnCours ep11 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex11);
		try {
		e1.addEmpruntEnCours(ep9);
		e1.addEmpruntEnCours(ep10);
		e1.addEmpruntEnCours(ep11);
		} catch (BiblioException e) {
			System.out.println(e);
		}
		System.out.println(e1);
		System.out.println("Nombre d'emprunts : " + e1.getNbEmpruntsEnCours());
		System.out.println("\n\nAjout 4ème livre pour employé");
		Exemplaire ex12 = edao.findById(6);
		EmpruntEnCours ep12 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex12);
		try {
		e1.addEmpruntEnCours(ep12);
		} catch (BiblioException e) {
			System.out.println(e);
		}
		System.out.println(e1);
		System.out.println("Nombre d'emprunts : " + e1.getNbEmpruntsEnCours());
		
	}

}
