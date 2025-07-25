package ex2;

public interface Taggable {
	void ajoutTag(String tag);
	void supprimeTag(String tag); 
	int nombreTags();  
	boolean rechercheTag(String tag);
}
