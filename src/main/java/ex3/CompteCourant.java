/**
 * 
 */
package ex3;

/**
 * @author ETY9
 *
 */
public class CompteCourant extends CompteBancaire {
	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert;
	
	/**
	 * @param solde
	 * @param decouvert
	 */
	public CompteCourant(double solde, double decouvert) {
		super(solde);
		this.decouvert = decouvert;
	}
	
	public void debiterMontant(double montant){
		if (this.solde - montant > decouvert){
			this.solde = solde - montant;
		}
	}

	/**
	 * Getter for decouvert.
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * Setter for decouvert
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
}
