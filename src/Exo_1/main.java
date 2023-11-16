package Exo_1;

public class main {

	public static void main(String[] args){
		Chaine chaine = new Chaine(3);
		Chaine chaine2 = new Chaine(3);
		//chaine.inserer_noeud(new Noeud(55, null), 4);
//		chaine.concatener(chaine2);
		chaine.inverser_deux_noeud(chaine.get_noeud_at_from_start(1), chaine.get_noeud_at_from_start(2));

		//chaine.inverser();
		chaine.afficher();
//		System.out.println("Avt dernier" + chaine.get_avant_dernier_noeud().toString());
//		chaine.get_noeud_at_from_start(9).afficher();
//		chaine.get_noeud_at_from_end(9).afficher(); -> erreur si fct renvoit null
	}
}