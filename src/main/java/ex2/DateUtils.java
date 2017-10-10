/**
 * 
 */
package ex2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ETY9
 * Final pour prévenir l'héritage
 */
public final class DateUtils {

	/**
	 * Constructeur privé vide pour prévenir l'instanciation.
	 */
	private DateUtils(){}
	
	/**
	 * Retourne la version string d'une date.
	 * @param d date qui sera convertie en string
	 * @return la date convertie
	 */
	public static String formaterDate(Date d){
		if(d == null){
			return null;
		}
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return f.format(d);
	}
}
