package test;

import dao.ExemplairesDao;

public class TestExemplairesDao {

	public static void main(String[] args) {
		// La Dao nous offre un service
		ExemplairesDao edao = new ExemplairesDao();
				
		// Tests de findByIsbn (1 réussi et 1 échoué)
		System.out.println("Test findById");
		System.out.println("Avec les ISBN \"1\" et \"2\", les exemplaires trouvés sont : " + edao.findById(1) + " et " +edao.findById(2));
		System.out.println("Avec les ISBN \"1325\" et \"25418\", les exemplaires trouvés sont : " + edao.findById(1325) + " et " +edao.findById(25418));

	}

}
