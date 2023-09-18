package Exo_1;

public class Chaine {
	Noeud tete;
	int taille;
	
	public Chaine(int taille) {
		this.tete = new Noeud(1, taille-1);
		this.taille = taille;
	}
	
	public void afficher() {
		Noeud noeud_courant = tete;
		while (noeud_courant.is_last() == false) {
			System.out.println(noeud_courant.toString());
			noeud_courant = noeud_courant.element_suivant;
		}
		System.out.println(noeud_courant.toString());
	}
	
	public void inverser_noeud() {
		
	}
	
	public Noeud get_noeud_at_from_start(int pos) {
		if (pos >= this.taille) {
			return null;
		} 
		Noeud noeud_courant = tete;
		for (int i = 0; i < pos; i++) {
			noeud_courant = noeud_courant.element_suivant;
		}
		return noeud_courant;
	}
	
	public Noeud get_noeud_at_from_end(int pos) {
		if (pos >= this.taille) {
			return null;
		}
		Noeud noeud_courant = tete;
		Noeud noeud_courant_parcour = tete;
		while (true) {
			for (int i = 0; i < pos; i++) {
				noeud_courant_parcour = noeud_courant_parcour.element_suivant;
			}
			if (noeud_courant_parcour.element_suivant == null) {
				return noeud_courant;
			}
			noeud_courant = noeud_courant.element_suivant;
			noeud_courant_parcour = noeud_courant;
		}
	}
	
	public Noeud get_avant_dernier_noeud() {
		Noeud noeud_courant = tete;
		while (noeud_courant.element_suivant.element_suivant != null) {
			noeud_courant = noeud_courant.element_suivant;
		}
		return noeud_courant;
	}
}
