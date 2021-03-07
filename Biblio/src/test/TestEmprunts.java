package test;

import java.text.ParseException;


import metier.Adherent;
import metier.BiblioException;
import metier.Employe;
import metier.EmpruntEnCours;
import metier.EnumCategorieEmploye;
import metier.EnumStatusExemplaire;
import metier.Exemplaire;
import metier.EmpruntArchive;



public class TestEmprunts {

	
	

	public static void main(String[] args) throws ParseException, BiblioException {
		System.out.println("Test emprunt adhérent et employé");
		Adherent a0 = new Adherent("Nom1", "Prénom1", 100 , "mdp1", "pseudo1","00.00.00.00.01");
		Employe e0 = new Employe("Nom2", "Prénom2", 101 , "mdp2", "pseudo2","EMP000", EnumCategorieEmploye.GESTIONNAIRE_DE_FONDS);
		Exemplaire ex1 = new Exemplaire(1,Exemplaire.sdf.parse("01/03/2021"),EnumStatusExemplaire.DISPONIBLE, "EX0000001");
		EmpruntEnCours ep1 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex1);
		try {
		a0.addEmpruntEnCours(ep1);
		} catch (BiblioException e) {
			System.out.println(e);
		}
		System.out.println(a0);
		
		Exemplaire ex2 = new Exemplaire(2,Exemplaire.sdf.parse("05/03/2021"),EnumStatusExemplaire.DISPONIBLE, "EX0000002");
		EmpruntEnCours ep3 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex2);
		try {
		e0.addEmpruntEnCours(ep3);
		} catch (BiblioException e) {
			System.out.println(e);
		}
		System.out.println(e0);
		System.out.println("emprunt en cours pour adhérent a0 : " + a0.getNbEmpruntsEnCours());
		System.out.println("emprunt en cours pour employe e0 : " + e0.getNbEmpruntsEnCours());
		
		System.out.println("\n\nTest emprunt 3 livres pour adhérent");
		Adherent a3 = new Adherent("Nom2", "Prénom2", 100 , "mdp", "pseudo","00.00.00.00.01");
		Exemplaire ex3 = new Exemplaire(1,Exemplaire.sdf.parse("01/03/2021"),EnumStatusExemplaire.DISPONIBLE, "EX0000003");
		EmpruntEnCours ep4 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex3);
		Exemplaire ex4 = new Exemplaire(1,Exemplaire.sdf.parse("01/03/2021"),EnumStatusExemplaire.DISPONIBLE, "EX0000004");
		EmpruntEnCours ep5 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex4);
		Exemplaire ex5 = new Exemplaire(1,Exemplaire.sdf.parse("01/03/2021"),EnumStatusExemplaire.DISPONIBLE, "EX0000005");
		EmpruntEnCours ep6 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex5);
		a3.addEmpruntEnCours(ep4);
		a3.addEmpruntEnCours(ep5);
		a3.addEmpruntEnCours(ep6);
		System.out.println(a3);
		System.out.println("Nombre d'emprunts : " + a3.getNbEmpruntsEnCours());
		System.out.println("Conditions de prêts acceptables : " + a3.isConditionsPretAcceptees());
		
		
		System.out.println("\n\nTest emprunt 4 livres pour adhérent");
		Exemplaire ex6 = new Exemplaire(1,Exemplaire.sdf.parse("01/03/2021"),EnumStatusExemplaire.DISPONIBLE, "EX0000006");
		EmpruntEnCours ep7 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex6);
		try {
		a3.addEmpruntEnCours(ep7);
		} catch (BiblioException e) {
			System.out.println(e);
		}
		System.out.println(a3);
		System.out.println("Nombre d'emprunts : " + a3.getNbEmpruntsEnCours());
		System.out.println("Conditions de prêts acceptables : " + a3.isConditionsPretAcceptees());
		
		System.out.println("\n\nTest emprunt quand adhérent a un retard");
		Adherent a4 = new Adherent("Nom4", "Prénom4", 104 , "mdp4", "pseudo4","00.00.00.00.04");
		Exemplaire ex7 = new Exemplaire(1,Exemplaire.sdf.parse("01/02/2021"),EnumStatusExemplaire.DISPONIBLE, "EX0000007");
		EmpruntEnCours ep8 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/02/2021"),ex7);
		a4.addEmpruntEnCours(ep8);
		System.out.println(a4);
		System.out.println("Nombre d'emprunts : " + a4.getNbEmpruntsEnCours());
		System.out.println("Conditions de prêts acceptables : " + a4.isConditionsPretAcceptees());
		System.out.println("Prêt en retard : " + a4.isPretEnRetard(ep8));
		Exemplaire ex8 = new Exemplaire(1,Exemplaire.sdf.parse("01/03/2021"),EnumStatusExemplaire.DISPONIBLE, "EX0000008");
		EmpruntEnCours ep9 = new EmpruntEnCours (EmpruntEnCours.sdf.parse("01/03/2021"),ex8);
		try {
		a4.addEmpruntEnCours(ep9);
		} catch (BiblioException e) {
			System.out.println(e);
		}
		System.out.println(a4);
		System.out.println("Nombre d'emprunts : " + a4.getNbEmpruntsEnCours());
		System.out.println("Conditions de prêts acceptables : " + a4.isConditionsPretAcceptees());
		
		System.out.println("\n\nTest emprunt 4 livres pour employé");
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
		EmpruntArchive ea1 = new EmpruntArchive(ep15.getDateEmprunt(),EmpruntArchive.sdf.parse("07/03/2021"));
		e2.removeEmprunts(ep15,ex14,ea1);
		System.out.println(e2);
		System.out.println("Nombre d'emprunts : " + e2.getNbEmpruntsEnCours());
		System.out.println(ea1);
		System.out.println("Le livre rendu doit être disponible : " + ex14);
		
	
	
	}

	

}
