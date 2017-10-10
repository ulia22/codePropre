/**
 * 
 */
package ex2;

/**
 * @author ETY9
 *
 */
enum TypeComptage {
	
	/** SOMME : TypeComptage */
	SOMME("SOMME"),
	/** MOYENNE : TypeComptage */
	MOYENNE("MOYENNE");
	
	/** libel : String */
	private String libel;
	
	/**
	 * Constructeur TypeComptage
	 * @param str
	 */
	TypeComptage(String str){
		libel = str;
	}

	/**
	 * Getter for libel.
	 * @return the libel
	 */
	public String getLibel() {
		return libel;
	}
	
}
