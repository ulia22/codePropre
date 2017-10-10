package ex2;

import java.util.Date;

/**
 * @author ETY9
 *
 */
public class ComptageStock {

	/** nbStocks : int */
	private int nbStocks;
	/** montantStocks : int */
	private int montantStocks;
	/** dateDebutComptage : Date */
	private Date dateDebutComptage;
	/** dateFinComptage : Date */
	private Date dateFinComptage;
	/** typeComptage : TypeComptage */
	private TypeComptage typeComptage;

	/**
	 * Ajoute un montant au montantStocks et met à jour nbStocks
	 * @param montant le montant à ajouter à la montantStocks
	 */
	public void ajouterMontant(int montant){
		nbStocks++;
		montantStocks +=montant;
	}

	/**
	 * Affiche le resultats (somme ou moyenne), la date de debut et la date de fin
	 */
	public void afficheStatutComptage(){

		affichageResultat();
		afficherDebut();
		afficherDateFin();
	}

	/**
	 * Vérifie que le type n'est pas nul avec de l'afficher
	 * @param type
	 */
	private void affichageResultat(){
		if(typeComptage != null){
			switch(typeComptage){
			case SOMME:
				afficherResultat(typeComptage.getLibel(), montantStocks);
				break;
			case MOYENNE:
				afficherResultat(typeComptage.getLibel(), (double)montantStocks/(double)nbStocks);
			break;
			default:
			}
		}
	}

	/**
	 * Afficher le resultat
	 * @param type de resultat
	 * @param res le resultat
	 */
	private void afficherResultat(String type, double res){
		System.out.println("Ce comptage est de type "+type);
		System.out.println("Nombre d'élements "+nbStocks);
		System.out.println("Résultat "+res);
	}

	/**
	 * Affiche la date de debut
	 */
	private void afficherDebut(){
		System.out.println(DateUtils.formaterDate(dateDebutComptage));
	}

	/**
	 * Affiche la date de fin
	 */
	private void afficherDateFin(){
		if (dateFinComptage!=null){
			System.out.println("Le comptage est clos depuis le "+DateUtils.formaterDate(dateFinComptage));
			if (nbStocks==0){
				System.out.println("Le comptage est clos mais n'a pas d'éléments. Le comptage est en anomalie.");
			}
			else {
				System.out.println("Le comptage est clos et est OK.");
			}
		}
		else {
			System.out.println("Le compte est actif.");
		}
	}
}
