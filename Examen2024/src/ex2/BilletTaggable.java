package ex2;
import java.time.LocalDate;
import java.util.Arrays;
public class BilletTaggable extends Billet implements Taggable{
	private String LTags[];
	private int nbTags;
	private int capacite;
	BilletTaggable(LocalDate datePub, String auteur, int capacité){
		super(datePub,auteur);
		this.capacite=capacite;
		LTags = new String[capacite];
		nbTags = 0;
	}
	@Override
	public String toString() {
		return "BilletTaggable [LTags=" + Arrays.toString(LTags) + ", nbTags=" + nbTags + ", datePub=" + datePub+ ", auteur=" + auteur + "]";
	}
	
	public void ajoutTag(String tag) {
		if(nbTags < capacite && rechercheTag(tag)) 
			LTags[nbTags] = tag;
			nbTags++;
	}
	
	public boolean rechercheTag(String tag) {
		for(int i=0;i<capacite;i++) {
			if(LTags[i].equalsIgnoreCase(tag))
				return false;
		}
		return true;
	}
	
	public void supprimeTag(String tag){
		int pos = rechercheTagPos(tag);
        if (pos != -1) {
            for (int i = pos; i < nbTags - 1; i++) {
                LTags[i] = LTags[i+1];
            }
            LTags[nbTags-1] = null;
            nbTags--;
        }
        else
        	System.out.println("Cette Tag n'existe pas dans le tableau");
	} 
	
	public int rechercheTagPos(String tag) {
		for (int i = 0; i < nbTags; i++) {
            if (LTags[i].equalsIgnoreCase(tag)) {
                return i;
            }
        }
        return -1;
	}
	
	public int nombreTags(){
		return this.nbTags;
	}
	
}
