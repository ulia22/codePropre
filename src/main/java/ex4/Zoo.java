package ex4;

public class Zoo {

	private String nom;
	private ZoneAnimale savaneAfricaine;
	private ZoneAnimale zoneCarnivore;
	private ZoneAnimale fermeReptile;
	private ZoneAnimale aquarium;
	
	public Zoo(String nom){
		this.nom = nom;
		this.savaneAfricaine = new SavaneAfricaine();
		this.zoneCarnivore = new ZoneCarnivore();
		this.fermeReptile = new FermeReptile();
		this.aquarium = new Aquarium();
		
	}
	
	public void addAnimal(String nomAnimal, TypeAnimal typeAnimal, ComportementAnimal comportement){
		if (typeAnimal.equals(TypeAnimal.MAMMIFERE) && comportement.equals(ComportementAnimal.CARNIVORE)){
			zoneCarnivore.addAnimal(typeAnimal, nomAnimal, comportement);
		}
		else if (typeAnimal.equals(TypeAnimal.MAMMIFERE) && comportement.equals(ComportementAnimal.HERBIVORE)){
			savaneAfricaine.addAnimal(typeAnimal, nomAnimal, comportement);
		}
		else if (typeAnimal.equals(TypeAnimal.REPTILE)){
			fermeReptile.addAnimal(typeAnimal, nomAnimal, comportement);
		}
		else if (typeAnimal.equals(TypeAnimal.POISSON)){
			aquarium.addAnimal(typeAnimal, nomAnimal, comportement);
		}
	}
	
	public void afficherListeAnimaux(){
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
