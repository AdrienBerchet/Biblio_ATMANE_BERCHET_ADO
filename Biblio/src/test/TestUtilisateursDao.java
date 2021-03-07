package test;

import dao.UtilisateursDao;

public class TestUtilisateursDao {

	public static void main(String[] args) {
		// La Dao nous offre un service
		UtilisateursDao udao = new UtilisateursDao();
		
		// Tests de findById (2 réussis et 1 échoué)
		System.out.println("Test findById");
		System.out.println("Avec l'identifiant \"100\", l'utilisateur trouvé est : " + udao.findById(100));
		System.out.println("Avec l'identifiant \"104\", l'utilisateur trouvé est : " + udao.findById(104));
		System.out.println("Avec l'identifiant \"109\", l'utilisateur trouvé est : " + udao.findById(109));
	
		// Tests de findAdhById (1 réussi et 1 échoué)
		System.out.println("\n\nTest findAdhById");
		System.out.println("Avec l'identifiant \"100\", l'adhérent trouvé est : " + udao.findAdhById(100));
		System.out.println("Avec l'identifiant \"104\", l'adhérent trouvé est : " + udao.findAdhById(104));
	
		// Tests de findEmpById (1 échoué et 1 réussi)
		System.out.println("\n\nTest findEmpById");
		System.out.println("Avec l'identifiant \"100\", l'employé trouvé est : " + udao.findEmpById(100));
		System.out.println("Avec l'identifiant \"104\", l'employé trouvé est : " + udao.findEmpById(104));
	
	}

}
