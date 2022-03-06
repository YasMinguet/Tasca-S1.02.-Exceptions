package lvl1_Ex4;

public class NameInvalidCharacter extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	NameInvalidCharacter(int numMinChar){
		super("El número mínimo de caracteres de la palabra debe ser " + numMinChar);
		
	}

}
