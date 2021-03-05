package test;

import java.text.ParseException;

import metier.EnumStatusExemplaire;
import metier.Exemplaire;

public class TestExemplaire {

	public static void main(String[] args) throws ParseException {
		Exemplaire ex1 = new Exemplaire();
		Exemplaire ex2 = new Exemplaire(1,Exemplaire.sdf.parse("01/03/2021"),EnumStatusExemplaire.DISPONIBLE, "EX0000001");
		System.out.println(ex1 + "\n" + ex2);

	}

}
