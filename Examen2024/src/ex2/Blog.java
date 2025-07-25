package ex2;

public class Blog {
	private String titre;
	private Publiable LBillets[];
	private int nbBillets,capacite;
	
	public Blog (String titre, int capacite){
		this.capacite=capacite;
		this.titre=titre;
		LBillets = new Publiable[capacite];
		nbBillets = 0;
	} 
	
	public void post(Publiable billet){
		if(nbBillets < capacite) 
			LBillets[nbBillets] = billet;
		nbBillets++;
	} 
	
	
	
	
	
	
	
	
	
	
	
}
