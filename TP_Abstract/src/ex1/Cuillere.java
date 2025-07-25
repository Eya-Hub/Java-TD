package ex1;

public class Cuillere extends Ustensile {
	private double longueur;
	
	public Cuillere(int annee,double longueur) {
		super(annee);
		this.longueur=longueur;
	}
	
	public double ValeurInstensile() {
		if((2024-annee)<50)
			return 0;
		else
			return 2024-annee-50;
	}
}

