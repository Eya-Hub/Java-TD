package ex1;

public class Collection {

	public static void main(String[] args) {
		Ustensile[] us = new Ustensile[5];
		us[0] = new AssietteRonde(1926, 8.4);
		us[1] = new Cuillere(1881, 7.3);
		us[2] = new AssietteCarree(1935, 5.6);
		us[3] = new Cuillere(1917, 8.8);
		us[4] = new AssietteRonde(1837, 5.4);
		afficherCuilleres(us);
		afficherSurfaceAssiettes(us);
		afficherValeurTotale(us);
	}
	
	static void afficherCuilleres(Ustensile[] us) { 
	int nbCuilleres = 0;
	for (int i = 0; i < us.length; i++) {
		if(us[i] instanceof Cuillere)
			nbCuilleres++;
	}
	System.out.println("Il y a " + nbCuilleres + " cuillères.");
	}
	
	static void afficherSurfaceAssiettes(Ustensile[] us) {
		double totalSurface = 0;
		for (int i = 0; i < us.length; i++) {
			if(us[i] instanceof AssietteRonde)
				totalSurface += ((AssietteRonde) us[i]).CalculerSurface();
			else if (us[i] instanceof AssietteCarree)
				totalSurface += ((AssietteCarree) us[i]).CalculerSurface();
		}
		System.out.println("Surface totale des assiettes " + totalSurface);
	}
	
	static void afficherValeurTotale(Ustensile[] us) { 
		int ValeurTotal = 0;
		for (int i = 0; i < us.length; i++) {
			if(us[i] instanceof AssietteRonde)
				ValeurTotal+=((AssietteRonde) us[i]).ValeurInstensile();
			else if (us[i] instanceof Cuillere)
				ValeurTotal+=((Cuillere) us[i]).ValeurInstensile();
			else if (us[i] instanceof AssietteCarree)
				ValeurTotal+=((AssietteCarree) us[i]).ValeurInstensile();
		}
		System.out.println("Valeur totale de la collection :" + ValeurTotal);
		}

}
