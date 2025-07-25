package ex2;

public class Factorielle {

	public static void main(String[] args) {
		try {
			int i, nbEntiers=0, factorielle=1; int ancien;

			nbEntiers= Integer.parseInt(args[0]);
			for (i=2;i<= nbEntiers;i++)
			{
			ancien = factorielle; 
			factorielle *= i;
			}

			System.out.println(" Voila la factorielle des "+ nbEntiers +" premiers entiers : "+ factorielle );
		}
		
		catch(Cas1_Exception e1){
			System.out.println("Erreur, "+ e1.alerte());
		}
		
		catch(NumberFormatException e2){
			System.out.println("Erreur, "+args+" La base de la factorielle doit être ENTIERE");
		}
		
		catch(Cas3_Exception e3){
			System.out.println("Erreur, "+ e3.alerte());
		}
		
	}
}

