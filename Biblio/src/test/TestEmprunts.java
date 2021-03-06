package test;

import java.text.ParseException;

import dao.ExemplairesDao;
import dao.UtilisateursDao;
import metier.Adherent;
import metier.BiblioException;
import metier.Employe;
import metier.EmpruntEnCours;
import metier.EnumCategorieEmploye;
import metier.EnumStatusExemplaire;
import metier.Exemplaire;
import metier.Utilisateur;
import metier.EmpruntArchive;



public class TestEmprunts {

	
	

	public static void main(String[] args) throws ParseException, BiblioException {
		System.out.println("Test de base : emprunt adh?rent et employ?");
		UtilisateursDao udao = new UtilisateursDao();
		Utilisateur u1 = udao.findById(100);
		System.out.println(" Adh?rent instanci? via classe Dao " + u1);
		
		Utilisateur u2 = udao.findById(103);
		System.out.println(" Adh?rent instanci? via classe Dao " + u2);
		
		ExemplairesDao edao = new ExemplairesDao();
		Exemplaire ex1 = edao.findById(1);
		System.out.println(" Exemplaire instanci? via classe Dao " + ex1);
		
		Exemplaire ex2 = edao.findById(2);
		System.out.println(" Exemplaire instanci? via classe Dao " + ex2);
		
		System.out.println(" \n Emprunt ex1 pour Adh?rent u1");
		EmpruntEnCours ep1 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex1);
		try {
			u1.addEmpruntEnCours(ep1);
			} catch (BiblioException e) {
				System.out.println(e);
			}
			System.out.println(u1);
			
