package ex2;

public class Banque {

	public static void main(String[] args) {
		Compte co1 = new Compte();
		Compte co2 = new Compte();
		co1.deposer(1200);
		co2.deposer(500);
		System.out.println("Le solde de 1er compte : "+co1.avoirSolde()+"dt");
		System.out.println("Le solde de 2eme compte : "+co2.avoirSolde()+"dt");
		co2.transferer(700, co1);
		System.out.println("Le solde de 1er compte : "+co1.avoirSolde()+"dt");
		System.out.println("Le solde de 2eme compte : "+co2.avoirSolde()+"dt");
		if(co2.avoirSolde()<0)
			System.out.println("Le compte n°"+co2.getNum()+" est en rouge avec un solde : "+co2.avoirSolde()+"dt");
		if(co1.avoirSolde()<0)
			System.out.println("Le compte n°"+co2.getNum()+" est en rouge avec un solde : "+co1.avoirSolde()+"dt");

	}

}
