package ex2;

public class Plante {
	protected String nom;
	protected double prix;
	protected int hauteur,age;

	public Plante(String nom,double prix,int hauteur,int age)
	{
		this.nom = nom;
		this.prix = prix;
		this.hauteur = hauteur;
		this.age = age;
	}
	
	public String toString()
	{
		return "Nom : "+nom+" Hauteur : "+hauteur+"cm"+" Âge : "+age+" Prix : "+prix+" dinars";
	}
	public void description()
	{
		System.out.println(toString());
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	
	

}
