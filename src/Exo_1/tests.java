package Exo_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tests {

	// Question 2
	@Test
	void initiation_chaine() {
		Chaine chaine = new Chaine(4);
		chaine.inserer_noeud(new Noeud(10), 0);
		assertEquals(10, chaine.get_noeud_at_from_start(0).valeur);
	}
	
	@Test
	void initiation_double_chaine() {
		Chaine chaine = new Chaine(4);
		chaine.inserer_noeud(new Noeud(10), 0);
		assertEquals(10, chaine.get_noeud_at_from_start(0).valeur);
	}
	
	// Question 3
	@Test
	void get_avant_dernier_noeud() {
		Chaine chaine = new Chaine(5);
		assertEquals(4, chaine.get_avant_dernier_noeud().valeur);
	}

	// Question 4
	@Test
	void inverser_chaine() {
		Chaine chaine = new Chaine(4);
		chaine.inverser();
		assertEquals(4, chaine.get_noeud_at_from_start(0).valeur);
		assertEquals(3, chaine.get_noeud_at_from_start(1).valeur);
		assertEquals(2, chaine.get_noeud_at_from_start(2).valeur);
		assertEquals(1, chaine.get_noeud_at_from_start(3).valeur);
	}
	
	// Question 5
	@Test
	void concatenantion() {
		Chaine chaine = new Chaine(3);
		Chaine chaine2 = new Chaine(2);
		chaine.concatener(chaine2);
		assertEquals(1, chaine.get_noeud_at_from_start(0).valeur);
		assertEquals(2, chaine.get_noeud_at_from_start(1).valeur);
		assertEquals(3, chaine.get_noeud_at_from_start(2).valeur);
		assertEquals(1, chaine.get_noeud_at_from_start(3).valeur);
		assertEquals(2, chaine.get_noeud_at_from_start(4).valeur);
	}
	
	// Question 6
//	@Test
//	void inverser_deux_noeud() {
//		Chaine chaine = new Chaine(4);
//		chaine.inverser_deux_noeud(chaine.get_noeud_at_from_start(1), chaine.get_noeud_at_from_start(2));
//		assertEquals(1, chaine.get_noeud_at_from_start(0).valeur);
//		assertEquals(3, chaine.get_noeud_at_from_start(1).valeur);
//		assertEquals(2, chaine.get_noeud_at_from_start(2).valeur);
//		assertEquals(4, chaine.get_noeud_at_from_start(3).valeur);
//	}
	
	// Question 7 - voir package Double_Chaine
}




























