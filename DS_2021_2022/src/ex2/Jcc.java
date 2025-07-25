package ex2;

public class Jcc {
	private Film competition[];
	private int annee, taille;
	private final int NBFMAX = 30;
	private int nbF = 0;
	
	public Jcc(int annee, int taille) {
		this.taille = taille;
		this.annee = annee;
		if(taille < NBFMAX)
			competition = new Film[taille];
	}
	public void ajoutFilm(Film f) {
		if(nbF<taille) {
			competition[nbF] = f;
			nbF++;
		}
		else
			System.out.println("La compétition est au complet.");
	} 
	public void listeFilmsJCC () {
		for(int i=0;i<nbF;i++) {
			System.out.println(competition[i].toString());
		}
	}
	public float totalVenteBilletsJCC () {
		float tarif = 0;
		for(int i=0;i<nbF;i++) {
			tarif +=competition[i].totalVenteBillets();
		}
		return tarif;
	} 
	
	public static void main(String[] args) {
		Jcc fest = new Jcc(2021,10);
		Film f1 = new Documentaire("Le dernier refuge","Ousman","Mali",86,"La guerre civile");
		f1.setNb_place(30);
		Film f2 = new Film("Insurrection", "Jilani Saadi", "Tunisie", 105);
		f2.setNb_place(45);
		fest.ajoutFilm(f1);
		fest.ajoutFilm(f2);
		System.out.println("Voici les films de JCC pour l'année 2021 :");
        fest.listeFilmsJCC();
        float total = fest.totalVenteBilletsJCC();
        System.out.println("Total des ventes de billets : " + total + " DT");
	}

}
