package EX3;

public class MaDate {
private int jour, mois, annee;
	
	public MaDate(int jour, int mois, int annee) {//Constructeur N°1
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}
	
	public MaDate(int annee) {//Constructeur N°2
		jour = 1;
		mois = 1;
		this.annee = annee ;
	}
	//les getters
	public int getAnnee() {
		return annee;
	}
	
	public int getMois() {
		return mois;
	}

	public int getJour() {
		return jour;
	}
	
	//les stters
	public void setAnnee(int a) {
		this.annee = a;
	}
	
	public void setMois(int m) {
		this.mois = m;
	}
	
	public void setJour(int j) {
		this.jour = j;
	}
	
	//la methode toString()
	public String toString() {
		return String.format("%02d/%02d/%04d", jour, mois, annee);
	}
	
	public void ajouterUnJour() {
        jour++; 
        if (mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10) {
            if (jour > 31) {
                jour = 1;
                mois++;
            }
        } else if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
            if (jour > 30) {
                jour = 1;
                mois++;
            }
        } else if (mois == 2) {
            if (estBissextile(annee)) {
                if (jour > 29) {
                    jour = 1;
                    mois++;
                }
            } else {
                if (jour > 28) {
                    jour = 1;
                    mois++;
                }
            }
        }

        if (mois > 12) {
            mois = 1;
            annee++;
        }
    }

	public boolean estBissextile(int annee) {
		return (annee % 4 == 0 && (annee % 100 != 0 || annee % 400 == 0));
	}
	
	public void ajouterPlusieursJours(int n) {
		for(int i=0;i<n;i++) {
			ajouterUnJour();
		}
	}
	
	public void ajouterUnMois() {
		if(mois == 12) {
			mois = 1;
			annee++;
		}
		else 
			mois++;
	}
	
	public void ajouterUnAn() {
		annee++;
	}	
}
