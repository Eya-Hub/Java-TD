package ex2;

public class Epreuve {
	private int Max,nbEff;
	private String denomination;
	private boolean etat;
	private Athlete[] Participants;
	
	
	public Epreuve(String denomination,int Max) {
		this.denomination = denomination;
		this.Max = Max;
		this.Participants = new Athlete[Max];
		this.nbEff = 0;
		this.etat = false;
	}
	
	public void ajoutAthlete(Athlete a) {
		if(nbEff<Max) {
			Participants[nbEff] = a;
			nbEff++;
		}
		else 
			System.out.println("L'epreuve est au complet !");
	}
	
	public void terminer() {
		etat = true;
	}
	
	public boolean  estTerminee() {
		if(etat)
			return true;
		else
			return false;
	} 
	
	
	
	public String toString() {
		String E="";
		String ch="";
		for(int i=0;i<nbEff;i++) {
			ch =ch +Participants[i].getNom()+",";
		}
		
		if(estTerminee())
			E = "Terminee";
		else 
			E = "Non Terminee";
		
	    return "Denomination : "+this.denomination+" Etat : "+E+" Nom des participants: "+ch;
	}
	
	public Resultat getRecordOlymique() {
		Resultat best = Participants[0].getResultat(); 
		for(int i=0;i<nbEff;i++) {
			if(Participants[i].getResultat().comparTo(best)==1)
				best = Participants[i].getResultat();	
		}
		return best;
	}
	
	public Athlete  getVinqueur() {
		Athlete gagnant = null;
		if(estTerminee()) {
			for(int i=0;i<nbEff;i++) {
				if(Participants[i].getResultat() == getRecordOlymique())
					gagnant = Participants[i];
			}
		}
		return gagnant;
	}
	
	public void fixeResultat(int id, Resultat r) {
		
	}
	
	public Resultat getResultat(int id) {
		for(int i=0;i<nbEff;i++) {
			if(Participants[i].getId()==id)
				if(Participants[i].getResultat()==0)
					return 
				return Participants[i].getResultat();
					
		}
	} 
	
}
	
