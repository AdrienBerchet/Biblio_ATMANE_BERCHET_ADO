package test;

import java.text.ParseException;

import dao.ExemplairesDao;
import dao.UtilisateursDao;
import metier.BiblioException;
import metier.Employe;
import metier.EmpruntArchive;
import metier.EmpruntEnCours;
import metier.Exemplaire;

public class TestRetour {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws ParseException {
		ExemplairesDao edao = new ExemplairesDao();
		UtilisateursDao udao = new UtilisateursDao();
		System.out.println("\n\nAjout 2 livres pour employé");
		Employe e1 = (Employe) udao.findById(104);
		System.out.println(" Adhérent instancié via classe Dao " + e1);
		Exemplaire ex3 = edao.findById(3);
		EmpruntEnCours ep3 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/02/2021"),e1,ex3);
		Exemplaire ex4 = edao.findById(4);
		EmpruntEnCours ep4 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),e1,ex4);
		System.out.println(e1);
		System.out.println("Nombre d'emprunts : " + e1.getNbEmpruntsEnCours());
		
		System.out.println("\n\nTest retour d'un emprunt");
		EmpruntArchive ea1 = new EmpruntArchive(ep4.getDateEmprunt(),EmpruntArchive.sdf.parse("07/03/2021"));
		try {
		e1.removeEmprunts(ep4,ex4,ea1);
		} catch (BiblioException e) {
			System.out.println(e);
		}
		System.out.println("\n Emprunts APRES rendu du livre ex4 de l'emprunt ep4 : \n" + e1);
		System.out.println("\nNombre d'emprunts après retour : " + e1.getNbEmpruntsEnCours());
		System.out.println("\nL'emprunt est archivé : " + ea1);
		System.out.println("\nLe livre rendu doit être disponible : " + ex4);
		System.out.println("\nL'emprunt ep15 est garbage collecté : " + ep4);
		
	}

}
