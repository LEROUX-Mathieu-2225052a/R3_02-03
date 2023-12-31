package Exo_1;

public class Noeud {
	public int valeur;
	Noeud element_suivant = null;
	
	public Noeud(int valeur) {
		this.valeur = valeur;
	}
	
	public Noeud(int valeur, int taille_chaine) {
		this.valeur = valeur;
		if (taille_chaine > 0) {
			this.element_suivant = new Noeud(this.valeur+1, taille_chaine-1);
		} 
	}
	
	public Noeud(int valeur, Noeud element_suivant) {
		this.valeur = valeur;
		this.element_suivant = element_suivant;
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
