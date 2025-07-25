package ex1;

public class CalculMoyenne {

	public static void main(String[] args) {
		int nb = 3;
		if((nb>0)&&(nb <= Tab.NMAX)){
			float[] noteCtrl = new float[nb];
			float[] noteExam = new float[nb];
			System.out.println("-----------------------------------");
			System.out.println("La saisie des notes des devoirs de control");
			Tab.remplir(noteCtrl);
			
			System.out.println("-----------------------------------");
			System.out.println("La saisie des notes des examens");
			Tab.remplir(noteExam);
			
			System.out.println("-----------------------------------");
			
			System.out.println("Voici l'affichage de tableaux des notes de control :");
			Tab.lister(noteCtrl);
			System.out.println("-----------------------------------");
			
			System.out.println("Voici l'affichage de tableaux des notes d'examens :");
			Tab.lister(noteExam);
			System.out.println("-----------------------------------");
			
			Tab.produit(2, noteExam);
			Tab.additionner(noteCtrl, noteExam);
			float[] moy = new float[nb];
			Tab.moyenne(3,noteExam,moy);
			System.out.println("-----------------------------------");
			
			System.out.println("Voici l'affichage de tableaux des moyennes :");
			Tab.lister(moy);
			System.out.println("-----------------------------------");
			
			float moyenne_classe = Tab.somme_element(moy)/nb;
			String new_moy = String.format("%.2f", moyenne_classe);
			System.out.println("Voici la moyenne de classe :"+new_moy);
			System.out.println("-----------------------------------");
			
			Tab.additionner(2, moy);
			System.out.println("Voici l'affichage de tableaux des moyennes apres la bonus :");
			Tab.lister(moy);
			System.out.println("-----------------------------------");
			float moy_cl = Tab.somme_element(moy)/nb;
			String new_moy2 = String.format("%.2f", moy_cl);
			System.out.println("Voici la moyenne de classe :"+new_moy2);
			System.out.println("-----------------------------------");
	}

	}

}
