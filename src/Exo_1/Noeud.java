package Exo_1;

public class Noeud {
	int valeur;
	Noeud element_suivant = null;
	
	public Noeud(int valeur) {
		this.valeur = valeur;
		if (this.valeur < 10) {
			this.element_suivant = new Noeud(this.valeur+1);
		}
	}
}
