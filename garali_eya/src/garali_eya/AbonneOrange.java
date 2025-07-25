package garali_eya;

public class AbonneOrange extends Abonne{
	public AbonneOrange(int num,float solde,String nom) {
		super(num,solde,nom);
	}
	
	public String getOperateur() {
		if(num/100000000==5)
			return "Orange";
		else 
			return "Inconnu";
	}
	
	public boolean evoyerSMS() {
		if(solde <= 60) {
			solde-=60;
			return true;
		}
		else
			return false;
	}
	
	public boolean appeler(Abonne contact,int duree) {
		if(getOperateur().equals("Orange")){
			float cout = 90*duree;
			solde-=cout;
			return true;
		}
		else if(getOperateur().equals("Inconnu")){
			float cout = 180*duree;
			solde-=cout;
			return true;
		}
		else
			return false;
	}
}
