package ex6;

/**
 * Encapsule un array dans un conteneur pour lui fournir des méthodes utiles, afin de rendre sa manipulation plus intuitive.
 * @author ETY9
 *
 */
public class Conteneur {

	/** 
	 * Est-ce que le conteneur est en read-only?
	 * readOnly : boolean */
	private boolean readOnly;

	/** elements : Object[] */
	private Object[] elements;
	/**
	 * La taille officielle du tableau
	 *  size : int */
	private int size;

	/**
	 * Ajoute un élément dans le tableau, l'agrandit d'un case au passage.
	 * @param element à ajouter dans le tableau
	 */
	public void add(Object element) {
		if (readOnly) {
			return;
		}
		agrandirTb();
		elements[size++] = element;
	}

	/**
	 * Agrandit le tableau du 1.
	 */
	private void agrandirTb() {
		Object[] newElements = new Object[size + 10];
		for (int i = 0; i < size; i++) {
			newElements[i] = elements[i];
		}
		elements = newElements;
	}

	/**
	 * Retourne un sous tableau du tableau tab qui contient les élément du tableau tab entre lowBoundarie et highBoundarie
	 * @param lowBoundarie la frontiere basse des éléments à copier du tableau original
	 * @param highBoundarie la frontiere haute des élément à copier du tableau original
	 * @param tab le tableau original à partir duquel un sous-tableau sear fait
	 * @return le sous tableau contenant les élément du tableau original en low et high boundarie.
	 */
	private Object[] subArray(int lowBoundarie, int highBoundarie, Object [] tab){
		if(lowBoundarie >= highBoundarie
				|| lowBoundarie < 0
				|| highBoundarie >= tab.length-1){
			return new Object[0];
		}

		Object[] subTab = new Object[highBoundarie - lowBoundarie ];
		for(int i = lowBoundarie, j = 0; i < highBoundarie; i++, j++){
			subTab[j] = tab[i];
		}
		return subTab;
	}
	
	/**
	 * Copy dans le tab2 dans tab1 à l'index copyAt
	 * @param tab1 qui recoit la copie
	 * @param copyAt index ou sera copié le tableau
	 * @param tab2 tableau copié
	 */
	private void copyInAt(Object[]tab1,int copyAt ,Object[]tab2){
		if(tab1.length-copyAt < tab2.length){
			return;
		}
		for(int i = 0; i < tab2.length; i++){
			tab1[i+copyAt] = tab2[i];
		}
	}


	/**
	 * Supprime un élément du tableau
	 * @param indexToRemove index de l'élément à supprimer.
	 */
	public void remove(int indexToRemove) {
		if (indexToRemove < 0 && indexToRemove >= size) {
			return;
		}
		Object[] newArray = new Object[size - 1];
		Object[] avant = subArray(0, indexToRemove, elements);
		Object[] apres = subArray(indexToRemove+1, size, elements);
		
		copyInAt(newArray, 0, avant);
		copyInAt(newArray, avant.length, apres);
		size--;
		elements = newArray;
	}

	/**
	 * Retourne un élément du tableau
	 * @param i index de l'élément à retourner
	 * @return élément retourné
	 */
	public Object getContent(int i) {
		return elements[i];
	}

	/**
	 * Retourne la taille du tableau
	 * @return taille du tableau.
	 */
	public int getSize() {
		return size;
	}
}
