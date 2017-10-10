/**
 * 
 */
package ex4;

/**
 * @author ETY9
 *
 */
public class Animal {
	/** nom : String */
	private String nom;
	/** type : TypeAnimal */
	private TypeAnimal type;
	/** comportement : ComportementAnimal */
	private ComportementAnimal comportement;
	
	
	/**
	 * @param nom de l'animal
	 * @param type de l'animal
	 * @param comportement de l'animal
	 */
	public Animal(String nom, TypeAnimal type, ComportementAnimal comportement) {
		super();
		this.nom = nom;
		this.type = type;
		this.comportement = comportement;
	}
	
	/**
	 * Getter for nom.
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * Setter for nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * Getter for type.
	 * @return the type
	 */
	public TypeAnimal getType() {
		return type;
	}
	/**
	 * Setter for type
	 * @param type the type to set
	 */
	public void setType(TypeAnimal type) {
		this.type = type;
	}
	/**
	 * Getter for comportement.
	 * @return the comportement
	 */
	public ComportementAnimal getComportement() {
		return comportement;
	}
	/**
	 * Setter for comportement
	 * @param comportement the comportement to set
	 */
	public void setComportement(ComportementAnimal comportement) {
		this.comportement = comportement;
	}	
}
