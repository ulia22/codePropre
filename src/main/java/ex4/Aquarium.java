package ex4;

/**
 * @author ETY9
 *
 */
public class Aquarium extends ZoneAnimale{
	
	/* (non-Javadoc)
	 * @see ex4.ZoneAnimale#calculerKgsNourritureParJour()
	 */
	@Override
	public double calculerKgsNourritureParJour() {
		return animaux.size() * 0.2;
	}
}
