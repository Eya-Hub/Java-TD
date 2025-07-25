package ex2;

public class ResultatDistance implements Resultat{
	private double distance;
	
	public ResultatDistance(int distance) {
		this.distance = distance;
	}
	public String toString() {
		return "Resultat Distance [distance=" + distance + "]";
	}
	
	public void affiche() {
		System.out.println(toString());
	}
	
	public int comparTo(Resultat r) {
		ResultatDistance res = (ResultatDistance) r;
		if(r instanceof ResultatDistance) {
			if(this.distance > res.distance)
				return 1;
			else if (this.distance < res.distance)
				return -1;
			else
				return 0;
		}
		else 
			return 404;
		
	}
	
}
