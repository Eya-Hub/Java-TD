package ex3;

public class Livre {
	private String titre, auteur; 
	private float nbPages;
	
	public Livre() {
		titre = "";
		auteur ="";
		nbPages = 0;
	}
	
	public Livre (String titre, String auteur) 
	{ 
	this.auteur = auteur;
	this.titre = titre;
	}
	public Livre(String titre, float nbPages) {
		this.titre = titre;
		this.nbPages = nbPages;
	}
	public Livre(String titre, String auteur, float nbPages) {
		this.auteur = auteur;
		this.titre = titre;
		this.nbPages = nbPages;
	}
	public String getAuteur() { 
		return auteur;
	}
	public String getTitre() { 
		return titre;
	}
	public float getNbPages() { 
		return nbPages;
	}
	public String setAuteur (String a) { 
		return auteur = a;
	}
	public String setTitre (String t) { 
		return titre = t;
	}
	public float setNbPages (float nb) { 
		if(nb<=20) {
			System.out.println("Le nombre indiqué est faible !");
			return nbPages;
		}
		else
		return nbPages = nb;
	}

	public String toString() {
		return String.format("Livre intitulé "+titre+" de "+auteur+", contenant "+nbPages);
	}
	public String decrire() {
		  return "Voici la description du livre : "+toString();
	}	
}
