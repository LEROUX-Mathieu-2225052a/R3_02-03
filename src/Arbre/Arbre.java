package Arbre;

import java.util.ArrayList;
import java.util.Map;

public class Arbre {
	
	Noeud head;
	ArrayList<Noeud> noeuds = new ArrayList<Noeud>();
	
	public Arbre(String headName, Map<String, ArrayList<String>> map) {
		this.noeuds = genererArbre(headName, map);
	}
	
	private ArrayList<Noeud> genererArbre(String headName, Map<String, ArrayList<String>> noeuds) {
		ArrayList<Noeud> children = new ArrayList<Noeud>();
		for (int i = 0; i < noeuds.get(headName).size(); i++) {
			String name = noeuds.get(headName).get(i);
			children.add(new Noeud(name, genererArbre(name, noeuds)));
		}
		return children;
	}

}
