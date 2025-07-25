package ex2;

public class ResultatRang {
	private int rang;

	public ResultatRang(int rang) {
		this.rang = rang;
	}
	
	@Override
	public String toString() {
		return "Resultat Rang [rang=" + rang + "]";
	}
	public void affiche() {
		System.out.println(toString());
	}
	
	public int comparTo(Resultat r) {
		if(r instanceof ResultatRang) {
			ResultatRang res = (ResultatRang) r;
			if(this.rang < res.rang)
				return 1;
			else if (this.rang > res.rang)
				return -1;
			else
				return 0;
		}
		else 
			return 404;
		
	}
}
