package ex4;

public class testLivre {

	public static void main(String[] args) {
		Livre[] Tab = new Livre[3];
		Tab[0] = new Livre(" L'alchimiste","Paulo Coelho",225,0.00);
		Tab[1] = new Livre(" La tunisie",508);
		Tab[2] = new Livre("Harry Potter","JK Rowling");
		for (int i=0;i<Tab.length;i++) {
	        System.out.println(Tab[i].decrire());
		}
		System.out.println("\n ---------------------\n");
		
        Tab[0].setPrix(23.55); 
        System.out.println("Prix du premier livre après fixation : " + Tab[0].getPrix());
        Tab[0].setPrix(12.99); 
        System.out.println("Le resultat de modification du prix la 2eme fois : " + Tab[0].getPrix());

        System.out.println("\n----------------------\n");
        System.out.println("Voici le tableau après les changements :");
        for (int i=0;i<Tab.length;i++) {
	        System.out.println(Tab[i].decrire());
		}

	}

}
