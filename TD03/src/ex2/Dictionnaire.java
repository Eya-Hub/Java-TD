package ex2;

public class Dictionnaire {

	private int nbMots;
	private String nom;
	private int indice = 0;
	private MotDico[] dico;
	
	public Dictionnaire(String nom, int nbMots){
		this.nom = nom;
		this.nbMots = nbMots;
		dico = new MotDico[nbMots];
	}
	
	public void ajouterMot(MotDico m){
		if(indice < nbMots) {
			dico[indice] = m;
			indice++;
		}
		else
			System.out.println("Impossible d'ajouter une autre mot !");
	} 
	public void supprimerMot(String ch){
			int pos = chercherMot(ch);
			if(pos != -1) {
				for(int i = pos;i<(indice-1);i++) {
					dico[i] = dico[i+1];
				}
				dico[indice - 1] = null;
				indice--;
				System.out.println("Mot supprimé : " + ch);
			}
			else
				System.out.println("Mot non trouvé : " + ch);	
	}
	
	public int chercherMot(String ch){
		for(int i = 0;i<indice;i++) {
			if(dico[i].getMot().equalsIgnoreCase(ch))
				return i;
		}
		return -1;
	}
	public void listerDico(){
		System.out.println("Contenu du dictionnaire --" + nom + "-- :");
		for(int i=0;i<indice;i++) {
			dico[i].afficher();
		}
	}
	
	public int nbSynonymes (MotDico m){
		int res = 0;
		for(int i=0;i<indice;i++) {
			if(dico[i].synonyme(m))
				res++;
		}
		return res;
	} 
	
	public static void main(String[] args) {
		Dictionnaire dic = new Dictionnaire("Larousse",5);
		dic.ajouterMot(new MotDico("Voiture","Véhicule utilisé pour se déplacer sur les routes"));
		dic.ajouterMot(new MotDico("Soleil","Étoile qui éclaire et réchauffe la Terre"));
		dic.ajouterMot(new MotDico("Chat","Petit animal domestique à poils"));
		dic.listerDico();
		int pos1 = dic.chercherMot("Ecole");
		if (pos1 == -1) 
            System.out.println("Mot non trouvé.");
		int pos2 = dic.chercherMot("soleil");
		if(pos2!=-1) 
			dic.dico[pos2].afficher();
		System.out.println("Nombre de synonymes de 'Chat' : " +dic.nbSynonymes(new MotDico("Chat", "Petit animal domestique à poils")));
		dic.supprimerMot("Voiture");

        System.out.println("Le contenue de dictionnaire après suppression du mot 'Voiture' :");
        dic.listerDico();
	}

}
