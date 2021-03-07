package dao;

import metier.Utilisateur;
import metier.Adherent;
import metier.Employe;
import metier.EnumCategorieEmploye;

	//Cette classe permet l'accès aux données (dao)
	//version "Mock Objet" : objet bouchon (pour les tests)
public class UtilisateursDao {
	//Tableau utilisateurs 
	private Utilisateur [] UtilisateursDB =  {
			new Adherent("Palèlyvre", "James",100,"mdp1", "pseudoA2balles","01.00.00.00.00"),
			new Adherent("Arienfet","Hélène",101,"mdp2mes2", "pseudotop","01.00.00.00.01"),
			new Adherent("Couyère","Arthur",102,"mdpnull", "pseudoKamelott","01.00.00.00.02"),
			new Employe("Moissa","Marc",103,"mdp123", "pseudopasbanal","EMP0001",EnumCategorieEmploye.BIBLIOTHECAIRE),
			new Employe("Kestou","Jean",104,"mdpbidon", "pseudokelkonk","EMP0002",EnumCategorieEmploye.BIBLIOTHECAIRE),
			new Employe("Croch","Sarah",105,"mdpdrôle", "pseudoArevoir","EMP0003",EnumCategorieEmploye.RESPONSABLE)
	};
	
	// méthode qui retourne l'utilisateur dont on fournit l'identifiant
	public Utilisateur findById (Integer idUtilisateur) {
		for (Utilisateur utilisateur : UtilisateursDB) {
			if (utilisateur.getIdUtilisateur().equals(idUtilisateur)) {
				return utilisateur;
			}
		}
		return null;
	}
	
	//Tableau que des adhérents 
	private Adherent [] AdherentsDB =  {
			new Adherent("Palèlyvre", "James",100,"mdp1", "pseudoA2balles","01.00.00.00.00"),
			new Adherent("Arienfet","Hélène",101,"mdp2mes2", "pseudotop","01.00.00.00.01"),
			new Adherent("Couyère","Arthur",102,"mdpnull", "pseudoKamelott","01.00.00.00.02")
	};
	
	// méthode qui retourne l'utilisateur dont on fournit l'identifiant
		public Adherent findAdhById (Integer idUtilisateur) {
			for (Adherent adherent : AdherentsDB) {
				if (adherent.getIdUtilisateur().equals(idUtilisateur)) {
					return adherent;
				}
			}
			return null;
		}

		//Tableau que des employés 
		private Employe [] EmployesDB =  {
				new Employe("Moissa","Marc",103,"mdp123", "pseudopasbanal","EMP0001",EnumCategorieEmploye.BIBLIOTHECAIRE),
				new Employe("Kestou","Jean",104,"mdpbidon", "pseudokelkonk","EMP0002",EnumCategorieEmploye.BIBLIOTHECAIRE),
				new Employe("Croch","Sarah",105,"mdpdrôle", "pseudoArevoir","EMP0003",EnumCategorieEmploye.RESPONSABLE)
		};
		
		// méthode qui retourne l'utilisateur dont on fournit l'identifiant
			public Employe findEmpById (Integer idUtilisateur) {
				for (Employe employe : EmployesDB) {
					if (employe.getIdUtilisateur().equals(idUtilisateur)) {
						return employe;
					}
				}
				return null;
			}
		
	
}
