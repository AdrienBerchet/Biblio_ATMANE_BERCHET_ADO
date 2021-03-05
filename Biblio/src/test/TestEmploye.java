package test;

import metier.Employe;
import metier.EnumCategorieEmploye;

public class TestEmploye {

	public static void main(String[] args) {
		Employe em1 = new Employe("Nom","Prenom");
		Employe em2 = new Employe("Nom","Prenom", "EMP000215", EnumCategorieEmploye.BIBLIOTHECAIRE);
		System.out.println(em1 + "\n" + em2);
	}

}
