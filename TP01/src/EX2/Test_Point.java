package EX2;

public class Test_Point {

	public static void main(String[] args) {
		Point p1;
		p1 = new Point (3, 5);
		Point p2 = new Point ("a");
		Point p3 = new Point ("b", 3,5);
		
		System.out.println("\n ---------------------\n");
		System.out.println("les points créés sont :");
		p1.Affiche (); 
		p2.Affiche (); 
		p3.Affiche ();
		
		System.out.println("\n ---------------------------\n");
		System.out.println("translation des point ");
		p1.TranslHoriz (4);
		p2.TranslVert (3);
		p3.Translation(5, 2);
		p1.Affiche ();
		p2.Affiche (); 
		p3.Affiche ();
		
		System.out.println("\n---------------------------\n"); 
		if(p1.Coincide(p3) == true)
		System.out.println("Les 2 points p1 et p3 coïncident");
		else
		System.out.println("Les 2 points ne coïncident pas");
		
		System.out.println("\n ---------------------------\n");
		System.out.println("utilisation des méthodes get");
		String x=p1.getNom();
		int y=p1.getAbscisse();
		int z=p1.getOrdonnee();
		System.out.println(" le nom du point p1 est : " + x);
		System.out.println(" son abscisse est : " + y);
		System.out.println(" son ordonnée est : " + z);	
		
		System.out.println("\n ---------------------------\n");
		System.out.println("modification des attributs des points") ;
		p1.setNom("SRI21");
		p2.setAbscisse(25);
		p3.setOrdonnee(50);
		p1.Affiche ();
		p2.Affiche ();
		p3.Affiche ();
		
		/*
		p3.Nom="Test" ;
		p3.Abs=2 ;
		p3.Ord=4 ;   
		==> On peut acceder ces attributs car ils sont privees */

	}

}