			System.out.println(" \n Emprunt ex2 pour Adh?rent u2");	
		EmpruntEnCours ep2 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex2);	
		try {
			u2.addEmpruntEnCours(ep2);
			} catch (BiblioException e) {
				System.out.println(e);
			}
			System.out.println(u2);
			System.out.println("emprunt en cours pour adh?rent a0 : " + u1.getNbEmpruntsEnCours());
			System.out.println("emprunt en cours pour employe e0 : " + u2.getNbEmpruntsEnCours());

		/*	// TODO ; ? faire avec classes Dao
		System.out.println("\n\nTest emprunt 3 livres pour adh?rent");
		Adherent a1 = (Adherent) udao.findById(101);
		System.out.println(" Adh?rent instanci? via classe Dao " + a1);
		Exemplaire ex3 = edao.findById(3);
		Exemplaire ex4 = edao.findById(4);
		Exemplaire ex5 = edao.findById(5);
		EmpruntEnCours ep3 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex3);
		EmpruntEnCours ep4 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex4);
		EmpruntEnCours ep5 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex5);
		a1.addEmpruntEnCours(ep3);
		a1.addEmpruntEnCours(ep4);
		a1.addEmpruntEnCours(ep5);
		System.out.println(a1);
		System.out.println("Nombre d'emprunts : " + a1.getNbEmpruntsEnCours());
		System.out.println("Conditions de pr?ts acceptables : " + a1.isConditionsPretAcceptees());
		
		System.out.println("\n\nTest emprunt 4 livres pour adh?rent");
		Exemplaire ex6 = edao.findById(6);
		EmpruntEnCours ep6 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex6);
		try {
		a1.addEmpruntEnCours(ep6);
		} catch (BiblioException e) {
			System.out.println(e);
		}
		System.out.println(a1);
		System.out.println("Nombre d'emprunts : " + a1.getNbEmpruntsEnCours());
		System.out.println("Conditions de pr?ts acceptables : " + a1.isConditionsPretAcceptees());
		*/
		System.out.println("\n\nTest emprunt 3 livres pour adh?rent");
		Adherent a3 = new Adherent("Nom2", "Pr?nom2", 100 , "mdp", "pseudo","00.00.00.00.01");
		Exemplaire ex3 = new Exemplaire(1,Exemplaire.sdf.parse("01/03/2021"),EnumStatusExemplaire.DISPONIBLE, "EX0000003");
		EmpruntEnCours ep3 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex3);
		Exemplaire ex4 = new Exemplaire(1,Exemplaire.sdf.parse("01/03/2021"),EnumStatusExemplaire.DISPONIBLE, "EX0000004");
		EmpruntEnCours ep4 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex4);
		Exemplaire ex5 = new Exemplaire(1,Exemplaire.sdf.parse("01/03/2021"),EnumStatusExemplaire.DISPONIBLE, "EX0000005");
		EmpruntEnCours ep5 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex5);
		a3.addEmpruntEnCours(ep3);
		a3.addEmpruntEnCours(ep4);
		a3.addEmpruntEnCours(ep5);
		System.out.println(a3);
		System.out.println("Nombre d'emprunts : " + a3.getNbEmpruntsEnCours());
		System.out.println("Conditions de pr?ts acceptables : " + a3.isConditionsPretAcceptees());
		
		
		System.out.println("\n\nTest emprunt 4 livres pour adh?rent");
		Exemplaire ex6 = new Exemplaire(1,Exemplaire.sdf.parse("01/03/2021"),EnumStatusExemplaire.DISPONIBLE, "EX0000006");
		EmpruntEnCours ep6 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex6);
		try {
		a3.addEmpruntEnCours(ep6);
		} catch (BiblioException e) {
			System.out.println(e);
		}
		System.out.println(a3);
		System.out.println("Nombre d'emprunts : " + a3.getNbEmpruntsEnCours());
		System.out.println("Conditions de pr?ts acceptables : " + a3.isConditionsPretAcceptees());
		

		System.out.println("\n\nTest emprunt quand adh?rent a un retard");
		Adherent a4 = new Adherent("Nom4", "Pr?nom4", 104 , "mdp4", "pseudo4","00.00.00.00.04");
		Exemplaire ex7 = new Exemplaire(1,Exemplaire.sdf.parse("01/02/2021"),EnumStatusExemplaire.DISPONIBLE, "EX0000007");
		EmpruntEnCours ep7 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/02/2021"),ex7);
		a4.addEmpruntEnCours(ep7);
		System.out.println(a4);
		System.out.println("Nombre d'emprunts : " + a4.getNbEmpruntsEnCours());
		System.out.println("Conditions de pr?ts acceptables : " + a4.isConditionsPretAcceptees());
		System.out.println("Pr?t en retard : " + a4.isPretEnRetard(ep7));
		Exemplaire ex8 = new Exemplaire(1,Exemplaire.sdf.parse("01/03/2021"),EnumStatusExemplaire.DISPONIBLE, "EX0000008");
		EmpruntEnCours ep8 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex8);
		try {
		a4.addEmpruntEnCours(ep8);
		} catch (BiblioException e) {
			System.out.println(e);
		}
		System.out.println(a4);
		System.out.println("Nombre d'emprunts : " + a4.getNbEmpruntsEnCours());
		System.out.println("Conditions de pr?ts acceptables : " + a4.isConditionsPretAcceptees());
		
		
		
		System.out.println("\n\nTest emprunt 4 livres pour employ?");
		Employe e1 = (Employe) udao.findById(104);
		System.out.println(" Employ? instanci? via classe Dao " + e1);
		Exemplaire ex9 = edao.findById(7);
		Exemplaire ex10 = edao.findById(8);
		Exemplaire ex11 = edao.findById(9);
		EmpruntEnCours ep9 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex9);
		EmpruntEnCours ep10 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex10);
		EmpruntEnCours ep11 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex11);
		e1.addEmpruntEnCours(ep9);
		e1.addEmpruntEnCours(ep10);
		e1.addEmpruntEnCours(ep11);
		System.out.println(e1);
		System.out.println("Nombre d'emprunts : " + e1.getNbEmpruntsEnCours());
		
		Exemplaire ex12 = edao.findById(6);
		EmpruntEnCours ep12 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex12);
		try {
		e1.addEmpruntEnCours(ep12);
		} catch (BiblioException e) {
			System.out.println(e);
		}
		System.out.println(e1);
		System.out.println("Nombre d'emprunts : " + e1.getNbEmpruntsEnCours());
		
		
		/*
		Employe e1 = new Employe("Nom01", "Pr?nom01", 10000 , "mdp", "pseudo","EMP0001",EnumCategorieEmploye.BIBLIOTHECAIRE);
		Exemplaire ex9 = new Exemplaire(1,Exemplaire.sdf.parse("01/03/2021"),EnumStatusExemplaire.DISPONIBLE, "EX0000009");
		EmpruntEnCours ep10 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex9);
		Exemplaire ex10 = new Exemplaire(1,Exemplaire.sdf.parse("01/03/2021"),EnumStatusExemplaire.DISPONIBLE, "EX0000010");
		EmpruntEnCours ep11 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex10);
		Exemplaire ex11 = new Exemplaire(1,Exemplaire.sdf.parse("01/03/2021"),EnumStatusExemplaire.DISPONIBLE, "EX0000011");
		EmpruntEnCours ep12 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex11);
		e1.addEmpruntEnCours(ep10);
		e1.addEmpruntEnCours(ep11);
		e1.addEmpruntEnCours(ep12);
		System.out.println(e1);
		System.out.println("Nombre d'emprunts : " + e1.getNbEmpruntsEnCours());
		
		
		
		System.out.println("\n\nTest emprunt 4 livres pour employ?");
		Exemplaire ex12 = new Exemplaire(1,Exemplaire.sdf.parse("01/03/2021"),EnumStatusExemplaire.DISPONIBLE, "EX0000012");
		EmpruntEnCours ep13 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex12);
		try {
		e1.addEmpruntEnCours(ep13);
		} catch (BiblioException e) {
			System.out.println(e);
		}
		System.out.println(e1);
		System.out.println("Nombre d'emprunts : " + e1.getNbEmpruntsEnCours());
		*/
		
		System.out.println("\n\nTest emprunt quand employ? a un retard");
		Employe e2 = new Employe("Nom02", "Pr?nom02", 10001 , "mdp1", "pseudo1","EMP0002",EnumCategorieEmploye.BIBLIOTHECAIRE);
		Exemplaire ex13 = new Exemplaire(1,Exemplaire.sdf.parse("01/02/2021"),EnumStatusExemplaire.DISPONIBLE, "EX0000007");
		EmpruntEnCours ep14 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/02/2021"),ex13);
		e2.addEmpruntEnCours(ep14);
		System.out.println(e2);
		System.out.println("Nombre d'emprunts : " + e2.getNbEmpruntsEnCours());
		Exemplaire ex14 = new Exemplaire(1,Exemplaire.sdf.parse("01/03/2021"),EnumStatusExemplaire.DISPONIBLE, "EX0000008");
		EmpruntEnCours ep15 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex14);
		try {
		e2.addEmpruntEnCours(ep15);
		} catch (BiblioException e) {
			System.out.println(e);
		}
		System.out.println(e2);
		System.out.println("Nombre d'emprunts : " + e2.getNbEmpruntsEnCours());
		
		System.out.println("\n\nTest retour d'un emprunt");
		System.out.println("Emprunts avant rendu du livre : \n" + e2);
		System.out.println("Nombre d'emprunts avant retour : " + e2.getNbEmpruntsEnCours());
		EmpruntArchive ea1 = new EmpruntArchive(ep15.getDateEmprunt(),EmpruntArchive.sdf.parse("07/03/2021"));
		e2.removeEmprunts(ep15,ex14,ea1);
		System.out.println("\n Emprunts APRES rendu du livre ex14 de l'emprunt ep15 : \n" + e2);
		System.out.println("Nombre d'emprunts apr?s retour : " + e2.getNbEmpruntsEnCours());
		System.out.println("L'emprunt est archiv? : " + ea1);
		System.out.println("Le livre rendu doit ?tre disponible : " + ex14);
		System.out.println("L'emprunt ep15 est garbage collect? : " + ep15);
		
	
	
	}

	

}
