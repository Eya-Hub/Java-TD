package ex;

public class test {
	public static void main(String[] args) {
		Agence a1 = new Agence(5);
		Voiture v1 = new Voiture("BMW","X7",2009,200);
		Voiture v2 = new Voiture("Renaut","clio",1999,70);
		Voiture v3 = new Voiture("pegeut","208",2008,120);
		Voiture v4 = new Voiture("Renaut","Megan",2010,150);
		
		a1.Ajout(v1);
		a1.Ajout(v2);
		a1.Ajout(v3);
		a1.Ajout(v4);
		
		CriterePrix c1 = new CriterePrix(100);
		CritereMarque c2 = new CritereMarque("Renaut");
		System.out.println("critere de prix");
		a1.afficheSelection(c1);
		System.out.println("critere de marque");
		a1.afficheSelection(c2);
		
		
		
	}
}

