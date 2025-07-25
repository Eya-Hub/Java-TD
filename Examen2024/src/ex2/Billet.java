package ex2;
import java.time.LocalDate;
public class Billet implements Publiable {
	protected LocalDate datePub;
	protected String auteur;
	
	Billet(LocalDate datePub, String auteur) {
		this.datePub = datePub;
		this.auteur = auteur;
	}
	public LocalDate getDatePublication(){
		return this.datePub;
	}
	
	public String getAuteur()
	{
		return this.auteur;
	}
	@Override
	public String toString() {
		return "Billet [datePub=" + datePub + ", auteur=" + auteur + "]";
	}
	
}
