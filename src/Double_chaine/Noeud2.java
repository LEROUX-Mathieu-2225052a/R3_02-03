package Double_chaine;

public class Noeud2 {
	int valeur;
	Noeud2 element_suivant = null;
	Noeud2 element_precedent = null;
	
	public Noeud2(int valeur, int taille_chaine) {
		this.valeur = valeur;
		this.element_precedent = null;
		if (taille_chaine > 0) {
			this.element_suivant = new Noeud2(this.valeur+1, taille_chaine-1, this, null);
		} 
	}
	
	public Noeud2(int valeur, int taille_chaine, Noeud2 noeud_precedent, Noeud2 noeud_suivant) {
		this.valeur = valeur;
		this.element_precedent = noeud_precedent;
		if (noeud_precedent != null) {
			noeud_precedent.element_suivant = this;			
		}
		if (taille_chaine > 0) {
			this.element_suivant = new Noeud2(this.valeur+1, taille_chaine-1, this, null);
		} 
	}
	
	public String toString() {
		return "Noeud - valeur = " + this.valeur;
	}
	
	public void afficher() {
		System.out.println(this.toString());
	}
	
	public boolean is_last() {
		return (element_suivant == null);
	}
}
