package ex2;

public class Pepiniere{
	private Plante inventaire[];
	private final int MAX_PLANTES = 1000;
	public static int nombreDePlantes;
	
	public Pepiniere(){
		inventaire = new Plante[MAX_PLANTES];
		nombreDePlantes = 0;
	}
	
	public void ajoutPlante(Plante plante){
		if(nombreDePlantes < MAX_PLANTES){
			inventaire[nombreDePlantes] = plante;
			nombreDePlantes++;
		}
		else
			System.out.println("L'inventaire est au complet!");
	}
	
	public void afficherInventaire(){
		for(int i=0;i<nombreDePlantes;i++){
			inventaire[i].description();
			if(inventaire[i].getClass().getSimpleName().equals("Fleur"))
				((Fleur) inventaire[i]).fleurir();
		}
	}
	
	public double totalAbsorptionTotaleCO2(){ 
		double total = 0;
		for(int i=0;i<nombreDePlantes;i++){
			if(inventaire[i].getClass().getSimpleName().equals("Arbre"))
				 total +=((Arbre) inventaire[i]).absorptionCO2();
		}
		return total;
	}
	
	public int compterArbresCaduques(){ 
		int num = 0;
		for(int i=0;i<nombreDePlantes;i++){
			if(inventaire[i].getClass().getSimpleName().equals("Arbre"))
				if(((Arbre) inventaire[i]).getType_Feuillage().equalsIgnoreCase("caduque"))
					num++;
		}
		return num;
	}
	
	public static void main(String[] args) {
        System.out.println("        Pépinière GREEN HANDS");
        Pepiniere pépinière = new Pepiniere();
        Fleur rose = new Fleur(null,15.99, 12,30,"Rouge", 2);
        Fleur tulipe = new Fleur("Tulipe",12.99, 8, 20,"Jaune", 4);
        Arbre chêne = new Arbre("Chêne",89.99, 60, 200,"Caduque");
        Arbre sapin = new Arbre("Sapin",59.99,30, 150, "Persistant");
        rose.setNom("Rose");
        System.out.println("la "+rose.getNom()+" a le couleur "+rose.getCouleur());
        pépinière.ajoutPlante(rose);
        pépinière.ajoutPlante(tulipe);
        pépinière.ajoutPlante(chêne);
        pépinière.ajoutPlante(sapin);
        pépinière.afficherInventaire();
        System.out.println("Total Aborption CO2        "+   pépinière.totalAbsorptionTotaleCO2());
        System.out.println("Nombre d'arbres Caduques dans la pépinière : " +pépinière.compterArbresCaduques());
    }
}
