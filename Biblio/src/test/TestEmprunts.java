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

		/*	// TODO ; à faire avec classes Dao
		System.out.println("\n\nTest emprunt 3 livres pour adhérent");
		Adherent a1 = (Adherent) udao.findById(101);
		System.out.println(" Adhérent instancié via classe Dao " + a1);
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
		System.out.println("Conditions de prêts acceptables : " + a1.isConditionsPretAcceptees());
		
		System.out.println("\n\nTest emprunt 4 livres pour adhérent");
		Exemplaire ex6 = edao.findById(6);
		EmpruntEnCours ep6 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex6);
		try {
		a1.addEmpruntEnCours(ep6);
		} catch (BiblioException e) {
			System.out.println(e);
		}
		System.out.println(a1);
		System.out.println("Nombre d'emprunts : " + a1.getNbEmpruntsEnCours());
		System.out.println("Conditions de prêts acceptables : " + a1.isConditionsPretAcceptees());
		*/
		System.out.println("\n\nTest emprunt 3 livres pour adhérent");
		Adherent a3 = new Adherent("Nom2", "Prénom2", 100 , "mdp", "pseudo","00.00.00.00.01");
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
		System.out.println("Conditions de prêts acceptables : " + a3.isConditionsPretAcceptees());
		
		
		System.out.println("\n\nTest emprunt 4 livres pour adhérent");
		Exemplaire ex6 = new Exemplaire(1,Exemplaire.sdf.parse("01/03/2021"),EnumStatusExemplaire.DISPONIBLE, "EX0000006");
		EmpruntEnCours ep6 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex6);
		try {
		a3.addEmpruntEnCours(ep6);
		} catch (BiblioException e) {
			System.out.println(e);
		}
		System.out.println(a3);
		System.out.println("Nombre d'emprunts : " + a3.getNbEmpruntsEnCours());
		System.out.println("Conditions de prêts acceptables : " + a3.isConditionsPretAcceptees());
		

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
		
		
		
		System.out.println("\n\nTest emprunt 4 livres pour employé");
		Employe e1 = (Employe) udao.findById(104);
		System.out.println(" Employé instancié via classe Dao " + e1);
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
		Employe e1 = new Employe("Nom01", "Prénom01", 10000 , "mdp", "pseudo","EMP0001",EnumCategorieEmploye.BIBLIOTHECAIRE);
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
		
		
		
		System.out.println("\n\nTest emprunt 4 livres pour employé");
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
		
		System.out.println("\n\nTest emprunt quand employé a un retard");
		Employe e2 = new Employe("Nom02", "Prénom02", 10001 , "mdp1", "pseudo1","EMP0002",EnumCategorieEmploye.BIBLIOTHECAIRE);
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
		System.out.println("Nombre d'emprunts après retour : " + e2.getNbEmpruntsEnCours());
		System.out.println("L'emprunt est archivé : " + ea1);
		System.out.println("Le livre rendu doit être disponible : " + ex14);
		System.out.println("L'emprunt ep15 est garbage collecté : " + ep15);
		
	
	
	}

	

}
