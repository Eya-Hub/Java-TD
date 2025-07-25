package ex;

public class Agence {
	private Voiture [] Voitures ;
	private int nbrV;
	private final int MAX=5;
	public Agence(int nbrV) {
		this.nbrV = 0;
		Voitures = new Voiture[MAX];
		
	}
	
	public void afficheSelection(Critere c){
		for(int i=0;i<nbrV;i++) {
			if(c.estSatisfaitPar(Voitures[i]))
				System.out.println(Voitures[i]);
		}
		
	}
	
	public void Ajout(Voiture v) {
		
			if (nbrV < MAX) {
				Voitures[nbrV]=v;
				nbrV++;
			}
			else
				System.out.println("L'agence est au complet");
		}
	}

	



