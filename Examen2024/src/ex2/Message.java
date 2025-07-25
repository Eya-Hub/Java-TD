package ex2;
import java.time.LocalDate;
public class Message extends Billet {
	private String contenu;
	public Message(LocalDate datePub, String auteur, String contenu) {
		super(datePub,auteur);
		this.contenu = contenu;
	}
	public String getContenu() {
		return this.contenu;
	}
	public String toString() {
		return super.toString()+" contenu : "+this.contenu;
	}
	
	
	
}
