package Exo_1;

public class Noeud {
	int valeur;
	Noeud element_suivant = null;
	
	public Noeud(int valeur, int taille_chaine) {
		this.valeur = valeur;
		if (taille_chaine > 0) {
			this.element_suivant = new Noeud(this.valeur+1, taille_chaine-1);
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
