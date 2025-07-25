package ex2;

public class Athlete {
	private int id ;
	private String nom ;
	private Resultat resultat ;
	
	public Athlete(int id, String nom ){
	this.id=id ;
	this.nom = nom ;
	resultat=null ;
	}
	
	public int getId() {
	return this.id;
	}
	
	public void setId(int id) {
	this.id = id;
	}

	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom){
	this.nom = nom;
	}
	
	public Resultat getResultat() {
	return this.resultat;
	}

	public void setResultat(Resultat resultat) {
		this.resultat = resultat;
	}
	
}
