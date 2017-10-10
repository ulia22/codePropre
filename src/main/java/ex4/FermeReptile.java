package ex4;

/**
 * @author ETY9
 *
 */
public class FermeReptile extends ZoneAnimale{
	
	/**
	 * @return nb d'animaux dans la ferme à reptiles
	 */
	public int compterAnimaux(){
		return animaux.size();
	}
	
	public double calculerKgsNourritureParJour(){
		return animaux.size() * 0.1;
	}
}
