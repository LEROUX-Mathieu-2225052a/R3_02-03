package Exo_1;

public class main {

	public static void main(String[] args){
		Noeud tete = new Noeud(1);
		Noeud noeud_courant = tete;
		while (true) {
			noeud_courant.toString();
			noeud_courant = noeud_courant.element_suivant;
			if (noeud_courant.element_suivant != null) {
				break;
			}
		}
	}
}