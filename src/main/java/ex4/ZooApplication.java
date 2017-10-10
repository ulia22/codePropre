package ex4;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal("Gazelle", TypeAnimal.MAMMIFERE, ComportementAnimal.HERBIVORE);
		zoo.addAnimal("Zèbre",TypeAnimal.MAMMIFERE, ComportementAnimal.HERBIVORE);
		zoo.addAnimal("Lion", TypeAnimal.MAMMIFERE, ComportementAnimal.HERBIVORE);
		zoo.addAnimal("Panthère", TypeAnimal.MAMMIFERE, ComportementAnimal.CARNIVORE);
		zoo.addAnimal("Requin blanc", TypeAnimal.POISSON, ComportementAnimal.HERBIVORE);
		zoo.addAnimal("Truite dorée", TypeAnimal.POISSON, ComportementAnimal.HERBIVORE);
		zoo.addAnimal("Boa constrictor", TypeAnimal.REPTILE, ComportementAnimal.CARNIVORE);
		zoo.addAnimal("Python", TypeAnimal.REPTILE, ComportementAnimal.CARNIVORE);
	}

}
