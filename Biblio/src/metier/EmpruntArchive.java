package metier;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class EmpruntArchive {
	/** Attribut qui tient la date d'emprunt*/
	private Date dateEmprunt;
	/** Attribut qui tient la date de retour*/
	private Date dateRestitutionEff;
	/** format de la date d'emprunt*/
	// Penser à utiliser des LocalDate pour fiabliliser le rendu des date quelque soit le type de classe !!!!
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	
	public EmpruntArchive(Date dateEmprunt, Date dateRestitutionEff) {
		this.dateEmprunt = dateEmprunt;
		this.dateRestitutionEff = dateRestitutionEff;
	}


	public Date getDateEmprunt() {
		return dateEmprunt;
	}


	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}


	public Date getDateRestitutionEff() {
		return dateRestitutionEff;
	}


	public void setDateRestitutionEff(Date dateRestitutionEff) {
		this.dateRestitutionEff = dateRestitutionEff;
	}

	

	@Override
	public String toString() {
		return "EmpruntArchive [dateEmprunt = " + dateEmprunt + ", dateRestitutionEff = " + dateRestitutionEff + " ]";
	}


	public static void main(String[] args) throws ParseException {
		
	}
	
	

}
