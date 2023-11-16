package Arbre;

import java.util.ArrayList;

public class Noeud {
	
	String value;
	ArrayList<Noeud> children = new ArrayList<Noeud>();
	Noeud parent;
	
	public Noeud(String value, ArrayList<Noeud> children) {
		this.value = value;
	}
	
	public Noeud(String value) {
		this.value = value;
	}
	
	public void addChild(Noeud noeud) {
		children.add(noeud);
	}
}
