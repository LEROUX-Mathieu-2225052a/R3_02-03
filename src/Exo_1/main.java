package Exo_1;

public class main {

	public static void main(String[] args){
		Chaine chaine = new Chaine(10);
		Noeud noeud_courant = chaine.tete;
//		chaine.afficher();
//		System.out.println("Avt dernier" + chaine.get_avant_dernier_noeud().toString());
		chaine.get_noeud_at_from_start(9).afficher();
//		chaine.get_noeud_at_from_end(9).afficher(); -> erreur si fct renvoit null
	}
}