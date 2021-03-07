package test;

import dao.UtilisateursDao;

public class TestUtilisateursDao {

	public static void main(String[] args) {
		// La Dao nous offre un service
		UtilisateursDao udao = new UtilisateursDao();
		
		// Tests de findById (2 r�ussis et 1 �chou�)
		System.out.println("Test findById");
		System.out.println("Avec l'identifiant \"100\", l'utilisateur trouv� est : " + udao.findById(100));
		System.out.println("Avec l'identifiant \"104\", l'utilisateur trouv� est : " + udao.findById(104));
		System.out.println("Avec l'identifiant \"109\", l'utilisateur trouv� est : " + udao.findById(109));
	
		// Tests de findAdhById (1 r�ussi et 1 �chou�)
		System.out.println("\n\nTest findAdhById");
		System.out.println("Avec l'identifiant \"100\", l'adh�rent trouv� est : " + udao.findAdhById(100));
		System.out.println("Avec l'identifiant \"104\", l'adh�rent trouv� est : " + udao.findAdhById(104));
	
		// Tests de findEmpById (1 �chou� et 1 r�ussi)
		System.out.println("\n\nTest findEmpById");
		System.out.println("Avec l'identifiant \"100\", l'employ� trouv� est : " + udao.findEmpById(100));
		System.out.println("Avec l'identifiant \"104\", l'employ� trouv� est : " + udao.findEmpById(104));
	
	}

}
