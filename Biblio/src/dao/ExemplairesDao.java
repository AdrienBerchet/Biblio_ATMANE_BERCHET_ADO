package dao;



import metier.EnumStatusExemplaire;
import metier.Exemplaire;


//Cette classe permet l'accès aux données (dao)
//version "Mock Objet" : objet bouchon (pour les tests)
public class ExemplairesDao {
	

	//Tableau utilisateurs 
	private Exemplaire [] ExemplairesDB =  {
		/*new Exemplaire(1,Exemplaire.sdf.parse("05/01/2015"),EnumStatusExemplaire.DISPONIBLE,"EX000001"),
		new Exemplaire(1,Exemplaire.sdf.parse("12/09/2003"),EnumStatusExemplaire.DISPONIBLE,"EX000002"),
		new Exemplaire(2,Exemplaire.sdf.parse("05/01/2015"),EnumStatusExemplaire.DISPONIBLE,"EX000003"),
		new Exemplaire(5,Exemplaire.sdf.parse("19/11/2017"),EnumStatusExemplaire.DISPONIBLE,"EX000004"),
		new Exemplaire(6,Exemplaire.sdf.parse("31/08/1998"),EnumStatusExemplaire.PRETE,"EX000005"),
		new Exemplaire(45,Exemplaire.sdf.parse("03/02/2018"),EnumStatusExemplaire.PRETE,"EX000006"),
		new Exemplaire(38,Exemplaire.sdf.parse("05/01/2015"),EnumStatusExemplaire.DISPONIBLE,"EX000007"),
		new Exemplaire(8,Exemplaire.sdf.parse("18/04/2010"),EnumStatusExemplaire.SUPPRIME,"EX000008")*/
		new Exemplaire(1,EnumStatusExemplaire.DISPONIBLE,"EX000001"),
		new Exemplaire(1,EnumStatusExemplaire.DISPONIBLE,"EX000002"),
		new Exemplaire(2,EnumStatusExemplaire.DISPONIBLE,"EX000003"),
		new Exemplaire(5,EnumStatusExemplaire.DISPONIBLE,"EX000004"),
		new Exemplaire(6,EnumStatusExemplaire.PRETE,"EX000005"),
		new Exemplaire(45,EnumStatusExemplaire.PRETE,"EX000006"),
		new Exemplaire(38,EnumStatusExemplaire.DISPONIBLE,"EX000007"),
		new Exemplaire(8,EnumStatusExemplaire.SUPPRIME,"EX000008")
	};			
	
	// méthode qui retourne l'exemplaire dont on fournit l'ISBN
		public Exemplaire findByIsbn (String isbn) {
			for (Exemplaire exemplaire : ExemplairesDB) {
				if (exemplaire.getIsbn().equals(isbn)) {
					return exemplaire;
				}
			}
			return null;
		}
	
	
	
	
}
