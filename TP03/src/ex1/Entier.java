package ex1;

public class Entier {
	static int valeur=0;
	public static int factoriel(int n){
		int res = 1;
		for(int i = 1;i<=n;i++) {
			res = res*i;
		}
		return res;
}
	public static void absolu(int n) {
		if (n<0)
			System.out.println("la valeur absolue de "+n+" est "+n*(-1)); 
		else
			System.out.println("la valeur absolue de "+n+" est "+n);
	}
	public static void comparer(int e1,int e2) {
		if(e1>e2)
			System.out.println(e1+" est supérieur de "+e2);
		else if(e1<e2)
			System.out.println(e1+" est inférieur de "+e2);
		else
			System.out.println(e1+" et "+e2+" sont égaux");
	}
	public static void premier(int n) {
		for(int i = 2;i<n/2;i++) {
			if(n % i==0)
				System.out.println(n+" n'est pas premier !");
		System.out.println(n+" n'est premier !");
		}
	}
	public static int incremente() {
		return valeur++;
	}
}
