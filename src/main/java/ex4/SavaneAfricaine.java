package ex4;

/**
 * @author ETY9
 *
 */
public class SavaneAfricaine extends ZoneAnimale{

	/* (non-Javadoc)
	 * @see ex4.ZoneAnimale#calculerKgsNourritureParJour()
	 */
	public double calculerKgsNourritureParJour(){
		return animaux.size() * 10.0;
	}
}
