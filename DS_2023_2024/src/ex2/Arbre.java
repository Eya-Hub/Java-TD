package ex2;

public class Arbre extends Plante{
	private String type_Feuillage;
	private final double AbsorMoyenne = 22;
	
	public Arbre(String nom,double prix,int hauteur,int age,String type_Feuillage){
		super(nom,prix,hauteur,age);
		this.type_Feuillage = type_Feuillage;
	}
	
	public void description(){
		System.out.println(toString()+" Type de feuillage : "+type_Feuillage);
	}
	
	 public double absorptionCO2(){
		 if(hauteur > 5000)
			 return AbsorMoyenne + 3;
		 else
			 return AbsorMoyenne; 
	 }

	public String getType_Feuillage(){
		return type_Feuillage;
	}

}

