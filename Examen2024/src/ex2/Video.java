package ex2;
import java.time.LocalDate;
public class Video extends BilletTaggable{
	private String url;

	public Video(LocalDate datePub, String auteur, int capacité, String url) {
		super(datePub, auteur, capacité);
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	@Override
	public String toString() {
		return "Video [ "+ super.toString()+ ", url=" + url + "]";
	}

}
