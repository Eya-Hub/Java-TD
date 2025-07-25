package ex;

public class Voiture {
	private String marque;
	private String nom_model;
	private int annee_prod, prix_location;
	
	public Voiture(String marque,String nom_model,int annee_prod,int prix_location) {
		this.marque = marque; 
		this.nom_model = nom_model; 
		this.annee_prod = annee_prod; 
		this.prix_location = prix_location; 
	}

	@Override
	public String toString() {
		return "Voiture [marque=" + marque + ", nom_model=" + nom_model + ", prix_location=" + prix_location + "]";
	}

	public String getMarque() {
		return marque;
	}

	public int getPrix_location() {
		return prix_location;
	}
	
	
	
	
	
}

