package metier;

public class BiblioException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BiblioException() {
		super("Erreur : Nombre de livre maximal déjà atteint");
	}
	
	public static void main(String[] args) {
		System.out.println(new BiblioException());
		}
	
}
