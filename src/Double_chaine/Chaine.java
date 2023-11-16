package Double_chaine;

public class Chaine {
	Noeud2 tete;
	Noeud2 queue;
	int taille;
	
	public Chaine(int taille) {
		this.tete = new Noeud2(1, taille-1);
		this.taille = taille;
		this.queue = this.get_noeud_at_from_start(taille-1);
	}
	
	public Noeud2 get_noeud_at_from_start(int pos) {
		if (pos >= this.taille) {
			return null;
		} 
		Noeud2 noeud_courant = tete;
		for (int i = 0; i < pos; i++) {
			noeud_courant = noeud_courant.element_suivant;
		}
		return noeud_courant;
	}
	
	public void concatener(Chaine chaine) {
		this.queue.element_suivant = chaine.tete;
	}
	
	public void afficher() {
		Noeud2 noeud_courant = tete;
		while (noeud_courant.is_last() == false) {
			System.out.println(noeud_courant.toString());
			noeud_courant = noeud_courant.element_suivant;
		}
		System.out.println(noeud_courant.toString());
	}
	
	public Noeud2 get_dernier_noeud() {
		Noeud2 noeud_courant = tete;
		while (noeud_courant.element_suivant != null) {
			noeud_courant = noeud_courant.element_suivant;
		}
		return noeud_courant;
	}
	
	public Noeud2 get_avant_dernier_noeud() {
		Noeud2 noeud_courant = tete;
		while (noeud_courant.element_suivant.element_suivant != null) {
			noeud_courant = noeud_courant.element_suivant;
		}
		return noeud_courant;
	}
	
	public void inserer_noeud(Noeud2 noeud, int pos) {
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
	
	public void inverser() {
		Noeud2 dernier_noeud;
		int cmp = 0;
		while (true) {
			dernier_noeud = this.get_dernier_noeud(); 	
			this.get_avant_dernier_noeud().element_suivant = null;		// mettre l'avt dernier a la fin	
			this.inserer_noeud(dernier_noeud, cmp);						// inserer le dernier noeud au debut de la liste
			++cmp;
			if (cmp == this.taille) break;
		}
	}
}



