package metier;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EmpruntEnCours {
	/** Attribut de la date d'emprunt d'un exemplaire*/
	private Date dateEmprunt;
	/** format de la date d'emprunt*/
	@SuppressWarnings("unused")
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	/** Attribut qui retourne l'utilisateur qui emprunte*/
	Utilisateur u;
	/**Attribut qui retourne l'exemplaire emprunté*/
	Exemplaire ex;
	
	
	
	
	public EmpruntEnCours(Date dateEmprunt, Utilisateur u, Exemplaire ex) {
		this.dateEmprunt = dateEmprunt;
		this.u = u;
		this.ex = ex;
	}
	
	public EmpruntEnCours() {
	}
	

	public Utilisateur getU() {
		return u;
	}

	public void setU(Utilisateur u) {
		this.u = u;
	}

	public Exemplaire getEx() {
		return ex;
	}

	public void setEx(Exemplaire ex) {
		this.ex = ex;
	}

	public Date getDateEmprunt() {
		return dateEmprunt;
	}

	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}

	@Override
	public String toString() {
		return "EmpruntEnCours [ dateEmprunt = " + dateEmprunt + ", utilisateur = " + u + ", exemplaire = " + ex + " ]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
