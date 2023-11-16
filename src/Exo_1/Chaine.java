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
	
	public void inserer_noeud(Noeud noeud, int pos) {
		if (pos == 0) {
			noeud.element_suivant = tete;
			tete = noeud;
		} else if (pos >= taille) {
			System.out.println("Position Erronée");
		} else {
			noeud.element_suivant = this.get_noeud_at_from_start(pos);
			this.get_noeud_at_from_start(pos-1).element_suivant = noeud;
		}
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

	
	public Noeud get_dernier_noeud() {
		Noeud noeud_courant = tete;
		while (noeud_courant.element_suivant != null) {
			noeud_courant = noeud_courant.element_suivant;
		}
		return noeud_courant;
	}
	
	public Noeud get_avant_dernier_noeud() {
		Noeud noeud_courant = tete;
		while (noeud_courant.element_suivant.element_suivant != null) {
			noeud_courant = noeud_courant.element_suivant;
		}
		return noeud_courant;
	}
	
	public void inverser() {
		Noeud dernier_noeud;
		int cmp = 0;
		while (true) {
			dernier_noeud = this.get_dernier_noeud(); 	
			this.get_avant_dernier_noeud().element_suivant = null;		// mettre l'avt dernier a la fin	
			this.inserer_noeud(dernier_noeud, cmp);						// inserer le dernier noeud au debut de la liste
			++cmp;
			if (cmp == this.taille) break;
		}
	}
	
	public void concatener(Chaine chaine) {
		this.get_dernier_noeud().element_suivant = chaine.tete;
		this.taille += chaine.taille;
	}
	
	public void inverser_deux_noeud(Noeud noeud1, Noeud noeud2) {
		int pos1 = 0; // pos noeud 1
		int pos2 = 0; // pos noeud 2
		Noeud noeud_courant = tete;
		int pos = 0;
		while (noeud_courant.element_suivant != null) {
			if (noeud_courant.element_suivant == noeud1) {
				pos1 = pos;
			} else if (noeud_courant.element_suivant == noeud2) {
				pos2 = pos;
			}
			noeud_courant = noeud_courant.element_suivant;
		}
		if (pos1 < pos2) {
			this.get_noeud_at_from_start(pos2-1).element_suivant = noeud1;
			this.get_noeud_at_from_start(pos1-1).element_suivant = noeud2;
		} else  {
			this.get_noeud_at_from_start(pos1-1).element_suivant = noeud2;
			this.get_noeud_at_from_start(pos2-1).element_suivant = noeud1;
		}
		// inverse les elements suivants des noeuf precedents
		
		// inverse les elements suivants
		Noeud elem_suivant_noeud1 = noeud1.element_suivant;
		this.get_noeud_at_from_start(pos1).element_suivant = noeud2.element_suivant;
		this.get_noeud_at_from_start(pos2).element_suivant = elem_suivant_noeud1;
	}
	
//	public boolean is_equal(Chaine chaine) {
//		
//	}
}
