package test;

import dao.ExemplairesDao;

public class TestExemplairesDao {

	public static void main(String[] args) {
		// La Dao nous offre un service
		ExemplairesDao edao = new ExemplairesDao();
				
		// Tests de findByIsbn (1 réussi et 1 échoué)
		System.out.println("Test findByIsbn");
		System.out.println("Avec les ISBN \"EX000001\" et \"EX000005\", les exemplaires trouvés sont : " + edao.findByIsbn("EX000001") + edao.findByIsbn("EX000005"));
		System.out.println("Avec les ISBN \"EX001008\" et \"EX001005\", les exemplaires trouvés sont : " + edao.findByIsbn("EX001008") + edao.findByIsbn("EX001005"));

	}

}
