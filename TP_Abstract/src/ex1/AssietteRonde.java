package ex1;

public class AssietteRonde extends Assiette {
	private double rayon;
	public AssietteRonde(int annee,double rayon) {
		super(annee);
		this.rayon = rayon;
	}
	
	public double CalculerSurface(){
		return 3.14 * rayon * rayon;
	}
	
	public double ValeurInstensile() {
		if((2024-annee)<50)
			return 0;
		else
			return 2024-annee-50;
	}
}
