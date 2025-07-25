package ex1;

public class TestClavier {

	public static void main(String[] args) {
		System.out.println("Saisir une chaine : ");
		String ch = Clavier.lireChaine();
		System.out.println("---------------------------------------------------------");
		
		System.out.println("Saisir un entier : ");
		int entier = Clavier.lireEntier();
		System.out.println("---------------------------------------------------------");
		
		System.out.println("Saisir un double : ");
		double dodo = Clavier.lireDouble();
		System.out.println("---------------------------------------------------------");
		
		System.out.println("Saisir un float : ");
		float fofo = Clavier.lireFloat();
		System.out.println("---------------------------------------------------------");
		

	}

}

