/**
 * 
 */
package ex3;

/**
 * @author ETY9
 *
 */
public abstract class CompteRemunere extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	protected double tauxRemuneration;
	
	/**
	 * @param solde
	 * @param tauxRemuneration
	 */
	public CompteRemunere(double solde, double tauxRemuneration) {
		super(solde);
		this.tauxRemuneration = tauxRemuneration;
	}


	/* (non-Javadoc)
	 * @see ex3.CompteBancaire#debiterMontant(double)
	 */
	@Override
	public void debiterMontant(double montant){
		if (this.solde - montant > 0){
			this.solde = solde - montant;
		}	
	}


	/**
	 * Getter for tauxRemuneration.
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Applique le taux de rémunération au compte remunéré.
	 */
	public abstract void appliquerRemuAnnuelle();

	/**
	 * Setter for tauxRemuneration
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
