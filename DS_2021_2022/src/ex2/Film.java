package ex2;
import java.util.Scanner;

public class Film {
	protected String titre,realisateur,pays;
	protected int duree, nb_place;
	
	public int getNb_place() {
		return nb_place;
	}
	public void setNb_place(int nb_place) {
		this.nb_place = nb_place;
	}
	
	public String toString() {
		return titre + " de " + realisateur + " (" + pays + ") - " + duree+"Min -";
	}
	
	public Film(String titre, String r, String pays, int d) {
		this.titre = titre;
		realisateur = r;
		this.pays = pays;
		duree = d;
	}
	
	public float totalVenteBillets() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir le nombre de places reservées pour les etudiants :");
		int nb_etud = sc.nextInt();
		sc.close();
		if(nb_etud <= nb_place) {
			int nb_public = nb_place - nb_etud;
			return (nb_etud * 2 + nb_public * 3);
		}
		else
			System.out.println("Vérifiez le nombre des etudiants !");
		return 0;
		
		
	} 

}
