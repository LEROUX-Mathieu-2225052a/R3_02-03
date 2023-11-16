package Double_chaine;

// pas fait question 1.8 et 1.9 1.10 (jsp) et 1.11

public class main {

	public static void main(String[] args){
		Chaine chaine = new Chaine(5);
		chaine.afficher();
		System.out.println("----");
		Chaine chaine2 = new Chaine(3);
		chaine.concatener(chaine2);
		chaine.afficher();
	}
}