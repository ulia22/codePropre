package ex3;

/**
 * @author ETY9
 *
 */
public class LivretA extends CompteRemunere {
	/**
	 * Crée une livret A.
	 * @param solde solde du compte à la création
	 * @param tauxRemuneration du compte
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde, tauxRemuneration);
		
	}

	/* (non-Javadoc)
	 * @see ex3.CompteRemunere#appliquerRemuAnnuelle()
	 */
	@Override
	public void appliquerRemuAnnuelle(){
		this.solde = solde + solde*tauxRemuneration/100;
	}
}
