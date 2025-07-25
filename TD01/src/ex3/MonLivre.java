package ex3;

public class MonLivre {

	public static void main(String[] args) {
		Livre[] Tab = new Livre[3];
		Tab[0] = new Livre(" L'alchimiste","Coelho",225);
		Tab[1] = new Livre(" La tunisie",508);
		Tab[2] = new Livre("Harry Potter","JK Rowling");
		for (int i=0;i<Tab.length;i++) {
	        System.out.println(Tab[i].decrire());
		}
		Tab[0].setAuteur("Paulo Coelho");
		System.out.println("\n ---------------------\n");
		System.out.println("Voici le tableau apres les changements :");
		for (int i=0;i<Tab.length;i++) {
	        System.out.println(Tab[i].decrire());
		}
		Tab[2].setNbPages(461);
		System.out.println("\n ---------------------\n");
		System.out.println("Voici le tableau apres les changements :");
		for (int i=0;i<Tab.length;i++) {
	        System.out.println(Tab[i].decrire());
		}

	}

}
