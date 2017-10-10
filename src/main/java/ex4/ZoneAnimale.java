/**
 * 
 */
package ex4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ETY9
 *
 */
public abstract class ZoneAnimale {
	/** animaux : List<Animal> */
	protected List<Animal> animaux;

	
	/**
	 * Crée une nouvelle zone animal.
	 */
	public ZoneAnimale() {
		super();
		this.animaux = new ArrayList<>();
	}

	/**
	 * Ajoute un animal dans la zone
	 * @param typeAnimal le type de l'animal ajouté
	 * @param nomAnimal le nom de l'animal ajouté
	 * @param comportement le comportement de l'animal ajouté
	 */
	public void addAnimal(TypeAnimal typeAnimal, String nomAnimal, ComportementAnimal comportement) {
		animaux.add(new Animal(nomAnimal, typeAnimal, comportement));
	}
	
	/**
	 * Affiche la liste des animauxprésent dans la zone
	 */
	public void afficherListeAnimaux(){
		for (Animal a: animaux){
			System.out.println(a.getNom());
		}
	}
	
	/**
	 * 
	 * @return kg de nourriture consommés chaque jours
	 */
	public abstract double calculerKgsNourritureParJour();
	
	/**
	 * Getter for animaux.
	 * @return the animaux
	 */
	public List<Animal> getAnimaux() {
		return animaux;
	}

	/**
	 * Setter for animaux
	 * @param animaux the animaux to set
	 */
	public void setAnimaux(List<Animal> animaux) {
		this.animaux = animaux;
	}
	
}
