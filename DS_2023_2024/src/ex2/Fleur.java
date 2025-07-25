package ex2;

public class Fleur extends Plante {
	private String couleur;
	private int moisF;
	
	public Fleur(String nom,double prix,int hauteur,int age,String couleur,int moisF){
		super(nom,prix,hauteur,age);
		this.couleur = couleur;
		this.moisF = moisF;
	}
	public void description()
	{
		System.out.println(toString()+" Couleur : "+couleur);
	}
	public void fleurir()
	{
		if(moisF == 4 || moisF == 5 ||moisF == 6)
			System.out.println(nom+" est en fleurs");
		else
			System.out.println(nom+" n'est pas en fleurs");
	}
	public String getCouleur() {
		return couleur;
	}
	
}