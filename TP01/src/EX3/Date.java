package EX3;
import java.util.Scanner;

public class Date {
	public static void main(String[] args) {
		MaDate d1 = new MaDate(26,2,2004);
		MaDate d2 = new MaDate(20,3,1966);
		MaDate d3 = new MaDate(1993);
		
		System.out.println("\n ---------------------\n");
		System.out.println("Les dates saisies sont :");
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		System.out.println(d3.toString());
		
		System.out.println("\n ---------------------\n");
		System.out.println("Utilisation des setters :");
		d1.setAnnee(2018);
		d1.setMois(6);
		d1.setJour(29);
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		System.out.println(d3.toString());
		
		System.out.println("\n ---------------------\n");
		System.out.println("Verification si 2 dates identiques :");
		int j1 = d1.getJour(); 
		int m1 = d1.getMois(); 
		int a1 = d1.getAnnee(); 
		int j2 = d2.getJour(); 
		int m2 = d2.getMois(); 
		int a2 = d2.getAnnee();
		if((j1 == j2)&&(m1 == m2)&&(a1 == a2))
			System.out.println("les 2 dates d1 et d2 sont identiques");
		else
			System.out.println("les 2 dates d1 et d2 ne sont identiques");
		
		Scanner obj = new Scanner(System.in);
		System.out.println("\n ---------------------\n");
		System.out.println("Choisir une opération :");
        System.out.println("[1] Ajout d'un jour");
        System.out.println("[2] Ajout de plusieurs jours");
        System.out.println("[3] Ajout d'un mois");
        System.out.println("[4] Ajout d'une année");
        System.out.println("\n ---------------------\n");
        int choix = obj.nextInt();
        switch (choix) {
        case 1:
            d1.ajouterUnJour();
            System.out.println("Nouvelle date d1 après l'ajout d'un jour : " + d1);
            break;
        case 2:
            System.out.println("Saisir le nombre des jours à ajouter : ");
            int nbJrs = obj.nextInt();
            d2.ajouterPlusieursJours(nbJrs);
            System.out.println("Nouvelle date d2 après l'ajout de " + nbJrs + " jours : " + d2);
            break;
        case 3:
            d3.ajouterUnMois();
            System.out.println("Nouvelle date d3 après l'ajout d'un mois : " + d3);
            break;
        case 4:
            d3.ajouterUnAn();
            System.out.println("Nouvelle date d3 après l'ajout d'une année : " + d3);
            break;
        default:
            System.out.println("Choix invalide");
    }
    obj.close();
    System.out.println("\n ---------------------\n");
	}
}
