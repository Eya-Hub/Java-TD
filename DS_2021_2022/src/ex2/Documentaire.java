package ex2;

public class Documentaire extends Film {
	private String sujet;
	private static final float tarif = 2;
	
	public Documentaire(String titre, String realisateur, String pays,int duree, String sujet) {
		super(titre,realisateur,pays,duree);
		this.sujet = sujet;
	}
	
	public String toString() {
		return  super.toString()+" sujet : "+sujet;
	}
	
	public float totalVenteBillets () {
		return (nb_place * tarif);
		
	} 
}
