package metier;


import java.util.Date;


public class Utilisateur extends Personne {
	/** Identifiant de l'utilisateur est un nombre entier*/
	private Integer idUtilisateur;
	/** Attribut mot de passe*/
	private String pwd;
	/** Attribut du pseudonyme*/
	private String pseudonyme;
	
	
	
	
	/*A déplacer dans la classe Adhérent*/
	
	/** Attribut de la durée max d'emprunt d'un livre*/
	//private Integer dureeMaxPret = 15;
	/** Attribut du nombre de prêt maximal autorisé*/
	//private static Integer nbMaxPrets = 3;
	
	
	
	
	
	/* A adapter au modèle dès la construction des classes correspondantes*/
	
	/** Liste des livres empruntés par l'utilisateur*/
	//private ArrayList<Livre> livres = new ArrayList<Livre>();
	/** Attribut dérivé de isPretEnRetard qui compte le nombre de retard d'emprunt*/
	//private Integer nbRetards = 0;
	/** Attribut dérivé du nombre de livre empruntés et s'il y a un retard*/
	///private boolean isConditionsPretAcceptees;
	
	
	public Utilisateur(String nom, String prenom, Date dateNaissance, String sexe,Integer idUtilisateur, String pwd, String pseudonyme) {
		super(nom, prenom, dateNaissance, sexe);
		this.idUtilisateur = idUtilisateur;
		this.pwd = pwd;
		this.pseudonyme = pseudonyme;
	}
	
	
	
	public Utilisateur(String nom, String prenom, Integer idUtilisateur, String pwd, String pseudonyme) {
		super(nom, prenom);
		this.idUtilisateur = idUtilisateur;
		this.pwd = pwd;
		this.pseudonyme = pseudonyme;
	}

	
	
	public Utilisateur(String nom, String prenom) {
		super(nom, prenom);
	}



	public Integer getIdUtilisateur() {
		return idUtilisateur;
	}


	public void setIdUtilisateur(Integer idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public String getPseudonyme() {
		return pseudonyme;
	}


	public void setPseudonyme(String pseudonyme) {
		this.pseudonyme = pseudonyme;
	}
	
	
	
	/* A conserver et adapter aux classes emprunts crées
	 * 
	 * 
	 * 
	public void setLivres (ArrayList<Livre> livres) {
		this.livres = livres;
	}
	
	
	public void addLivre(Livre livre) throws BiblioException  {
		if (livres.size() >= nbMaxPrets) {
			throw new BiblioException();
		} else if (livre.getEnumStatusLivre() == EnumStatutLivre.PRETE){
			System.out.println("Erreur : Livre non disponible");
		} else {
			livres.add(livre);	
			livre.setEnumStatusLivre(EnumStatutLivre.PRETE);
		}
	}
	
	public void clearLivres()  {
		if (livres.size() < 1 ) {
			System.out.println("Erreur : Rendu de livres impossible");
		} else {
			for (Livre c : livres) {
				c.setEnumStatusLivre(EnumStatutLivre.DISPONIBLE);
			}
			    livres.clear();  
		}
	}
	
	public Livre findLivreByTitre (String titre) {
		for (Livre find : livres) {
	        if (find.getTitre().equals(titre)) {
	            return find;
	        }
	    }
	    return null;
	}
	
	public ArrayList<Livre> findAllLivres () {
	         return livres;
	}
	
	
	public boolean containsLivre (Livre livre) {
		if (livre.getEnumStatusLivre() == EnumStatutLivre.PRETE) {
			return true;
		} else {
			return false;
		}
	}
	
	public void removeLivre(Livre livre) {
		if (livres.size() < 1) {
			System.out.println("Erreur : Aucun livre emprunté");
		} else if (!containsLivre(livre)){
			System.out.println("Erreur : Livre non emprunté");
		} else {
			livres.remove(livre);	
			livre.setEnumStatusLivre(EnumStatutLivre.DISPONIBLE);
		}
	}

	public String toString() {
		if (livres.size() > 0) {
			return "Utilisateur idUtilisateur=" + idUtilisateur + " : " + super.toString() + "\n Liste de livres empruntés : " +  "\n" + livres.toString();
		} else {
			return "Utilisateur idUtilisateur=" + idUtilisateur + " : " + super.toString() + "\n Aucun livre emprunté";
		}
	}
	
	private boolean isPretEnRetard(Livre livre) {
		Date dateEmprunt = livre.getDateEmprunt() ;
		int days = (int) (((new Date()).getTime() - dateEmprunt.getTime())/(1000 * 60 * 60 * 24)); 
		if (days > dureeMaxPret) {
			nbRetards++;
			return true;
			} else {
				return false;
		}
	}
	
	public int getNbRetards() {
	    for(Livre l : livres) {
	    	l.getDateEmprunt();
	        this.isPretEnRetard(l);
	    }
	    return nbRetards;
	}
	
	public boolean isConditionsPretAcceptees () {
		 for(Livre l : livres) {
		if (this.isPretEnRetard(l) || livres.size() >= 3) {
			isConditionsPretAcceptees = false;
		} else {
			isConditionsPretAcceptees = true;
		}
	}
		 return isConditionsPretAcceptees;
}	
	*/
	public static void main(String []args) throws BiblioException  {
		
	}
}
