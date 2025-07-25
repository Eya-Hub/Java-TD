package ex1;

public abstract class Ustensile {
	protected int annee;
	
	public Ustensile(int annee) {
		this.annee = annee;
	}
	public int getAnnee() {
		return this.annee;
	}
	public abstract double ValeurInstensile();
}

