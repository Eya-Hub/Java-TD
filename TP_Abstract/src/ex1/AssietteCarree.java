package ex1;

public class AssietteCarree extends Assiette {
	private double cote;
	public AssietteCarree(int annee,double cote) {
		super(annee);
		this.cote = cote;
	}
	
	public double CalculerSurface() {
		return cote * cote;
	}
	
	public double ValeurInstensile() {
		if((2024-annee)<50)
			return 0;
		else
			return (2024-annee-50)*5;
	}
}

